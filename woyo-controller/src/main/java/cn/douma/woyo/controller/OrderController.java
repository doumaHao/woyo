package cn.douma.woyo.controller;

import cn.douma.woyo.core.UserManager;
import cn.douma.woyo.db.entity.DriverShareInfo;
import cn.douma.woyo.service.OrderService;
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
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 司机发布信息
     *
     * @param driverShareInfo
     * @return
     */
    @PostMapping("/driverRelease")
    @ResponseBody
    public DriverShareInfo driverRelease(DriverShareInfo driverShareInfo) {
        LoginUserVo loginUserVo = UserManager.getInstance().getSysUser();
        driverShareInfo = orderService.shareDriverInfo(loginUserVo.getUserInfo().getIdno(), driverShareInfo);
        return driverShareInfo;
    }

    /**
     * 乘客预定
     *
     * @return
     */
    @PostMapping("/passerReserve")
    @ResponseBody
    public DriverShareInfo passerReserve(Long passerOrderId) {
        LoginUserVo loginUserVo = UserManager.getInstance().getSysUser();
//        driverShareInfo = orderService.shareDriverInfo(loginUserVo.getUserInfo().getIdno(), driverShareInfo);
//        return driverShareInfo;
        return null;
    }


}
