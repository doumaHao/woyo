package cn.douma.woyo.entity;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2018-04-04
 * Time: 16:08
 */
public class Result {

    private int code;
    private String info;
    private Object data;

    private Result(int code, String info, Object data) {
        this.code = code;
        this.info = info;
        this.data = data;
    }

    static public Result success(String info) {
        return new Result(0, info, null);
    }

    static public Result success(String info, Object data) {
        return new Result(0, info, data);
    }

    static public Result fail(String info) {
        return new Result(1, info, null);
    }

    static public Result fail(String info, Object data) {
        return new Result(1, info, data);
    }

    static public Result other(int code, String info, Object data) {
        return new Result(code, info, data);
    }

}
