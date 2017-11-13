package cn.douma.woyo.util;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    /**
     * 判断list是否为空
     *
     * @param list
     * @return
     */
    static public boolean isEmpty(List list) {
        if (list != null && list.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 判断list是否不为空
     *
     * @param list
     * @return
     */
    static public boolean isNotEmpty(List list) {
        if (list != null && list.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 字符串list去重
     *
     * @param list
     * @return
     */
    static public List<String> deDuplicationForString(List<String> list) {
        if (isEmpty(list)) {
            return list;
        }
        List<String> newList = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (!newList.contains(list.get(i))) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
