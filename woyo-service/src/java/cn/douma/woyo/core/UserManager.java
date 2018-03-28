package cn.douma.woyo.core;

import cn.douma.woyo.vo.LoginUserVo;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2018-03-28
 * Time: 13:54
 */
public class UserManager {

    public static final String USER_INFO_KEY = "user_info";
    private static UserManager instance = new UserManager();

    private UserManager() {

    }

    public static UserManager getInstance() {
        return instance;
    }

    private Map<String, LoginUserVo> map = new HashMap<String, LoginUserVo>();

    public void addSysUser(LoginUserVo loginUserVo) {
        HttpSession session = getHttpSession();
        session.setAttribute(USER_INFO_KEY, loginUserVo);
    }

    public LoginUserVo getSysUser() {
        HttpSession session = getHttpSession();
        return (LoginUserVo) session.getAttribute(USER_INFO_KEY);
    }

    public void removeSysUser() {
        HttpSession session = getHttpSession();
        session.removeAttribute(USER_INFO_KEY);
    }

    private HttpSession getHttpSession() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request.getSession();
    }

    public Collection<LoginUserVo> getAllSysUser() {
        return map.values();
    }

}
