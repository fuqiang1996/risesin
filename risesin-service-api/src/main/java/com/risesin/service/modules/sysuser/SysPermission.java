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
@Table ( name ="sys_permission" )
public class SysPermission  implements Serializable {

	private static final long serialVersionUID =  5870616841516286079L;

	/**
	 * 主键ID：自动增长
	 */
   	@Column(name = "pk_per_id" )
    @Id
	private Long pkPerId;

	/**
	 * 权限名称
	 */
   	@Column(name = "per_name" )
	private String perName;

	/**
	 * 权限标识
	 */
   	@Column(name = "per_perms" )
	private String perPerms;

	/**
	 * 权限url
	 */
   	@Column(name = "per_url" )
	private String perUrl;

	/**
	 * 父级权限
	 */
   	@Column(name = "per_parent_id" )
	private Long perParentId;

	/**
	 * 描述与备注
	 */
   	@Column(name = "per_remark" )
	private String perRemark;

	/**
	 * 排序
	 */
   	@Column(name = "per_order_num" )
	private Long perOrderNum;

	/**
	 * 创建时间
	 */
   	@Column(name = "per_addtime" )
	private Date perAddtime;

	/**
	 * 修改时间
	 */
   	@Column(name = "per_lastmodify" )
	private Date perLastmodify;

	/**
	 * 是否删除  -1：已删除  0：正常
	 */
   	@Column(name = "per_delflag" )
	private Long perDelflag;

}
