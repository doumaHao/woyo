package cn.douma.woyo.service.constant;

/**
 * 订单类型
 */
public enum OrderTypeEnum implements BaseEnum<String, OrderTypeEnum, String> {

    TYPE_10("01", "拼车乘客"),
    TYPE_11("02", "包车乘客"),
    TYPE_12("03", "拼车运货"),
    TYPE_13("04", "包车运货");

    private String code;
    private String name;

    private OrderTypeEnum(String code, String name) {
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

    public static OrderTypeEnum getEnumByName(String name) {
        if (name == null)
            return null;
        for (OrderTypeEnum statusType : OrderTypeEnum.values()) {
            if (statusType.getName().equals(name)) {
                return statusType;
            }
        }
        return null;
    }

    public static OrderTypeEnum getEnumByCode(String code) {
        if (code == null)
            return null;
        for (OrderTypeEnum statusType : OrderTypeEnum.values()) {
            if (statusType.getCode().equals(code)) {
                return statusType;
            }
        }
        return null;
    }

}
