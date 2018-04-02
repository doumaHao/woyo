package cn.douma.woyo.controller;

import cn.douma.woyo.core.UserManager;
import cn.douma.woyo.db.entity.CarInfo;
import cn.douma.woyo.service.CarService;
import cn.douma.woyo.vo.LoginUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2018-03-31
 * Time: 15:01
 */
@SuppressWarnings("ALL")
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    /**
     * 增加车辆信息
     * @param carInfo
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public CarInfo add(CarInfo carInfo) {
        LoginUserVo loginUserVo = UserManager.getInstance().getSysUser();
        carInfo = carService.add(loginUserVo.getUserInfo().getIdno(), carInfo);
        return carInfo;
    }

    /**
     * 修改车辆信息
     * @param carInfo
     * @return
     */
    @PostMapping("/update")
    @ResponseBody
    public CarInfo update(CarInfo carInfo) {
        carInfo = carService.update(carInfo);
        return carInfo;
    }

}
