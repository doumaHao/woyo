package cn.douma.woyo.service;

import cn.douma.woyo.db.entity.UserInfo;
import cn.douma.woyo.vo.LoginUserVo;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2017-11-13
 * Time: 20:48
 */
public interface UserService {

    boolean checkLoginExist(String login);

    /**
     * 根据登录名获取用户信息
     *
     * @param login
     * @return
     */
    UserInfo findUserInfoByLogin(String login);

    /**
     * 注册用户
     *
     * @param regMethod
     * @param userInfo
     * @return
     */
    UserInfo register(String regMethod, UserInfo userInfo);

    /**
     * 微信公众号注册用户
     *
     * @param userInfo
     * @return
     */
    UserInfo registerByWeixin(UserInfo userInfo);

    /**
     * PC注册用户
     *
     * @param userInfo
     * @return
     */
    UserInfo registerByPc(UserInfo userInfo);

    /**
     * APP注册用户
     *
     * @param userInfo
     * @return
     */
    UserInfo registerByApp(UserInfo userInfo);

    /**
     * 根据用户名密码登录
     *
     * @param login
     * @param password
     * @return
     */
    LoginUserVo loginByPassword(String login, String password);

    /**
     * 用户注销登录
     *
     * @return
     */
    boolean userLogout();
}
