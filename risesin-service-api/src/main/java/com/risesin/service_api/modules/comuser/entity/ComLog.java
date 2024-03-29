package com.risesin.service_api.modules.comuser.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


/**
 * 通用用户日志
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */
@Accessors(chain = true) // 可将对象转换成链式设置值(流的形式)
@DynamicInsert // 插入或者修改时 字符串为 ''
@DynamicUpdate
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
    @Id
    @Column(name = "pk_log_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private LocalDateTime addTime;

}
