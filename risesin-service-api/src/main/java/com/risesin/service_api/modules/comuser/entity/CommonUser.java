package com.risesin.service_api.modules.comuser.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "common_user")
public class CommonUser implements Serializable {

    private static final long serialVersionUID = 5128547209917754623L;
    /**
     * 主键
     */
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账户
     */
    @Column(name = "com_account")
    private String comAccount;

    /**
     * 昵称
     */
    @Column(name = "com_user_name")
    private String comUserName;

    /**
     * 所在城市
     */
    @Column(name = "com_city")
    private String comCity;

    /**
     * 所在地区
     */
    @Column(name = "com_district")
    private String comDistrict;

    /**
     * 现注册地
     */
    @Column(name = "com_live_address")
    private String comLiveAddress;

    /**
     * 创建时间
     */
    @Column(name = "com_gmt_create")
    private Date comGmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "com_gmt_modified")
    private Date comGmtModified;

    /**
     * 邮箱
     */
    @Column(name = "com_mailbox")
    private String comMailbox;

    /**
     * 密码
     */
    @Column(name = "com_password")
    private String comPassword;

    /**
     * 手机号
     */
    @Column(name = "com_phone")
    private String comPhone;

    /**
     * 所在省份
     */
    @Column(name = "com_province")
    private String comProvince;

    /**
     * 性别
     */
    @Column(name = "com_sex")
    private String comSex;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "com_del_flag")
    private Long delFlag;

    /**
     * 部门ID
     */
    @Column(name = "fk_com_dept_id")
    private Long fkComDeptId;

    /**
     * 微信授权标识
     */
    @Column(name = "com_open_id")
    private String comOpenId;

    /**
     * 二维码登陆标识
     */
    @Column(name = "com_qruuid")
    private String comQruuid;

}
