package com.risesin.service.modules.payment.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author fuqiang
 * @email 1607711260@gmail.com
 * @date 2019-09-12 15:11:14
 */
@TableName("payment")
public class PaymentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date payAddtime;
	/**
	 * 
	 */
	private String payCode;
	/**
	 * 
	 */
	private Integer payDelflag;
	/**
	 * 
	 */
	private String payMethod;
	/**
	 * 
	 */
	private BigDecimal payMoney;
	/**
	 * 
	 */
	private String payStatus;
	/**
	 * 
	 */
	@TableId
	private Integer pkPayId;
	/**
	 * 
	 */
	private Integer fkExpOrdId;

	/**
	 * 设置：
	 */
	public void setPayAddtime(Date payAddtime) {
		this.payAddtime = payAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getPayAddtime() {
		return payAddtime;
	}
	/**
	 * 设置：
	 */
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}
	/**
	 * 获取：
	 */
	public String getPayCode() {
		return payCode;
	}
	/**
	 * 设置：
	 */
	public void setPayDelflag(Integer payDelflag) {
		this.payDelflag = payDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getPayDelflag() {
		return payDelflag;
	}
	/**
	 * 设置：
	 */
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	/**
	 * 获取：
	 */
	public String getPayMethod() {
		return payMethod;
	}
	/**
	 * 设置：
	 */
	public void setPayMoney(BigDecimal payMoney) {
		this.payMoney = payMoney;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getPayMoney() {
		return payMoney;
	}
	/**
	 * 设置：
	 */
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	/**
	 * 获取：
	 */
	public String getPayStatus() {
		return payStatus;
	}
	/**
	 * 设置：
	 */
	public void setPkPayId(Integer pkPayId) {
		this.pkPayId = pkPayId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkPayId() {
		return pkPayId;
	}
	/**
	 * 设置：
	 */
	public void setFkExpOrdId(Integer fkExpOrdId) {
		this.fkExpOrdId = fkExpOrdId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkExpOrdId() {
		return fkExpOrdId;
	}
}
