package com.risesin.systemuserservice.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@Data
public class LogDO {
    /**
     * 主键ID：自动增长
     */
    private Long id;

    /**
     * 平台用户id
     */
    private Long fkLogUserId;

    /**
     * 用户名
     */
    private String logUsername;

    /**
     * 用户操作
     */
    private String logOperation;

    /**
     * 响应时间
     */
    private Long logTime;

    /**
     * 请求方法
     */
    private String logMethod;

    /**
     * 请求参数
     */
    private String logParams;

    /**
     * IP地址
     */
    private String logIp;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime addTime;
}