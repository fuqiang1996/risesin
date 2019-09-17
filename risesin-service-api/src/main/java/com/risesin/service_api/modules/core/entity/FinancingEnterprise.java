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
 * @Description  FinancingEnterprise融资主体类
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="financing_enterprise" )
public class FinancingEnterprise  implements Serializable {

	private static final long serialVersionUID =  4294169685734240303L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_ent_addtime" )
	private Date addtime;

	/**
	 * 编号
	 */
   	@Column(name = "fin_ent_code" )
	private String entCode;

	/**
	 * 负债率
	 */
   	@Column(name = "fin_ent_debtrate" )
	private Double entDebtrate;

	/**
	 * 删除标记
	 */
   	@Column(name = "fin_ent_delflag" )
	private Long delflag;

	/**
	 * 固定资产
	 */
   	@Column(name = "fin_ent_fixasset" )
	private Double entFixasset;

	/**
	 * 是否有司法案件
	 */
   	@Column(name = "fin_ent_haslegalcase" )
	private Long hasLegalcase;

	/**
	 * 是否经营异常
	 */
   	@Column(name = "fin_ent_hasoperationexception" )
	private Long hasOperationexception;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_ent_lastmodify" )
	private Date lastmodify;

	/**
	 * 上一年营收
	 */
   	@Column(name = "fin_ent_lastyearrevenue" )
	private Double lastyearRevenue;

	/**
	 * 企业名称
	 */
   	@Column(name = "fin_ent_name" )
	private String entName;

	/**
	 * 其他可质押资产
	 */
   	@Column(name = "fin_ent_othpleasset" )
	private Double entOtherAsset;

	/**
	 * 利润
	 */
   	@Column(name = "fin_ent_profit" )
	private Double entProfit;

	/**
	 * 总税额
	 */
   	@Column(name = "fin_ent_taxamount" )
	private Double entTaxAmount;

	/**
	 * 行业id
	 */
   	@Column(name = "fk_fin_ind_id" )
	private Long industryId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_fin_ent_id" )
    @Id
	private Long entId;

	/**
	 * 经营年限
	 */
   	@Column(name = "fin_ent_operatinglife" )
	private Long entOperatingLife;

}
