package cn.douma.woyo.constant;

import cn.douma.woyo.util.entity.CodeEnum;

/**
 * 乘客需求状态
 */
public enum PasserShareStatusEnum implements CodeEnum<String, PasserShareStatusEnum, String> {

    TYPE_0("01", "未完成"),
    TYPE_1("02", "完成");

    private String code;
    private String name;

    private PasserShareStatusEnum(String code, String name) {
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

    public static PasserShareStatusEnum getEnumByName(String name) {
        if (name == null)
            return null;
        for (PasserShareStatusEnum statusType : PasserShareStatusEnum.values()) {
            if (statusType.getName().equals(name)) {
                return statusType;
            }
        }
        return null;
    }

    public static PasserShareStatusEnum getEnumByCode(String code) {
        if (code == null)
            return null;
        for (PasserShareStatusEnum statusType : PasserShareStatusEnum.values()) {
            if (statusType.getCode().equals(code)) {
                return statusType;
            }
        }
        return null;
    }

}
