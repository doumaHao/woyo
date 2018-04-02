package cn.douma.woyo.controller;

import cn.douma.woyo.db.entity.UserInfo;
import cn.douma.woyo.service.UserService;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @ResponseBody
    public UserInfo register(String regMethod, UserInfo userInfo) {
        System.out.println("<<<<<<进来");
        userInfo = userService.register(regMethod, userInfo);
        System.out.println("<<<<<<出去");
        return userInfo;
    }
}
