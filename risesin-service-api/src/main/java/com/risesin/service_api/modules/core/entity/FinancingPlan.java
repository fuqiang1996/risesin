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
 * @Description  FinancingPlan融资预案类
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
@Table ( name ="financing_plan" )
public class FinancingPlan  implements Serializable {

	private static final long serialVersionUID =  4926316079425631709L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_pla_addtime" )
	private LocalDateTime addTime;

	/**
	 * 申请人
	 */
   	@Column(name = "fin_pla_applicant" )
	private String planApplicant;

	/**
	 * 申请人邮箱
	 */
   	@Column(name = "fin_pla_applicantemail" )
	private String planApplicantEmail;

	/**
	 * 申请人电话
	 */
   	@Column(name = "fin_pla_applicanttel" )
	private String planApplicantTel;

	/**
	 * 编号
	 */
   	@Column(name = "fin_pla_code" )
	private String planCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "fin_pla_delflag" )
	private Long delFlag;

	/**
	 * 资金需求额度
	 */
   	@Column(name = "fin_pla_demandquota" )
	private BigDecimal finPlaDemandquota;

	/**
	 * 最优时效
	 */
   	@Column(name = "fin_pla_expecttime" )
	private LocalDateTime planExpectTime;

	/**
	 * 担保方式
	 */
   	@Column(name = "fin_pla_guaranteemode" )
	private String planGuaranteemode;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_pla_lastmodify" )
	private LocalDateTime lastModify;

	/**
	 * 可接受成本上限
	 */
   	@Column(name = "fin_pla_maxrate" )
	private Double planMaxrate;

	/**
	 * 可接受成本下限
	 */
   	@Column(name = "fin_pla_minrete" )
	private Double planMinrete;

	/**
	 * 还款来源
	 */
   	@Column(name = "fin_pla_payment" )
	private String planPayment;

	/**
	 * 用途
	 */
   	@Column(name = "fin_pla_useness" )
	private String planUseness;

	/**
	 * 创建人id
	 */
   	@Column(name = "fk_com_usrid" )
	private Long commonUserId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_fin_pla_id" )
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 预案状态
	 */
   	@Column(name = "fin_pla_status" )
	private String planStatus;

	/**
	 * 预案阶段
	 */
   	@Column(name = "fin_pla_stage" )
	private String planStage;

}
