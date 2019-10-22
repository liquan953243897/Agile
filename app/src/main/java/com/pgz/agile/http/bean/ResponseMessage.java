package com.pgz.agile.http.bean;

import java.io.Serializable;

public class ResponseMessage<T> implements Serializable {

    private static final long serialVersionUID = 2999784516561316773L;

    private String respCode;
    private String message;
    private T data;
    private boolean ok;

    public ResponseMessage() {
    }

    public ResponseMessage(String respCode, String message) {
        this.respCode = respCode;
        this.message = message;
    }

    public ResponseMessage(String respCode, String message, boolean ok, T data) {
        this.respCode = respCode;
        this.message = message;
        this.ok = ok;
        this.data = data;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isOk() {
        return ok;
    }
}
