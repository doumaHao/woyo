package cn.douma.woyo.service.constant;

/**
 * 性别类型
 */
public enum SexEnum implements BaseEnum<String, SexEnum, String> {

    MAN("1", "男"),
    WOMAN("2", "女");

    private String code;
    private String name;

    private SexEnum(String code, String name) {
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

    public static SexEnum getEnumByName(String name) {
        if (name == null)
            return null;
        for (SexEnum statusType : SexEnum.values()) {
            if (statusType.getName().equals(name)) {
                return statusType;
            }
        }
        return null;
    }

    public static SexEnum getEnumByCode(String code) {
        if (code == null)
            return null;
        for (SexEnum statusType : SexEnum.values()) {
            if (statusType.getCode().equals(code)) {
                return statusType;
            }
        }
        return null;
    }

}
