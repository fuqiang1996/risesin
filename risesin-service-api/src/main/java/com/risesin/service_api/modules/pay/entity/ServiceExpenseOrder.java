package com.risesin.service_api.modules.pay.entity;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Description  ServiceExpenseOrder服务费用订单
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="service_expense_order" )
public class ServiceExpenseOrder  implements Serializable {

	private static final long serialVersionUID =  4542626634667611520L;

	/**
	 * 创建时间
	 */
   	@Column(name = "exp_ord_addtime" )
	private Date addtime;

	/**
	 * 编号
	 */
   	@Column(name = "exp_ord_code" )
	private String serOrderCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "exp_ord_delflag" )
	private Long delflag;

	/**
	 * 费用金额
	 */
   	@Column(name = "exp_ord_money" )
	private Double serOrderMoney;

	/**
	 * 订单状态
	 */
   	@Column(name = "exp_ord_status" )
	private Long serOrderStatus;

	/**
	 * 主键
	 */
   	@Column(name = "pk_exp_ord_id" )
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serOrderId;

	/**
	 * 费用类型id
	 */
   	@Column(name = "fk_exp_typ_id" )
	private Long serTypeId;

	/**
	 * 用户名称
	 */
   	@Column(name = "com_username" )
	private String userName;

	/**
	 * 商品名称
	 */
   	@Column(name = "commodity_name" )
	private String commodityName;

	/**
	 * 商品数量
	 */
   	@Column(name = "commodity_num" )
	private Long commodityNum;

	/**
	 * 商品单价
	 */
   	@Column(name = "commodity_price" )
	private Double commodityPrice;

	/**
	 * 商品链接
	 */
   	@Column(name = "commodity_url" )
	private String commodityUrl;

	/**
	 * 备注
	 */
   	@Column(name = "exp_ord_remark" )
	private String serOrderRemark;

	/**
	 * 交易关闭时间
	 */
   	@Column(name = "exp_ord_closetime" )
	private Date serOrdClosetime;

	/**
	 * 服务包code
	 */
   	@Column(name = "ser_package_code" )
	private String serPackageCode;

}