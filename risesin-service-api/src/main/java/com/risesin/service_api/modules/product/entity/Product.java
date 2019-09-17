package com.risesin.service_api.modules.product.entity;

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
@Table ( name ="product" )
public class Product  implements Serializable {

	private static final long serialVersionUID =  7314740654923115326L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_pro_addtime" )
	private Date finProAddtime;

	/**
	 * 申请人
	 */
   	@Column(name = "fin_pro_applicant" )
	private String finProApplicant;

	/**
	 * 编号
	 */
   	@Column(name = "fin_pro_code" )
	private String finProCode;

	/**
	 * 负债率
	 */
   	@Column(name = "fin_pro_debtrate" )
	private Double finProDebtrate;

	/**
	 * 删除标记
	 */
   	@Column(name = "fin_pro_delflag" )
	private Long finProDelflag;

	/**
	 * 产品描述信息（申请流程）
	 */
   	@Column(name = "fin_pro_description" )
	private String finProDescription;

	/**
	 * 担保人
	 */
   	@Column(name = "fin_pro_guarantor" )
	private String finProGuarantor;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_pro_lastmodify" )
	private Date finProLastmodify;

	/**
	 * 借款周期
	 */
   	@Column(name = "fin_pro_lendingcycle" )
	private Long finProLendingcycle;

	/**
	 * 产品名称
	 */
   	@Column(name = "fin_pro_name" )
	private String finProName;

	/**
	 * 最小额度
	 */
   	@Column(name = "fin_pro_minquota" )
	private Double finProMinquota;

	/**
	 * 产品审核状态
	 */
   	@Column(name = "fin_pro_state" )
	private String finProState;

	/**
	 * 融资类型id
	 */
   	@Column(name = "fk_fin_type_id" )
	private Long fkFinTypeId;

	/**
	 * 审核人id
	 */
   	@Column(name = "fk_sys_usr_id" )
	private Long fkSysUsrId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_fin_pro_id" )
    @Id
	private Long pkFinProId;

	/**
	 * 最高额度
	 */
   	@Column(name = "fin_pro_maxquota" )
	private Double finProMaxquota;

}
