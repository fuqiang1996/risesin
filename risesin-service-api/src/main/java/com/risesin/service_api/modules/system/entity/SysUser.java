package com.risesin.service_api.modules.system.entity;

import javax.persistence.*;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * 系统用户
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */
@Accessors(chain = true)
@Data
@Entity
@Table(name = "sys_user")
@DynamicInsert
//@DynamicUpdate
public class SysUser implements Serializable {

    private static final long serialVersionUID = 7730308612614635076L;

    /**
     * 账户
     */
    @Column(name = "sys_account")
    @ApiModelProperty("账户")
    private String account;

    /**
     * 昵称
     */
    @Column(name = "sys_user_name")
    @ApiModelProperty("昵称")
    private String userName;

    /**
     * 所在城市
     */
    @Column(name = "sys_city")
    @ApiModelProperty("所在城市")
    private String city;

    /**
     * 所在地区
     */
    @Column(name = "sys_district")
    @ApiModelProperty(value = "所在地区")
    private String district;

    /**
     * 现注册地
     */
    @Column(name = "sys_live_address")
    @ApiModelProperty(value = "现注册地")
    private String liveAddress;

    /**
     * 创建时间
     */
    @Column(name = "sys_gmt_create")
    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime addTime;

    /**
     * 修改时间
     */
    @Column(name = "sys_gmt_modified")
    @ApiModelProperty(value = "修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 接受前台的时间格式，传到后台格式
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台的时间格式化,发送到前台
    private LocalDateTime lastModify;

    /**
     * 邮箱
     */
    @Column(name = "sys_mailbox")
    @ApiModelProperty(value = "邮箱")
    private String mailbox;

    /**
     * 密码
     */
    @Column(name = "sys_password")
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 手机号
     */
    @Column(name = "sys_phone")
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 所在省份
     */
    @Column(name = "sys_province")
    @ApiModelProperty(value = "所在省份")
    private String province;

    /**
     * 性别
     */
    @Column(name = "sys_sex")
    @ApiModelProperty(value = "性别")
    private String sex;

    /**
     * 状态 0:禁用，1:正常
     */
    @Column(name = "sys_status")
    @ApiModelProperty(value = "状态 0:禁用，1:正常")
    private Long status;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "sys_del_flag")
    @ApiModelProperty(value = "是否删除  -1：已删除  0：正常")
    private Long delFlag;

    /**
     * 部门ID
     */
    @Column(name = "fk_dept_id")
    @ApiModelProperty(value = "部门ID")
    private Long deptId;

    /**
     * 微信授权标识
     */
    @Column(name = "sys_open_id")
    @ApiModelProperty(value = "微信授权标识")
    private String openId;

    /**
     * 二维码登陆标识
     */
    @Column(name = "sys_qruuid")
    @ApiModelProperty(value = "二维码登陆标识")
    private String qruuid;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "主键ID")
    private Long id;

}
