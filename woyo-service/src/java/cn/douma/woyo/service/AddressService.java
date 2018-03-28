package cn.douma.woyo.service;

import cn.douma.woyo.db.entity.UserAddress;

import java.util.List;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2018-03-28
 * Time: 17:55
 */
public interface AddressService {

    /**
     * 客户增加常用地址
     *
     * @param idno
     * @param userAddress
     * @return
     */
    UserAddress add(String idno, UserAddress userAddress);

    /**
     * 获取客户全部常用地址
     *
     * @param idno
     * @return
     */
    List<UserAddress> listForIdno(String idno);

    /**
     * 获取客户前N常用地址
     *
     * @param idno
     * @return
     */
    List<UserAddress> listForIdno(String idno, int count);

}
