package com.risesin.service_api.modules.core.entity;

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
 * @Description  
 * @Author  Baby
 * @Date 2019-09-16 
 */
@Accessors(chain = true) // 可将对象转换成链式设置值(流的形式)
@DynamicInsert // 插入或者修改时 字符串为 ''
@DynamicUpdate
@Setter
@Getter
@ToString
@Entity
@Table ( name ="sys_tas_log" )
public class TasLog implements Serializable {

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 创建时间
	 */
   	@Column(name = "tas_log_addtime" )
	private Date addTime;

	/**
	 * 编号
	 */
   	@Column(name = "tas_log_code" )
	private String taskLogCode;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "tas_log_lastmodify" )
	private Date lastModify;

	/**
	 * 操作记录
	 */
   	@Column(name = "tas_log_operation" )
	private String taskLogOperation;

}
