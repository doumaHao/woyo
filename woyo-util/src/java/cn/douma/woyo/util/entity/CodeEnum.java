package cn.douma.woyo.util.entity;

/**
 * 类CodeEnum.java的实现描述：所有枚举的父接口
 *
 * @author wangpeng 2017年3月31日10:39:21
 */
public interface CodeEnum<C, T extends Enum<T> & CodeEnum<C, T, V>, V> {
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
