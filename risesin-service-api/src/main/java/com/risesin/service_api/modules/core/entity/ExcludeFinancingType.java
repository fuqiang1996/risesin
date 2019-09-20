package com.risesin.service_api.modules.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
	 * 主键
	 */
	@Column(name = "pk_exc_id" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 融资预案主键
	 */
   	@Column(name = "fk_fin_pla_id" )
	private Long finPlanId;

	/**
	 * 融资类型主键
	 */
   	@Column(name = "fk_fin_type_id" )
	private Long finTypeId;

}
