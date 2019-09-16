package com.risesin.service.modules.base.entity;

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
 * @Description  ExpensesType费用类型类
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="expenses_type" )
public class ExpensesType  implements Serializable {

	private static final long serialVersionUID =  6285150559084818901L;

	/**
	 * 创建时间
	 */
   	@Column(name = "exp_typ_addtime" )
	private Date addtime;

	/**
	 * 编号
	 */
   	@Column(name = "exp_typ_code" )
	private String expTypeCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "exp_typ_delflag" )
	private Long delflag;

	/**
	 * 主键
	 */
   	@Column(name = "pk_exp_typ_id" )
    @Id
	private Long expTypeId;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "exp_typ_lastmodify" )
	private Date lastmodify;

	/**
	 * 费用类型名称
	 */
   	@Column(name = "exp_typ_name" )
	private String expTypeName;

	/**
	 * 平台用户id
	 */
   	@Column(name = "fk_sys_userid" )
	private Long sysUserId;

}
