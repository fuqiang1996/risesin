package com.risesin.common.vo.resultVo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author baby
 * @Description: 封装结果
 */
@Data
public class R<T> extends HashMap<String, Object> {

    @ApiModelProperty(value = "错误状态码", required = true)
    private Integer errcode;
    @ApiModelProperty(value = "返回消息", required = true)
    private String message;
    @ApiModelProperty("承载数据")
    private T data;

    public R() {
        this.errcode = RC.C200.code;
        this.message = RC.C200.title;
    }

    public R(T data) {
        this.errcode = RC.C200.code;
        this.message = RC.C200.title;
        this.data = data;
    }

    public R(Integer code, String message) {
        this.errcode = code;
        this.message = message;
    }

    public R(Integer code, String message, T data) {
        this.errcode = code;
        this.message = message;
        this.data = data;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public static <T> R<T> data(int code, T data, String msg) {
        return new R(code, data == null ? "暂无承载数据" : msg, data);
    }

    //错误
    public static R ER(String msg) {
        return new R(RC.C500.Code(), msg, false);
    }

    public static R ER(Object data) {
        return new R(RC.C500.Code(), RC.C500.Title(), data);
    }

    public static R ER(String msg, Object data) {
        return new R(RC.C500.Code(), msg, data);
    }

    public static R error() {
        return error(RC.C500.Code(), "操作失败");
    }

    public static R error(String msg) {
        return error(RC.C500.Code(), msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }
}
