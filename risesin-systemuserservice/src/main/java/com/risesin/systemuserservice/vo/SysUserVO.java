package com.risesin.systemuserservice.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>系统用户VO对象</p>
 *
 * @author : honey
 * @date : 2019-09-27 14:35
 **/
@Data
public class SysUserVO {

    /**
     * 账户
     */
    @ApiModelProperty(value = "账户")
    private String account;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    private String userName;

    /**
     * 所在城市
     */
    @ApiModelProperty(value = "所在城市")
    private String city;

    /**
     * 所在地区
     */
    @ApiModelProperty(value = "所在地区")
    private String district;

    /**
     * 现注册地
     */
    @ApiModelProperty(value = "现注册地")
    private String liveAddress;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private LocalDateTime lastModify;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String mailbox;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 所在省份
     */
    @ApiModelProperty(value = "所在省份")
    private String province;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private String sex;

    /**
     * 状态 0:禁用，1:正常
     */
    @ApiModelProperty(value = "状态 0:禁用，1:正常")
    private Long status;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @ApiModelProperty(value = "是否删除  -1：已删除  0：正常")
    private Long delFlag;

    /**
     * 部门ID
     */
    @ApiModelProperty(value = "部门ID")
    private Long deptId;

    /**
     * 微信授权标识
     */
    @ApiModelProperty(value = "微信授权标识")
    private String openId;

    /**
     * 二维码登陆标识
     */
    @ApiModelProperty(value = "二维码登陆标识")
    private String qruuid;

    /**
     * 主键ID：自动增长
     */
    @ApiModelProperty(value = "主键ID")
    private Long id;
}
