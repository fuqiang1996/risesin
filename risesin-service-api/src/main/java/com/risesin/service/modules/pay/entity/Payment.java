package com.risesin.service.modules.pay.entity;

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
 * @Description  Payment支付类
 * @Author  Baby
 * @Date 2019-09-16 
 */

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
	private Date addtime;

	/**
	 * 编号
	 */
   	@Column(name = "pay_code" )
	private String payCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "pay_delflag" )
	private Long delflag;

	/**
	 * 支付方式
	 */
   	@Column(name = "pay_method" )
	private String payMethod;

	/**
	 * 支付金额
	 */
   	@Column(name = "pay_money" )
	private Double payMoney;

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
	private Long payId;

	/**
	 * 费用订单id
	 */
   	@Column(name = "fk_exp_ord_id" )
	private Long orderId;

}
