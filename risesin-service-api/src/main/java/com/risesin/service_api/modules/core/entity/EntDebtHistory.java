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
 * @Description  EntDebtHistory企业负债历史类
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
@Table ( name ="ent_debt_history" )
public class EntDebtHistory  implements Serializable {

	private static final long serialVersionUID =  8536226303048519682L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_debhis_addtime" )
	private LocalDateTime addTime;

	/**
	 * 编号
	 */
   	@Column(name = "fin_debhis_code" )
	private String debHistoryCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "fin_debhis_delflag" )
	private Long delFlag;

	/**
	 * 是否逾期
	 */
   	@Column(name = "fin_debhis_isoverdue" )
	private Long isOverdue;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_debhis_lastmodify" )
	private LocalDateTime lastModify;

	/**
	 * 负债类型
	 */
   	@Column(name = "fin_debhis_liabilitytype" )
	private String debType;

	/**
	 * 借款日期
	 */
   	@Column(name = "fin_debhis_loandate" )
	private LocalDateTime debLoanDate;

	/**
	 * 未结清的款项
	 */
   	@Column(name = "fin_debhis_nonpayment" )
	private BigDecimal debNonpayment;

	/**
	 * 已结清的款项
	 */
   	@Column(name = "fin_debhis_paid" )
	private BigDecimal debPaid;

	/**
	 * 期限
	 */
   	@Column(name = "fin_debhis_timelimit" )
	private LocalDateTime debTimelimit;

	/**
	 * 融资主体id(企业)
	 */
   	@Column(name = "fk_fin_ent_entid" )
	private Long entId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_fin_debhis_id" )
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

}
