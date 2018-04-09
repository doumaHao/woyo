package cn.douma.woyo.constant;

import cn.douma.woyo.util.entity.CodeEnum;

/**
 * 用户状态
 */
public enum UserStatusEnum implements CodeEnum<String, UserStatusEnum, String> {

    TYPE_0("0", "冻结"),
    TYPE_1("1", "生效"),
    TYPE_2("2", "注销");

    private String code;
    private String name;

    private UserStatusEnum(String code, String name) {
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

    public static UserStatusEnum getEnumByName(String name) {
        if (name == null)
            return null;
        for (UserStatusEnum statusType : UserStatusEnum.values()) {
            if (statusType.getName().equals(name)) {
                return statusType;
            }
        }
        return null;
    }

    public static UserStatusEnum getEnumByCode(String code) {
        if (code == null)
            return null;
        for (UserStatusEnum statusType : UserStatusEnum.values()) {
            if (statusType.getCode().equals(code)) {
                return statusType;
            }
        }
        return null;
    }

}
