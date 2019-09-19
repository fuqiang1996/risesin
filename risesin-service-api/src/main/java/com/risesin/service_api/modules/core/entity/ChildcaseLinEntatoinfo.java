package com.risesin.service_api.modules.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description  ChildcaseLinEntatoinfo 支线方案与企业独立信息的连接类
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="childcase_lin_entatoinfo" )
public class ChildcaseLinEntatoinfo  implements Serializable {

	private static final long serialVersionUID =  3564013982715408503L;

	/**
	 * 主键
	 */
	@Column(name = "pk_cas_lin_inf_id" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long casLinAtoInfoId;


	/**
	 * 支线方案id
	 */
   	@Column(name = "fk_fin_cas_id" )
	private Long caseId;

	/**
	 * 企业独立信息id
	 */
	@Column(name = "fk_fin_entinfo_id" )
	private Long atoInfoId;

}
