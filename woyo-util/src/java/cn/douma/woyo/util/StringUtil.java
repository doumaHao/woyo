package cn.douma.woyo.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class StringUtil {

    /**
     * 字符串转换为字符串数组
     *
     * @param str
     * @return
     */
    public static String[] toStringArray(String str) {
        if (str == null) {
            return null;
        }

        char[] charArray = str.toCharArray();
        String[] resultStr = new String[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            resultStr[i] = String.valueOf(charArray[i]);
        }
        return resultStr;
    }

    public static String joinCharForSql(String str) {
        if (str == null || str.trim().length() == 0) {
            return null;
        }

        char[] charArray = str.toCharArray();
        StringBuilder resultStr = new StringBuilder();
        resultStr.append("%");
        for (int i = 0; i < charArray.length; i++) {
            resultStr.append(charArray[i]);
            resultStr.append("%");
        }
        return resultStr.toString();
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isBlank(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String getStrBylength(String str, int len) {
        if (null == str)
            return "";
        try {
            int sl = str.getBytes().length;
            if (sl > len) {
                StringBuffer sb = new StringBuffer();
                char[] arr = str.toCharArray();
                int length = 0;

                for (int i = 0; i < arr.length; i++) {
                    length += String.valueOf(arr[i]).getBytes().length >= 2 ? 2
                            : 1;
                    if (length <= len) {
                        sb.append(arr[i]);
                    } else {
                        break;
                    }
                }

                return sb.append("...").toString();
            } else {
                return str;
            }
        } catch (Exception e) {

        }
        return "";
    }

    public static String getTodayStr() {
        Calendar d = Calendar.getInstance();
        StringBuffer sb = new StringBuffer();
        String m = String.valueOf(d.get(Calendar.MONTH) + 1);
        if (m.length() == 1) {
            m = "0" + m;
        }
        String dt = String.valueOf(d.get(Calendar.DAY_OF_MONTH));
        if (dt.length() == 1) {
            dt = "0" + dt;
        }
        sb.append(d.get(Calendar.YEAR)).append(m).append(dt);
        return sb.toString();
    }

    /**
     * 截取文件名（例如：文件名为test.txt）的扩展名（截取后的扩展名就为.txt）
     *
     * @param fileName
     * @return
     */
    public static String getFileExtension(String fileName) {
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(fileName.lastIndexOf("."));
        } else {
            return "";
        }
    }

    /**
     * 截取文件名（例如：文件名为test.txt）的名称（截取后的文件名称就为test）
     *
     * @param fileName
     * @return
     */
    public static String getFlieName(String fileName) {
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(0, fileName.lastIndexOf("."));
        } else {
            return "";
        }
    }

    /**
     * 生成随机字符串
     *
     * @param length (表示生成字符串的长度)
     * @return
     */
    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 生成阿拉伯数字格式的随机字符串
     *
     * @param length
     * @return
     */
    public static String getRandomStringForNum(int length) {
        String base = "0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 以","拆分字符串，返回字符串数组
     *
     * @param str
     * @return
     */
    public static String[] splitString(String str) {
        if (str == null) {
            return null;
        }
        return str.split(",");
    }

    /**
     * 以","拆分字符串，返回List
     *
     * @param str
     * @return
     */
    public static List splitStringToList(String str) {
        if (str == null) {
            return null;
        }
        List strList = new ArrayList();
        String[] strArray = splitString(str);
        for (int i = 0; i < strArray.length; i++) {
            strList.add(strArray[i]);
        }
        return strList;
    }

    /**
     * 以"/"拆分字符串，返回字符串数组
     *
     * @param str
     * @return
     */
    public static String[] splitStringBySingleSlash(String str) {
        if (str == null) {
            return null;
        }
        return str.split("/");
    }

    public static String[] splitStringBySingleSlash1(String str) {
        if (str == "") {
            return null;
        }
        return splitStringBySingleSlash(str);
    }

    /**
     * 以splitFlag拆分字符串，返回字符串数组
     *
     * @param str
     * @param splitFlag
     * @return
     */
    public static String[] splitStringBySplitFlag(String str, String splitFlag) {
        if (str == null) {
            return null;
        }
        return str.split(splitFlag);
    }

    /**
     * 根据字符串的前n个单位，把字符串截取成两部分，存为字符串数组
     *
     * @param str   要截取的字符串
     * @param index 前n个单元
     * @return
     */
    public static String[] subStringByIndex(String str, int index) {
        String[] strs = new String[2];
        strs[0] = str.substring(0, index);
        strs[1] = str.substring(index);
        return strs;
    }

    /**
     * object转化为字符串，如果为空则返回null
     *
     * @param object
     * @return
     */
    public static String getString(Object object) {
        return object != null ? object.toString() : null;
    }

}
