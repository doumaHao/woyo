package cn.douma.woyo.service;

import cn.douma.woyo.db.entity.CarInfo;
import cn.douma.woyo.db.entity.UserInfo;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2017-11-13
 * Time: 20:48
 */
public interface CarService {

    /**
     * 增加车辆信息
     *
     * @param carInfo
     * @return
     */
    CarInfo carAdd(CarInfo carInfo);

    /**
     * 修改车辆信息
     *
     * @param carInfo
     * @return
     */
    UserInfo carUpdate(CarInfo carInfo);
}
