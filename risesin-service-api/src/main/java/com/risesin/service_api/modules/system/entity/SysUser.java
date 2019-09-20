package com.risesin.service_api.modules.system.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

/**
 * 系统用户
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
@Table(name = "sys_user")
@DynamicInsert
@DynamicUpdate
public class SysUser implements Serializable {

    private static final long serialVersionUID = 7730308612614635076L;

    /**
     * 账户
     */
    @Column(name = "sys_account")
    private String account;

    /**
     * 昵称
     */
    @Column(name = "sys_user_name")
    private String userName;

    /**
     * 所在城市
     */
    @Column(name = "sys_city")
    private String city;

    /**
     * 所在地区
     */
    @Column(name = "sys_district")
    private String district;

    /**
     * 现注册地
     */
    @Column(name = "sys_live_address")
    private String liveAddress;

    /**
     * 创建时间
     */
    @Column(name = "sys_gmt_create")
    private Date addTime;

    /**
     * 修改时间
     */
    @Column(name = "sys_gmt_modified")
    private Date lastModify;

    /**
     * 邮箱
     */
    @Column(name = "sys_mailbox")
    private String mailbox;

    /**
     * 密码
     */
    @Column(name = "sys_password")
    private String password;

    /**
     * 手机号
     */
    @Column(name = "sys_phone")
    private String phone;

    /**
     * 所在省份
     */
    @Column(name = "sys_province")
    private String sprovince;

    /**
     * 性别
     */
    @Column(name = "sys_sex")
    private String sex;

    /**
     * 状态 0:禁用，1:正常
     */
    @Column(name = "sys_status")
    private Long status;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "sys_del_flag")
    private Long delFlag;

    /**
     * 部门ID
     */
    @Column(name = "fk_com_dept_id")
    private Long comDeptId;

    /**
     * 微信授权标识
     */
    @Column(name = "sys_open_id")
    private String openId;

    /**
     * 二维码登陆标识
     */
    @Column(name = "sys_qruuid")
    private String qruuid;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
