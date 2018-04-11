package cn.douma.woyo.service.impl;

import cn.douma.woyo.db.dao.CarInfoMapper;
import cn.douma.woyo.db.entity.CarInfo;
import cn.douma.woyo.exception.CheckException;
import cn.douma.woyo.service.CarService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2018-03-28
 * Time: 17:29
 */
@SuppressWarnings("ALL")
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarInfoMapper carInfoMapper;

    @Override
    public CarInfo add(String idno, CarInfo carInfo) {
        String carNo = carInfo.getCarNo();
        String carType = carInfo.getCarType();
        if (StringUtils.isNotBlank(idno)
                || StringUtils.isNotBlank(carNo)
                || StringUtils.isNotBlank(carType)) {
            throw new CheckException("身份证号、车牌号和车辆种类均不可为空");
        }
        carInfo.setIdno(idno);
        carInfoMapper.insert(carInfo);
        return carInfo;
    }

    @Override
    public CarInfo update(CarInfo carInfo) {
        if (carInfo.getId() == null) {
            throw new CheckException("更新车辆信息出错");
        }
        carInfoMapper.updateByPrimaryKey(carInfo);
        return carInfo;
    }

}
