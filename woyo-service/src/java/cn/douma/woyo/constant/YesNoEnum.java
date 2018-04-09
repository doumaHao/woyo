package cn.douma.woyo.constant;

import cn.douma.woyo.util.entity.CodeEnum;

/**
 * 是否状态
 */
public enum YesNoEnum implements CodeEnum<String, YesNoEnum, String> {

    TYPE_1("1", "是"),
    TYPE_0("0", "否");

    private String code;
    private String name;

    private YesNoEnum(String code, String name) {
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

    public static YesNoEnum getEnumByName(String name) {
        if (name == null)
            return null;
        for (YesNoEnum statusType : YesNoEnum.values()) {
            if (statusType.getName().equals(name)) {
                return statusType;
            }
        }
        return null;
    }

    public static YesNoEnum getEnumByCode(String code) {
        if (code == null)
            return null;
        for (YesNoEnum statusType : YesNoEnum.values()) {
            if (statusType.getCode().equals(code)) {
                return statusType;
            }
        }
        return null;
    }

}
