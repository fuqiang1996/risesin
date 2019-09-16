package com.risesin.service.modules.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Id;

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
	 * 融资预案id
	 */
   	@Column(name = "pk_fin_cas_id" )
    @Id
	private Long caseId;

	/**
	 * 企业信息id
	 */
	@Column(name = "pk_fin_entinfo_id" )
    @Id
	private Long entId;

}
