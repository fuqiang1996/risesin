package com.risesin.service.modules.sysuser;

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
 * @Description  
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="sys_user" )
public class SysUser  implements Serializable {

	private static final long serialVersionUID =  7730308612614635076L;

	/**
	 * 账户
	 */
   	@Column(name = "sys_account" )
	private String sysAccount;

	/**
	 * 昵称
	 */
   	@Column(name = "sys_user_name" )
	private String sysUserName;

	/**
	 * 所在城市
	 */
   	@Column(name = "sys_city" )
	private String sysCity;

	/**
	 * 所在地区
	 */
   	@Column(name = "sys_district" )
	private String sysDistrict;

	/**
	 * 现注册地
	 */
   	@Column(name = "sys_live_address" )
	private String sysLiveAddress;

	/**
	 * 创建时间
	 */
   	@Column(name = "sys_gmt_create" )
	private Date sysGmtCreate;

	/**
	 * 修改时间
	 */
   	@Column(name = "sys_gmt_modified" )
	private Date sysGmtModified;

	/**
	 * 邮箱
	 */
   	@Column(name = "sys_mailbox" )
	private String sysMailbox;

	/**
	 * 密码
	 */
   	@Column(name = "sys_password" )
	private String sysPassword;

	/**
	 * 手机号
	 */
   	@Column(name = "sys_phone" )
	private String sysPhone;

	/**
	 * 所在省份
	 */
   	@Column(name = "sys_province" )
	private String sysProvince;

	/**
	 * 性别
	 */
   	@Column(name = "sys_sex" )
	private String sysSex;

	/**
	 * 状态 0:禁用，1:正常
	 */
   	@Column(name = "sys_status" )
	private Long sysStatus;

	/**
	 * 是否删除  -1：已删除  0：正常
	 */
   	@Column(name = "sys_del_flag" )
	private Long sysDelFlag;

	/**
	 * 部门ID
	 */
   	@Column(name = "fk_com_dept_id" )
	private Long fkComDeptId;

	/**
	 * 微信授权标识
	 */
   	@Column(name = "sys_open_id" )
	private String sysOpenId;

	/**
	 * 二维码登陆标识
	 */
   	@Column(name = "sys_qruuid" )
	private String sysQruuid;

	/**
	 * 主键ID：自动增长
	 */
   	@Column(name = "pk_id" )
    @Id
	private Long pkId;

}
