package com.risesin.common.vo.resultVo;
import lombok.Data;

/**
 * @author baby
 * @Description: 封装结果
 */
@Data
public class R<T> {

    private Integer errcode;
    private String message;
    private T data;

    public R() {
        this.errcode = RC.C200.code;
        this.message = RC.C200.title;
        this.data = null;
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
    //错误
    public static  R ER(String msg){
        return new R(RC.C500.Code(),msg,false);
    }
    public static  R ER(Object data){
        return new R(RC.C500.Code(),RC.C500.Title(),data);
    }
    public static  R ER(String msg,Object data){
        return new R(RC.C500.Code(),msg, data);
    }
}
