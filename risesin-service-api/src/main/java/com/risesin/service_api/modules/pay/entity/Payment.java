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
 * @Description  Payment支付类
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
@Table ( name ="payment" )
public class Payment implements Serializable {

	private static final long serialVersionUID =  2375679462702914484L;

	/**
	 * 创建时间
	 */
   	@Column(name = "pay_addtime" )
	private LocalDateTime addTime;

	/**
	 * 编号
	 */
   	@Column(name = "pay_code" )
	private String payCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "pay_delflag" )
	private Long delFlag;

	/**
	 * 支付方式
	 */
   	@Column(name = "pay_method" )
	private String payMethod;

	/**
	 * 支付金额
	 */
   	@Column(name = "pay_money" )
	private BigDecimal payMoney;

	/**
	 * 支付状态
	 */
   	@Column(name = "pay_status" )
	private String payStatus;

	/**
	 * 主键
	 */
   	@Column(name = "pk_pay_id" )
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 费用订单id
	 */
   	@Column(name = "fk_exp_ord_id" )
	private Long orderId;

}
