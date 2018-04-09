package cn.douma.woyo.constant;

import cn.douma.woyo.util.entity.CodeEnum;

/**
 * 车辆种类
 */
public enum CarTypeEnum implements CodeEnum<String, CarTypeEnum, String> {

    TYPE_01("01", "轿车"),
    TYPE_02("02", "SUV"),
    TYPE_03("03", "MPV"),
    TYPE_04("04", "大巴"),
    TYPE_05("05", "货车");

    private String code;
    private String name;

    private CarTypeEnum(String code, String name) {
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

    public static CarTypeEnum getEnumByName(String name) {
        if (name == null)
            return null;
        for (CarTypeEnum statusType : CarTypeEnum.values()) {
            if (statusType.getName().equals(name)) {
                return statusType;
            }
        }
        return null;
    }

    public static CarTypeEnum getEnumByCode(String code) {
        if (code == null)
            return null;
        for (CarTypeEnum statusType : CarTypeEnum.values()) {
            if (statusType.getCode().equals(code)) {
                return statusType;
            }
        }
        return null;
    }

}
