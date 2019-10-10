package com.risesin.common.vo.resultVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author baby
 * @Description: 封装结果
 */
@Data
@ApiModel(description = "返回信息")
public class R<T> implements Serializable {

    @ApiModelProperty(value = "状态码", required = true)
    private Integer code;
    @ApiModelProperty(value = "返回消息", required = true)
    private String message;
    @ApiModelProperty("承载数据")
    private T data;

    public R() {
        this.code = RC.C200.code;
        this.message = RC.C200.title;
    }

    public R(T data) {
        this.code = RC.C200.code;
        this.message = RC.C200.title;
        this.data = data;
    }

    public R(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public R(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static R ok() {
        return new R();
    }

    public static <T> R<T> data(int code, T data, String msg) {
        return new R(code, data == null ? "暂无承载数据" : msg, data);
    }

    //错误
    public static R ER() {
        return new R(RC.C500.Code());
    }

    public static R ER(String msg) {
        return new R(RC.C500.Code(), msg, false);
    }

    public static R ER(Object data) {
        return new R(RC.C500.Code(), RC.C500.Title(), data);
    }

    public static R ER(String msg, Object data) {
        return new R(RC.C500.Code(), msg, data);
    }

    public static R ER( Integer code,String msg) {
        return new R(code, msg);
    }

}
