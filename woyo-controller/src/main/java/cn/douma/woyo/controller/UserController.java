package cn.douma.woyo.controller;

import cn.douma.woyo.db.entity.UserInfo;
import cn.douma.woyo.service.UserService;
import cn.douma.woyo.util.AccessControlUtil;
import cn.douma.woyo.vo.LoginUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletResponse;

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

    @GetMapping("/checkLoginExist")
    public String findUserInfoByLogin(String login, ServletResponse response) {
        AccessControlUtil.accessControl(response);
        if (userService.checkLoginExist(login)) {
            return "0001";
        } else {
            return "0000";
        }
    }

    /**
     * 用户注册
     *
     * @param regMethod
     * @param userInfo
     * @return
     */
    @PostMapping("/register")
    @ResponseBody
    public UserInfo register(String regMethod, UserInfo userInfo, ServletResponse response) {
        AccessControlUtil.accessControl(response);
        userInfo = userService.register(regMethod, userInfo);
        return userInfo;
    }

    /**
     * 用户登录
     *
     * @param login
     * @param password
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public LoginUserVo login(String login, String password, ServletResponse response) {
        AccessControlUtil.accessControl(response);
        LoginUserVo loginUserVo = userService.loginByPassword(login, password);
        return loginUserVo;
    }

    /**
     * 注销登录
     *
     * @return
     */
    @PostMapping("/logout")
    @ResponseBody
    public String logout(ServletResponse response) {
        AccessControlUtil.accessControl(response);
        userService.userLogout();
        return "true";
    }
}
