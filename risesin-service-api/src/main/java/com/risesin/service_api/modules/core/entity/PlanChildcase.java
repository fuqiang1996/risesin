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
@Table ( name ="plan_childcase" )
public class PlanChildcase  implements Serializable {

	private static final long serialVersionUID =  3781762127491165054L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_cas_addtime" )
	private Date addtime;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_cas_lastmodify" )
	private Date lastmodify;

	/**
	 * 法人id
	 */
   	@Column(name = "fk_fin_legrep_id" )
	private Long repId;

	/**
	 * 融资预案id
	 */
   	@Column(name = "fk_fin_pla_id" )
	private Long planId;

	/**
	 * 股东id
	 */
   	@Column(name = "fk_fin_sto_id" )
	private Long stockolderId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_fin_cas_id" )
    @Id
	private Long caseId;

	/**
	 * 融资主体id
	 */
   	@Column(name = "fk_fin_ent_id" )
	private Long entId;

}
