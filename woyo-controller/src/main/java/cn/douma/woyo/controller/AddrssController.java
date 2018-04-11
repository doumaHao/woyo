package cn.douma.woyo.controller;

import cn.douma.woyo.core.UserManager;
import cn.douma.woyo.db.entity.UserAddress;
import cn.douma.woyo.service.AddressService;
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
@RequestMapping("/address")
public class AddrssController {

    @Autowired
    private AddressService addressService;

    /**
     * 增加常用地址
     * @param carInfo
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public UserAddress add(UserAddress userAddress) {
        LoginUserVo loginUserVo = UserManager.getInstance().getSysUser();
        userAddress = addressService.add(loginUserVo.getUserInfo().getIdno(), userAddress);
        return userAddress;
    }

}
