package com.ssthouse.petorhuman.rtrofit;

/**
 * Created by ssthouse on 2015/12/5.
 */
public class ApiResult<T> {
    private T data;
    private String msg;
    private int code;
    private int msg_show;

    public int getCode() {
        return code;
    }

    public int getMsg_show() {
        return msg_show;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}

