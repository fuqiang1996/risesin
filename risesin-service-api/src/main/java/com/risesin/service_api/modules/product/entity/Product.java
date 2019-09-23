package com.risesin.service_api.modules.product.entity;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Description  Product产品类
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Accessors(chain = true)
@Setter
@Getter
@ToString
@Entity
@Table ( name ="product" )
@DynamicInsert
@DynamicUpdate
public class Product implements Serializable {

	private static final long serialVersionUID =  7314740654923115326L;

	/**
	 * 主键
	 */
	@Column(name = "pk_fin_pro_id" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_pro_addtime" )
	//@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime addTime;

	/**
	 * 产品申请人
	 */
   	@Column(name = "fin_pro_applicant" )
	private String proApplicant;

	/**
	 * 编号
	 */
   	@Column(name = "fin_pro_code" )
	private String proCode;

	/**
	 * 负债率
	 */
   	@Column(name = "fin_pro_debtrate" )
	private Double proDebtrate;

	/**
	 * 删除标记
	 */
   	@Column(name = "fin_pro_delflag" )
	private Long delFlag;

	/**
	 * 产品描述信息（申请流程）
	 */
   	@Column(name = "fin_pro_description" )
	private String proDescription;

	/**
	 * 担保人
	 */
   	@Column(name = "fin_pro_guarantor" )
	private String proGuarantor;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_pro_lastmodify" )
	private LocalDateTime lastModify;

	/**
	 * 借款周期
	 */
   	@Column(name = "fin_pro_lendingcycle" )
	private Long proLendingCycle;

	/**
	 * 产品名称
	 */
   	@Column(name = "fin_pro_name" )
	private String proName;

	/**
	 * 最小额度
	 */
   	@Column(name = "fin_pro_minquota" )
	private BigDecimal proMinquota;

	/**
	 * 产品审核状态
	 */
   	@Column(name = "fin_pro_state" )
	private String proState;

	/**
	 * 融资类型id
	 */
   	@Column(name = "fk_fin_type_id" )
	private Long finTypeId;

	/**
	 * 审核人id
	 */
   	@Column(name = "fk_sys_usr_id" )
	private Long sysUserId;

	/**
	 * 最高额度
	 */
   	@Column(name = "fin_pro_maxquota" )
	private BigDecimal proMaxquota;

}
