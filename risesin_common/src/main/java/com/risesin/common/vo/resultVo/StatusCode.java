package com.risesin.common.vo.resultVo;

public enum StatusCode {
    C200("200","成功"),
    C500("500","内部错误"),
    C404("404","请求地址异常"),
    C401("401","未授权"),
    C403("403","参数错误"),
    C405("405","查询不到数据"),
    C506("506","批量操作,部分成功");


    public String  title;
    public String  code;

    public String Title() {
        return title;
    }
    public String Code() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    StatusCode(String code, String title){
        this.code=code;
        this.title=title;

    }

}