package com.risesin.common.vo.resultVo;

public class Result {
    private boolean success;
    private Integer errcode;
    private String message;
    private Object data;

    public Result() {
    }

    public Result(boolean success, Integer code, String message) {
        this.success = success;
        this.errcode = code;
        this.message = message;
    }

    public Result(boolean success, Integer code, String message, Object data) {
        this.success = success;
        this.errcode = code;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
