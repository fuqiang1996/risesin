package com.risesin.common.exception;

import com.risesin.common.vo.resultVo.RC;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/10
 * @DESCRIPTION 异常类
 * @since 1.0.0
 */
@Data
public class GlobalException extends RuntimeException{
    private  Integer  errcode;// 错误编码
    private  String  errmsg;//信息描述

    public GlobalException(){
        super();
        this.errmsg = RC.C500.title;
        this.errcode = RC.C500.code;
    }

    public GlobalException(String errmsg){
        super(errmsg);
        this.errmsg = errmsg;
        this.errcode = RC.C500.code;
    }

    public GlobalException(Integer errcode ,String errmsg ){
        super(errmsg);
        this.errmsg = errmsg;
        this.errcode = errcode;
    }

    public GlobalException(String errmsg , Throwable e){
        super(errmsg,e);
        this.errmsg = errmsg;
        this.errcode = RC.C500.code;
    }

    public GlobalException(Integer errcode , String errmsg ,  Throwable e){
        super(errmsg,e);
        this.errmsg = errmsg;
        this.errcode = errcode;
    }

    public GlobalException(RC rc){
        super(rc.title);
        this.errmsg = rc.title;
        this.errcode = rc.code;
    }

    public GlobalException(RC rc , Throwable e){
        super(rc.title,e);
        this.errmsg = rc.title;
        this.errcode = rc.code;
    }
}
