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
 * @Description  FintypeLinkChildcase融资类型与支线方案连接表
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="fintype_link_childcase" )
public class FintypeLinkChildcase  implements Serializable {

	private static final long serialVersionUID =  8875407245246304939L;

	/**
	 * 融资类型id
	 */
   	@Column(name = "pk_fin_type_id" )
    @Id
	private Long finTypeId;

	/**
	 * 支线方案id
	 */
   	@Column(name = "pk_fin_cas_id" )
    @Id
	private Long caseId;

}
