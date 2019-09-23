package com.risesin.service_api.modules.pay.entity;

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
 * @Description  ProjectExpenseOrder融资项目费用订单
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
@Table ( name ="project_expense_order" )
public class ProjectExpenseOrder  implements Serializable {

	private static final long serialVersionUID =  6252610968687606370L;

	/**
	 * 用户姓名
	 */
   	@Column(name = "com_username" )
	private String userName;

	/**
	 * 商品名称
	 */
   	@Column(name = "commodity_name" )
	private String commodityName;

	/**
	 * 费用总额
	 */
   	@Column(name = "exp_total_money" )
	private BigDecimal totalMoney;

	/**
	 * 费用类型id
	 */
   	@Column(name = "fk_exp_typ_id" )
	private Long expTypeId;

	/**
	 * 融资方案id（整个项目的具体方案）
	 */
   	@Column(name = "fk_act_pla_id" )
	private Long actCaseId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_pro_ord_id" )
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 创建时间
	 */
   	@Column(name = "pro_ord_addtime" )
	private LocalDateTime addTime;

	/**
	 * 交易关闭时间
	 */
   	@Column(name = "pro_ord_closetime" )
	private LocalDateTime proOrderClosetime;

	/**
	 * 编号
	 */
   	@Column(name = "pro_ord_code" )
	private String proOrderCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "pro_ord_delflag" )
	private Long delFlag;

	/**
	 * 备注
	 */
   	@Column(name = "pro_ord_remark" )
	private String proOrderRemark;

	/**
	 * 订单状态 1、未付款 2、已付款 3、已关闭 4、已成交
	 */
   	@Column(name = "pro_ord_status" )
	private Long proOrderStatus;

}
