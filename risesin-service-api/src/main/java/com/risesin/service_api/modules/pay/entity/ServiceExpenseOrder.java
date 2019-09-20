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
 * @Description  ServiceExpenseOrder服务费用订单
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
@Table ( name ="service_expense_order" )
public class ServiceExpenseOrder  implements Serializable {

	private static final long serialVersionUID =  4542626634667611520L;

	/**
	 * 创建时间
	 */
   	@Column(name = "exp_ord_addtime" )
	private LocalDateTime addTime;

	/**
	 * 编号
	 */
   	@Column(name = "exp_ord_code" )
	private String serOrderCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "exp_ord_delflag" )
	private Long delFlag;

	/**
	 * 费用金额
	 */
   	@Column(name = "exp_ord_money" )
	private BigDecimal serOrderMoney;

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
	private Long id;

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
	private BigDecimal commodityPrice;

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
	private LocalDateTime serOrdClosetime;

	/**
	 * 服务包code
	 */
   	@Column(name = "ser_package_code" )
	private String serPackageCode;

}
