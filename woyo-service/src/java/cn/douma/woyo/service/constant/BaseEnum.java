package cn.douma.woyo.service.constant;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2017-11-13
 * Time: 20:48
 */
public interface BaseEnum<C, T extends Enum<T> & BaseEnum<C, T, V>, V> {
    /**
     * code
     *
     * @return
     */
    public C getCode();

    /**
     * 展示名称
     *
     * @return
     */
    public String getName();

    /**
     * 值,辅助使用
     *
     * @return
     */
    public V getValue();
}
