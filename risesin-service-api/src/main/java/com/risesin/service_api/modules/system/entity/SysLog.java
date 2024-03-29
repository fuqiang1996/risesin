package com.risesin.service_api.modules.system.entity;

import javax.persistence.*;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * 日志对象
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */
@Accessors(chain = true)
@Setter
@Getter
@ToString
@Entity
@Table(name = "sys_log")
@DynamicInsert
@DynamicUpdate
public class SysLog implements Serializable {

    private static final long serialVersionUID = 2005545073237699356L;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_log_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 平台用户id
     */
    @Column(name = "fk_log_user_id")
    private Long fkLogUserId;

    /**
     * 用户名
     */
    @Column(name = "log_username")
    private String logUsername;

    /**
     * 用户操作
     */
    @Column(name = "log_operation")
    private String logOperation;

    /**
     * 响应时间
     */
    @Column(name = "log_time")
    private Long logTime;

    /**
     * 请求方法
     */
    @Column(name = "log_method")
    private String logMethod;

    /**
     * 请求参数
     */
    @Column(name = "log_params")
    private String logParams;

    /**
     * IP地址
     */
    @Column(name = "log_ip")
    private String logIp;

    /**
     * 创建时间
     */
    @Column(name = "log_addtime")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime addTime;

}
