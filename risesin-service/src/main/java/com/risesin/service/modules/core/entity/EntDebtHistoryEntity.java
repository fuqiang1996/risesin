package com.risesin.service.modules.core.entity;

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
 * @date 2019-09-12 15:12:05
 */
@TableName("ent_debt_history")
public class EntDebtHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date finDebhisAddtime;
	/**
	 * 
	 */
	private String finDebhisCode;
	/**
	 * 
	 */
	private Integer finDebhisDelflag;
	/**
	 * 
	 */
	private Integer finDebhisIsoverdue;
	/**
	 * 
	 */
	private Date finDebhisLastmodify;
	/**
	 * 
	 */
	private String finDebhisLiabilitytype;
	/**
	 * 
	 */
	private Date finDebhisLoandate;
	/**
	 * 
	 */
	private BigDecimal finDebhisNonpayment;
	/**
	 * 
	 */
	private BigDecimal finDebhisPaid;
	/**
	 * 
	 */
	private Date finDebhisTimelimit;
	/**
	 * 
	 */
	private Integer fkFinEntEntid;
	/**
	 * 
	 */
	@TableId
	private Integer pkFinDebhisId;

	/**
	 * 设置：
	 */
	public void setFinDebhisAddtime(Date finDebhisAddtime) {
		this.finDebhisAddtime = finDebhisAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinDebhisAddtime() {
		return finDebhisAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinDebhisCode(String finDebhisCode) {
		this.finDebhisCode = finDebhisCode;
	}
	/**
	 * 获取：
	 */
	public String getFinDebhisCode() {
		return finDebhisCode;
	}
	/**
	 * 设置：
	 */
	public void setFinDebhisDelflag(Integer finDebhisDelflag) {
		this.finDebhisDelflag = finDebhisDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getFinDebhisDelflag() {
		return finDebhisDelflag;
	}
	/**
	 * 设置：
	 */
	public void setFinDebhisIsoverdue(Integer finDebhisIsoverdue) {
		this.finDebhisIsoverdue = finDebhisIsoverdue;
	}
	/**
	 * 获取：
	 */
	public Integer getFinDebhisIsoverdue() {
		return finDebhisIsoverdue;
	}
	/**
	 * 设置：
	 */
	public void setFinDebhisLastmodify(Date finDebhisLastmodify) {
		this.finDebhisLastmodify = finDebhisLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinDebhisLastmodify() {
		return finDebhisLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setFinDebhisLiabilitytype(String finDebhisLiabilitytype) {
		this.finDebhisLiabilitytype = finDebhisLiabilitytype;
	}
	/**
	 * 获取：
	 */
	public String getFinDebhisLiabilitytype() {
		return finDebhisLiabilitytype;
	}
	/**
	 * 设置：
	 */
	public void setFinDebhisLoandate(Date finDebhisLoandate) {
		this.finDebhisLoandate = finDebhisLoandate;
	}
	/**
	 * 获取：
	 */
	public Date getFinDebhisLoandate() {
		return finDebhisLoandate;
	}
	/**
	 * 设置：
	 */
	public void setFinDebhisNonpayment(BigDecimal finDebhisNonpayment) {
		this.finDebhisNonpayment = finDebhisNonpayment;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinDebhisNonpayment() {
		return finDebhisNonpayment;
	}
	/**
	 * 设置：
	 */
	public void setFinDebhisPaid(BigDecimal finDebhisPaid) {
		this.finDebhisPaid = finDebhisPaid;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinDebhisPaid() {
		return finDebhisPaid;
	}
	/**
	 * 设置：
	 */
	public void setFinDebhisTimelimit(Date finDebhisTimelimit) {
		this.finDebhisTimelimit = finDebhisTimelimit;
	}
	/**
	 * 获取：
	 */
	public Date getFinDebhisTimelimit() {
		return finDebhisTimelimit;
	}
	/**
	 * 设置：
	 */
	public void setFkFinEntEntid(Integer fkFinEntEntid) {
		this.fkFinEntEntid = fkFinEntEntid;
	}
	/**
	 * 获取：
	 */
	public Integer getFkFinEntEntid() {
		return fkFinEntEntid;
	}
	/**
	 * 设置：
	 */
	public void setPkFinDebhisId(Integer pkFinDebhisId) {
		this.pkFinDebhisId = pkFinDebhisId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkFinDebhisId() {
		return pkFinDebhisId;
	}
}
