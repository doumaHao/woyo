package cn.douma.woyo.util;

import cn.douma.woyo.util.entity.CodeEnum;
import org.apache.commons.lang.StringUtils;

public class EnumUtil {

    /**
     * 根据code和枚举对象获取value
     *
     * @param code
     * @param codeEnum
     */
    static public String getValue(String code, CodeEnum[] codeEnum) {
        String value = null;
        if (codeEnum != null && codeEnum.length > 0
                && StringUtils.isNotBlank(code)) {
            for (CodeEnum c : codeEnum) {
                if (code.equals(c.getCode())) {
                    value = c.getName();
                }
            }
        }
        return value;
    }

    /**
     * 根据value和枚举对象获取key
     *
     * @param value
     * @param codeEnum
     * @return
     */
    static public String getKey(String value, CodeEnum[] codeEnum) {
        String key = null;
        if (codeEnum != null && codeEnum.length > 0
                && StringUtils.isNotBlank(value)) {
            for (CodeEnum c : codeEnum) {
                if (value.equals(c.getName())) {
                    key = c.getCode().toString();
                }
            }
        }
        return key;
    }
}
