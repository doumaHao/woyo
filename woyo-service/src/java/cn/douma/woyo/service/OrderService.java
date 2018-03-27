package cn.douma.woyo.service;

import cn.douma.woyo.db.entity.OrderInfo;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2017-11-13
 * Time: 20:48
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param orderInfo
     * @return
     */
    OrderInfo orderCreate(OrderInfo orderInfo);

    /**
     * 变更订单状态
     *
     * @param id
     * @param orderStatus
     * @return
     */
    OrderInfo updateOrderStatus(Long id, String orderStatus);

}
