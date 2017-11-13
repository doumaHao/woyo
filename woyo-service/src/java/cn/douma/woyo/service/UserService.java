package cn.douma.woyo.service;

import cn.douma.woyo.db.entity.UserInfo;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2017-11-13
 * Time: 20:48
 */
public interface UserService {

    /**
     * 用户注册
     *
     * @param userInfo
     * @return
     */
    UserInfo UserRegister(UserInfo userInfo);
}
