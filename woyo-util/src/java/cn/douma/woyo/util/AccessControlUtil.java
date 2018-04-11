package cn.douma.woyo.util;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * 跨域问题Util
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2018-04-11
 * Time: 21:11
 */
public class AccessControlUtil {

    /**
     * 设置可以跨域
     * @param response
     */
    public static void accessControl(ServletResponse response) {
        if (response != null) {
            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
            //这里填写你允许进行跨域的主机ip
            httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
            //允许的访问方法
            httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH");
            //Access-Control-Max-Age 用于 CORS 相关配置的缓存
            httpServletResponse.setHeader("Access-Control-Max-Age", "3600");
            httpServletResponse.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        }
    }

}
