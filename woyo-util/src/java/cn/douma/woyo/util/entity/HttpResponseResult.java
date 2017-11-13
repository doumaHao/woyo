package cn.douma.woyo.util.entity;

/**
 * Created by admin on 2017/7/27.
 */
public class HttpResponseResult {

    static public int OK = 200;

    private int code;

    private String responseMsg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }
}
