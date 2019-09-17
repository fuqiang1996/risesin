package com.risesin.service.modules.comuser;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import java.util.Date;

/**
 * 通用用户日志
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "com_log")
public class ComLog implements Serializable {

    private static final long serialVersionUID = 44685911600005923L;

    /**
     * 主键ID：自动增长
     */
    @Column(name = "pk_log_id")
    @Id
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "fk_log_user_id")
    private Long userId;

    /**
     * 用户名
     */
    @Column(name = "log_username")
    private String username;

    /**
     * 用户操作
     */
    @Column(name = "log_operation")
    private String operation;

    /**
     * 响应时间
     */
    @Column(name = "log_time")
    private Long time;

    /**
     * 请求方法
     */
    @Column(name = "log_method")
    private String method;

    /**
     * 请求参数
     */
    @Column(name = "log_params")
    private String params;

    /**
     * IP地址
     */
    @Column(name = "log_ip")
    private String ip;

    /**
     * 创建时间
     */
    @Column(name = "log_addtime")
    private Date addtime;

}
