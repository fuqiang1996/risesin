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
@Table ( name ="todotask" )
public class Todotask  implements Serializable {

	private static final long serialVersionUID =  6311766181792100341L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_tas_addtime" )
	private Date addTime;

	/**
	 * 编号
	 */
   	@Column(name = "fin_tas_code" )
	private String taskCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "fin_tas_delflag" )
	private Long delFlag;

	/**
	 * 待办事项描述信息
	 */
   	@Column(name = "fin_tas_description" )
	private String taskDescription;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_tas_lastmodify" )
	private Date lastModify;

	/**
	 * 待办事项名称
	 */
   	@Column(name = "fin_tas_name" )
	private String taskName;

	/**
	 * 任务的状态：待办；关闭
	 */
   	@Column(name = "fin_tas_state" )
	private String taskState;

	/**
	 * 指派用户code（企业或助贷机构）
	 */
   	@Column(name = "fk_ass_code" )
	private String assignCode;

	/**
	 * 融资方案（项目）id
	 */
   	@Column(name = "fk_act_pro_id" )
	private Long actProjectId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_fin_tas_id" )
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

}
