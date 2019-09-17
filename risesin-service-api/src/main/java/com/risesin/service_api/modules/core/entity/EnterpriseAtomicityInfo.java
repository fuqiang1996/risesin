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
 * @Description  EnterpriseAtomicityInfo企业独立信息类
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="enterprise_atomicity_info" )
public class EnterpriseAtomicityInfo  implements Serializable {

	private static final long serialVersionUID =  5891211446139314018L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_entinfo_addtime" )
	private Date addtime;

	/**
	 * 编号
	 */
   	@Column(name = "fin_entinfo_code" )
	private String atoInfoCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "fin_entinfo_delflag" )
	private Long delflag;

	/**
	 * 描述
	 */
   	@Column(name = "fin_entinfo_description" )
	private String atoInfoDescription;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_entinfo_lastmodify" )
	private Date lastmodify;

	/**
	 * 名称
	 */
   	@Column(name = "fin_entinfo_name" )
	private String atoInfoName;

	/**
	 * 企业信息类型id
	 */
   	@Column(name = "fk_fin_entinfotype_id" )
	private Long infoTypeId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_fin_entinfo_id" )
    @Id
	private Long atoInfoId;

}
