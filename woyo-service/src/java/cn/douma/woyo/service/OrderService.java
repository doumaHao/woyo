package cn.douma.woyo.service;

import cn.douma.woyo.db.entity.DriverShareInfo;
import cn.douma.woyo.entity.Result;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2018-04-04
 * Time: 15:54
 */
public interface OrderService {

    /**
     * 司机发布信息
     *
     * @param idno
     * @param driverShareInfo
     * @return
     */
    DriverShareInfo shareDriverInfo(String idno, DriverShareInfo driverShareInfo);

    /**
     * 乘客预定校验
     *
     * @param idno
     * @param driverOrderId
     * @param passerOrderId
     * @param genToken
     * @return
     */
    Result passerReserveCheck(String idno, Long driverOrderId, Long passerOrderId, boolean genToken);

    /**
     * 乘客预定
     *
     * @param radomToken
     * @param idno
     * @param driverOrderId
     * @param passerOrderId
     * @return
     */
    Result passerReserve(String radomToken, String idno, Long driverOrderId, Long passerOrderId);


}
