package com.risesin.service_api.modules.entuser.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 企业用户
 *
 * @Description
 * @Author honey
 * @Date 2019-09-16
 */
@Accessors(chain = true) // 可将对象转换成链式设置值(流的形式)
@DynamicInsert // 插入或者修改时 字符串为 ''
@DynamicUpdate
@Setter
@Getter
@ToString
@Entity
@Table(name = "enterprise_user")
public class EnterpriseUser implements Serializable {

    private static final long serialVersionUID = 3793933486744833315L;

    /**
     * 主键ID
     */
    @Id
    @Column(name = "pk_ent_user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 手机号
     */
    @Column(name = "ent_phone")
    private String phone;
    /**
     * 用户名
     */
    @Column(name = "ent_username")
    private String username;
    /**
     * 登陆密码
     */
    @Column(name = "ent_password")
    private String password;
    /**
     * 微信用户标识openid
     */
    @Column(name = "ent_open_id")
    private String openId;
    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "ent_delflag")
    private Long delFlag;
    /**
     * 创建时间
     */
    @Column(name = "ent_addtime")
    private LocalDateTime addTime;
    /**
     * 修改时间
     */
    @Column(name = "ent_lastmodify")
    private LocalDateTime lastModify;
    /**
     * 创建人
     */
    @Column(name = "ent_create_user")
    private String createUser;
    /**
     * 修改人
     */
    @Column(name = "ent_update_user")
    private String updateUser;
    /**
     * 账户
     */
    @Column(name = "ent_account")
    private String account;
    /**
     * 公司名称
     */
    @Column(name = "ent_companyname")
    private String companyName;

}
