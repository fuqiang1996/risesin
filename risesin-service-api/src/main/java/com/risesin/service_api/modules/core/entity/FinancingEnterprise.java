package com.risesin.service_api.modules.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


/**
 * @Description  FinancingEnterprise融资主体类
 * @Author  Baby
 * @Date 2019-09-16 
 */
@Accessors(chain = true) // 可将对象转换成链式设置值(流的形式)
@DynamicInsert // 插入或者修改时 字符串为 ''
@DynamicUpdate
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
	private LocalDateTime addTime;

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
	private Long delFlag;

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
	private LocalDateTime lastModify;

	/**
	 * 上一年营收
	 */
   	@Column(name = "fin_ent_lastyearrevenue" )
	private BigDecimal lastyearRevenue;

	/**
	 * 企业名称
	 */
   	@Column(name = "fin_ent_name" )
	private String entName;

	/**
	 * 其他可质押资产
	 */
   	@Column(name = "fin_ent_othpleasset" )
	private BigDecimal entOtherAsset;

	/**
	 * 利润
	 */
   	@Column(name = "fin_ent_profit" )
	private BigDecimal entProfit;

	/**
	 * 总税额
	 */
   	@Column(name = "fin_ent_taxamount" )
	private BigDecimal entTaxAmount;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 经营年限
	 */
   	@Column(name = "fin_ent_operatinglife" )
	private Long entOperatingLife;

}
