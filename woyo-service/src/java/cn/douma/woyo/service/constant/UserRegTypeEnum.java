package cn.douma.woyo.service.constant;

/**
 * 用户注册方式
 */
public enum UserRegTypeEnum implements BaseEnum<String, UserRegTypeEnum, String> {

    TYPE_01("01", "微信公众号"),
    TYPE_02("02", "PC网页"),
    TYPE_03("03", "APP");

    private String code;
    private String name;

    private UserRegTypeEnum(String code, String name) {
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

    public static UserRegTypeEnum getEnumByName(String name) {
        if (name == null)
            return null;
        for (UserRegTypeEnum statusType : UserRegTypeEnum.values()) {
            if (statusType.getName().equals(name)) {
                return statusType;
            }
        }
        return null;
    }

    public static UserRegTypeEnum getEnumByCode(String code) {
        if (code == null)
            return null;
        for (UserRegTypeEnum statusType : UserRegTypeEnum.values()) {
            if (statusType.getCode().equals(code)) {
                return statusType;
            }
        }
        return null;
    }

}
