package com.risesin.service_api.modules.core.entity;

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
@Table ( name ="sys_tas_log" )
public class SysTasLog  implements Serializable {

	private static final long serialVersionUID =  8693966321523029171L;

	/**
	 * 待办事项id
	 */
   	@Column(name = "fk_fin_tas_id" )
	private Long todoTaskId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_tas_log_id" )
    @Id
	private Long taskLogId;

	/**
	 * 创建时间
	 */
   	@Column(name = "tas_log_addtime" )
	private Date addtime;

	/**
	 * 编号
	 */
   	@Column(name = "tas_log_code" )
	private String taskLogCode;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "tas_log_lastmodify" )
	private Date lastmodify;

	/**
	 * 操作记录
	 */
   	@Column(name = "tas_log_operation" )
	private String taskLogOperation;

}
