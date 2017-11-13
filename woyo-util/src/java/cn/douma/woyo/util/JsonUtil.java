/*
 * Copyright (c) 2017. magfin.cn, All Rights Reserved
 * Project Name : channel
 * File Name : JsonUtil.java
 * Date : 17-5-22 上午10:12
 * Author : Steven Lee
 *
 */

package cn.douma.woyo.util;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JsonUtil {

    private final static Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    /**
     * 对象转json
     *
     * @param obj
     * @return
     */
    public static String toJsonString(Object obj) {
        if (obj == null) {
            return "";
        }
        ObjectMapper om = new ObjectMapper();
        try {
            return om.writeValueAsString(obj);
        } catch (Exception e) {
            logger.error("转Json出错", e);
            return null;
        }
    }

    /**
     * json转map
     *
     * @param json
     * @return
     */
    public static Map<String, Object> toMap(String json) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        if (json == null || "".equals(json)) {
            return map;
        }
        ObjectMapper om = new ObjectMapper();
        map = om.readValue(json, Map.class);
        return map;
    }

    /**
     * json转list
     *
     * @param json
     * @return
     * @throws IOException
     */
    public static List<LinkedHashMap<String, Object>> toList(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<LinkedHashMap<String, Object>> s = mapper.readValue(json, List.class);
        return s;
    }

    /**
     * json转object
     *
     * @param json
     * @param clazz
     * @return
     * @throws IOException
     */
    public static Object toObject(String json, Class clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Object o = mapper.readValue(json, clazz);
        return o;
    }
}
