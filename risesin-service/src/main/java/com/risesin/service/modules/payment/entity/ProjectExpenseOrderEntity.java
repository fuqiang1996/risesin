package com.risesin.service.modules.payment.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author fuqiang
 * @email 1607711260@gmail.com
 * @date 2019-09-12 15:11:14
 */
@TableName("project_expense_order")
public class ProjectExpenseOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String comUsername;
	/**
	 * 
	 */
	private String commodityName;
	/**
	 * 
	 */
	private BigDecimal expTotalMoney;
	/**
	 * 
	 */
	private Integer fkExpTypId;
	/**
	 * 
	 */
	private Integer fkProId;
	/**
	 * 
	 */
	@TableId
	private Integer pkProOrdId;
	/**
	 * 
	 */
	private Date proOrdAddtime;
	/**
	 * 
	 */
	private Date proOrdClosetime;
	/**
	 * 
	 */
	private String proOrdCode;
	/**
	 * 
	 */
	private Integer proOrdDelflag;
	/**
	 * 
	 */
	private String proOrdRemark;
	/**
	 * 
	 */
	private Integer proOrdStatus;

	/**
	 * 设置：
	 */
	public void setComUsername(String comUsername) {
		this.comUsername = comUsername;
	}
	/**
	 * 获取：
	 */
	public String getComUsername() {
		return comUsername;
	}
	/**
	 * 设置：
	 */
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	/**
	 * 获取：
	 */
	public String getCommodityName() {
		return commodityName;
	}
	/**
	 * 设置：
	 */
	public void setExpTotalMoney(BigDecimal expTotalMoney) {
		this.expTotalMoney = expTotalMoney;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getExpTotalMoney() {
		return expTotalMoney;
	}
	/**
	 * 设置：
	 */
	public void setFkExpTypId(Integer fkExpTypId) {
		this.fkExpTypId = fkExpTypId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkExpTypId() {
		return fkExpTypId;
	}
	/**
	 * 设置：
	 */
	public void setFkProId(Integer fkProId) {
		this.fkProId = fkProId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkProId() {
		return fkProId;
	}
	/**
	 * 设置：
	 */
	public void setPkProOrdId(Integer pkProOrdId) {
		this.pkProOrdId = pkProOrdId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkProOrdId() {
		return pkProOrdId;
	}
	/**
	 * 设置：
	 */
	public void setProOrdAddtime(Date proOrdAddtime) {
		this.proOrdAddtime = proOrdAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getProOrdAddtime() {
		return proOrdAddtime;
	}
	/**
	 * 设置：
	 */
	public void setProOrdClosetime(Date proOrdClosetime) {
		this.proOrdClosetime = proOrdClosetime;
	}
	/**
	 * 获取：
	 */
	public Date getProOrdClosetime() {
		return proOrdClosetime;
	}
	/**
	 * 设置：
	 */
	public void setProOrdCode(String proOrdCode) {
		this.proOrdCode = proOrdCode;
	}
	/**
	 * 获取：
	 */
	public String getProOrdCode() {
		return proOrdCode;
	}
	/**
	 * 设置：
	 */
	public void setProOrdDelflag(Integer proOrdDelflag) {
		this.proOrdDelflag = proOrdDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getProOrdDelflag() {
		return proOrdDelflag;
	}
	/**
	 * 设置：
	 */
	public void setProOrdRemark(String proOrdRemark) {
		this.proOrdRemark = proOrdRemark;
	}
	/**
	 * 获取：
	 */
	public String getProOrdRemark() {
		return proOrdRemark;
	}
	/**
	 * 设置：
	 */
	public void setProOrdStatus(Integer proOrdStatus) {
		this.proOrdStatus = proOrdStatus;
	}
	/**
	 * 获取：
	 */
	public Integer getProOrdStatus() {
		return proOrdStatus;
	}
}
