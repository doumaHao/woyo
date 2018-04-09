package cn.douma.woyo.constant;

import cn.douma.woyo.util.entity.CodeEnum;

/**
 * 订单状态
 */
public enum OrderStatusEnum implements CodeEnum<String, OrderStatusEnum, String> {

    TYPE_10("01", "待定金"),
    TYPE_11("02", "待乘运"),
    TYPE_12("03", "待支付"),
    TYPE_13("04", "待评价"),
    TYPE_14("05", "完成");

    private String code;
    private String name;

    private OrderStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getValue() {
        return this.code + "";
    }

    public static OrderStatusEnum getEnumByName(String name) {
        if (name == null)
            return null;
        for (OrderStatusEnum statusType : OrderStatusEnum.values()) {
            if (statusType.getName().equals(name)) {
                return statusType;
            }
        }
        return null;
    }

    public static OrderStatusEnum getEnumByCode(String code) {
        if (code == null)
            return null;
        for (OrderStatusEnum statusType : OrderStatusEnum.values()) {
            if (statusType.getCode().equals(code)) {
                return statusType;
            }
        }
        return null;
    }

}
