package com.risesin.service_api.modules.pay.entity;

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
 * @Description  ProjectExpenseOrder方案费用订单
 * @Author  Baby
 * @Date 2019-09-16 
 */

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
	private Double totalMoney;

	/**
	 * 费用类型id
	 */
   	@Column(name = "fk_exp_typ_id" )
	private Long expTypeId;

	/**
	 * 融资项目id
	 */
   	@Column(name = "fk_pro_id" )
	private Long projectId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_pro_ord_id" )
    @Id
	private Long proOrderId;

	/**
	 * 创建时间
	 */
   	@Column(name = "pro_ord_addtime" )
	private Date addtime;

	/**
	 * 交易关闭时间
	 */
   	@Column(name = "pro_ord_closetime" )
	private Date proOrderClosetime;

	/**
	 * 编号
	 */
   	@Column(name = "pro_ord_code" )
	private String proOrderCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "pro_ord_delflag" )
	private Long delflag;

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
