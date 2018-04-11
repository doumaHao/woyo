package cn.douma.woyo.service.impl;

import cn.douma.woyo.constant.CarTypeEnum;
import cn.douma.woyo.constant.PasserShareStatusEnum;
import cn.douma.woyo.constant.YesNoEnum;
import cn.douma.woyo.db.dao.*;
import cn.douma.woyo.db.entity.*;
import cn.douma.woyo.entity.Result;
import cn.douma.woyo.exception.CheckException;
import cn.douma.woyo.service.OrderService;
import cn.douma.woyo.util.*;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2018-04-04
 * Time: 15:56
 */
@SuppressWarnings("ALL")
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private DriverShareInfoMapper driverShareInfoMapper;
    @Autowired
    private PasserShareInfoMapper passerShareInfoMapper;
    @Autowired
    private CarInfoMapper carInfoMapper;
    @Autowired
    private DriverOrderMapper driverOrderMapper;
    @Autowired
    private PasserOrderMapper passerOrderMapper;

    private volatile ConcurrentSkipListSet concurrentSkipListSet;

    @Override
    public DriverShareInfo shareDriverInfo(String idno, DriverShareInfo driverShareInfo) {
        if (StringUtils.isBlank(idno)
                || driverShareInfo == null
                || StringUtils.isBlank(driverShareInfo.getCarNo())) {
            throw new CheckException("身份证号、车牌号和发布信息不能为空");
        }
        driverShareInfo.setIdno(idno);
        driverShareInfoMapper.insert(driverShareInfo);
        return driverShareInfo;
    }

    @Override
    public Result passerReserveCheck(String idno, Long driverOrderId, Long passerOrderId, boolean genToken) {
        List<String> infoList = new ArrayList<String>();
        if (driverOrderId == null) {
            throw new CheckException("司机需求信息未知");
        }
        DriverShareInfo driverShareInfo = driverShareInfoMapper.selectByPrimaryKey(driverOrderId);
        if (driverShareInfo == null) {
            throw new CheckException("司机需求信息未知");
        }
        if (driverShareInfo.getRemainderSeat() < 1) {
            throw new CheckException("司机车辆剩余座位数为0,不可订单");
        }
        if (YesNoEnum.TYPE_1.getCode().equals(driverShareInfo.getCompleteFlg())) {
            throw new CheckException("司机需求状态已完成,不可下单");
        }
        if (passerOrderId != null) {
            PasserShareInfo passerShareInfo = passerShareInfoMapper.selectByPrimaryKey(passerOrderId);
            if (passerShareInfo == null) {
                throw new CheckException("传入的乘客需求信息为空");
            }
            if (PasserShareStatusEnum.TYPE_0.getCode().equals(passerShareInfo.getNeedStatus())) {
                throw new CheckException("乘客需求状态已完成,不可下单");
            }
            if (passerShareInfo.getCarType() != null) {
                CarInfoExample carInfoExample = new CarInfoExample();
                carInfoExample.createCriteria()
                        .andCarNoEqualTo(driverShareInfo.getCarNo());
                List<CarInfo> carInfoList = carInfoMapper.selectByExample(carInfoExample);
                if (ListUtil.isEmpty(carInfoList)) {
                    throw new CheckException("司机车辆信息为空");
                }
                String carType = carInfoList.get(0).getCarType();
                if (!passerShareInfo.getCarType().equals(carType)) {
                    infoList.add("不符您的车辆种类需求：您需求的是" +
                            EnumUtil.getValue(passerShareInfo.getCarType(), CarTypeEnum.values()) +
                            ",司机车种是" + EnumUtil.getValue(carType, CarTypeEnum.values())
                    );
                }
            }
            if (passerShareInfo.getNeedSeat() != null) {
                if (driverShareInfo.getRemainderSeat() - passerShareInfo.getNeedSeat() < 0) {
                    infoList.add("不符您的座位数需求：您需求" + passerShareInfo.getNeedSeat() +
                            "个座位,但是司机只剩余" + driverShareInfo.getRemainderSeat() + "个座位了");
                }
            }
            if (passerShareInfo.getNeedTime() != null
                    && driverShareInfo.getSetoffTime() == null) {
                //乘客出发比司机发车晚
                boolean isLate = true;
                Date date1 = null;
                Date date2 = null;
                if (passerShareInfo.getNeedTime().getTime() - driverShareInfo.getSetoffTime().getTime() > 0) {
                    isLate = true;
                    date1 = driverShareInfo.getSetoffTime();
                    date2 = passerShareInfo.getNeedTime();
                } else {
                    isLate = false;
                    date1 = passerShareInfo.getNeedTime();
                    date2 = driverShareInfo.getSetoffTime();
                }
                int lateHours = DateUtil.hoursBetween(date1, date2);
                infoList.add("不符您的出发时间需求：比您的出发时间" + (isLate ? "早" : "晚") + "了" + lateHours + "小时");
            }
        }
        String radomToken = null;
        if (genToken) {
            radomToken = MD5Util.MD5(IdGen.randomString(30));
            synchronized (this) {
                if (concurrentSkipListSet == null) {
                    concurrentSkipListSet = new ConcurrentSkipListSet<String>();
                }
                concurrentSkipListSet.add(radomToken);
            }
        }
        if (ListUtil.isNotEmpty(infoList)) {
            String info = "";
            for (int i = 1; i <= infoList.size(); i++) {
                info += "(" + i + ")" + infoList.get(i - 1) + "<br>";
            }
            return Result.fail(info, radomToken);
        } else {
            return Result.success("符合需求", radomToken);
        }
    }

    @Override
    public Result passerReserve(String radomToken, String idno, Long driverOrderId, Long passerOrderId) {
        if (StringUtils.isBlank(radomToken)) {
            throw new CheckException("token异常");
        }
        if (concurrentSkipListSet.contains(radomToken)) {
            concurrentSkipListSet.remove(radomToken);
        } else {
            throw new CheckException("token异常");
        }
        try {
            this.passerReserveCheck(idno, driverOrderId, passerOrderId, false);
        } catch (Exception e) {
            throw new CheckException(e.getMessage());
        }
        DriverShareInfo driverShareInfo = driverShareInfoMapper.selectByPrimaryKey(driverOrderId);
        PasserShareInfo passerShareInfo = passerShareInfoMapper.selectByPrimaryKey(passerOrderId);
        //乘客有需求信息下单
        if (passerShareInfo != null) {
            //司机需求表信息更新
            driverShareInfo.setRemainderSeat(driverShareInfo.getRemainderSeat() - passerShareInfo.getNeedSeat());
            if (driverShareInfo.getRemainderSeat() <= 0) {
                driverShareInfo.setCompleteFlg(YesNoEnum.TYPE_0.getCode());
            }
            //乘客需求表信息更新
            passerShareInfo.setNeedStatus(PasserShareStatusEnum.TYPE_1.getCode());
            //司机订单表
            DriverOrder driverOrder = new DriverOrder();
            driverOrder.setDriverShareId(driverOrderId);
            driverOrder.setPasserShareId(passerOrderId);
            driverOrder.setConsumeSeat(passerShareInfo.getNeedSeat());
//            driverOrder.setOrderPrice(driverShareInfo.getUnitPrice(). passerShareInfo.getNeedSeat()*);
            driverOrderMapper.insert(driverOrder);
        } else {
        }


        return null;
    }


}
