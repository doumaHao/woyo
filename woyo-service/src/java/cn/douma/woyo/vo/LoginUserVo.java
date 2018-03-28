package cn.douma.woyo.vo;

import cn.douma.woyo.db.entity.UserInfo;

/**
 * 登录用户信息
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2018-03-28
 * Time: 13:57
 */
public class LoginUserVo {

    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
