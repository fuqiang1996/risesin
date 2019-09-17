package com.risesin.service_api.modules.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Id;

/**
 * @Description  
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="exclude_financing_type" )
public class ExcludeFinancingType  implements Serializable {

	private static final long serialVersionUID =  6427236295029673723L;

	/**
	 * 融资预案主键
	 */
   	@Column(name = "pk_fin_pla_id" )
    @Id
	private Long finPlanId;

	/**
	 * 融资类型主键
	 */
   	@Column(name = "pk_fin_type_id" )
    @Id
	private Long finTypeId;

}
