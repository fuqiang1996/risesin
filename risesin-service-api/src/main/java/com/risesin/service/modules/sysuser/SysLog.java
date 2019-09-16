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
@Table ( name ="sys_log" )
public class SysLog  implements Serializable {

	private static final long serialVersionUID =  2005545073237699356L;

	/**
	 * 主键ID：自动增长
	 */
   	@Column(name = "pk_log_id" )
    @Id
	private Long pkLogId;

	/**
	 * 平台用户id
	 */
   	@Column(name = "fk_log_user_id" )
	private Long fkLogUserId;

	/**
	 * 用户名
	 */
   	@Column(name = "log_username" )
	private String logUsername;

	/**
	 * 用户操作
	 */
   	@Column(name = "log_operation" )
	private String logOperation;

	/**
	 * 响应时间
	 */
   	@Column(name = "log_time" )
	private Long logTime;

	/**
	 * 请求方法
	 */
   	@Column(name = "log_method" )
	private String logMethod;

	/**
	 * 请求参数
	 */
   	@Column(name = "log_params" )
	private String logParams;

	/**
	 * IP地址
	 */
   	@Column(name = "log_ip" )
	private String logIp;

	/**
	 * 创建时间
	 */
   	@Column(name = "log_addtime" )
	private Date logAddtime;

}
