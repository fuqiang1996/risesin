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
 * @date 2019-09-12 15:11:50
 */
@TableName("financing_enterprise")
public class FinancingEnterpriseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date finEntAddtime;
	/**
	 * 
	 */
	private String finEntCode;
	/**
	 * 
	 */
	private Float finEntDebtrate;
	/**
	 * 
	 */
	private Integer finEntDelflag;
	/**
	 * 
	 */
	private BigDecimal finEntFixasset;
	/**
	 * 
	 */
	private Integer finEntHaslegalcase;
	/**
	 * 
	 */
	private Integer finEntHasoperationexception;
	/**
	 * 
	 */
	private Date finEntLastmodify;
	/**
	 * 
	 */
	private BigDecimal finEntLastyearrevenue;
	/**
	 * 
	 */
	private String finEntName;
	/**
	 * 
	 */
	private BigDecimal finEntOthpleasset;
	/**
	 * 
	 */
	private BigDecimal finEntProfit;
	/**
	 * 
	 */
	private BigDecimal finEntTaxamount;
	/**
	 * 
	 */
	private Integer fkFinIndId;
	/**
	 * 
	 */
	@TableId
	private Integer pkFinEntId;
	/**
	 * 
	 */
	private Integer finEntOperatinglife;

	/**
	 * 设置：
	 */
	public void setFinEntAddtime(Date finEntAddtime) {
		this.finEntAddtime = finEntAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinEntAddtime() {
		return finEntAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinEntCode(String finEntCode) {
		this.finEntCode = finEntCode;
	}
	/**
	 * 获取：
	 */
	public String getFinEntCode() {
		return finEntCode;
	}
	/**
	 * 设置：
	 */
	public void setFinEntDebtrate(Float finEntDebtrate) {
		this.finEntDebtrate = finEntDebtrate;
	}
	/**
	 * 获取：
	 */
	public Float getFinEntDebtrate() {
		return finEntDebtrate;
	}
	/**
	 * 设置：
	 */
	public void setFinEntDelflag(Integer finEntDelflag) {
		this.finEntDelflag = finEntDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getFinEntDelflag() {
		return finEntDelflag;
	}
	/**
	 * 设置：
	 */
	public void setFinEntFixasset(BigDecimal finEntFixasset) {
		this.finEntFixasset = finEntFixasset;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinEntFixasset() {
		return finEntFixasset;
	}
	/**
	 * 设置：
	 */
	public void setFinEntHaslegalcase(Integer finEntHaslegalcase) {
		this.finEntHaslegalcase = finEntHaslegalcase;
	}
	/**
	 * 获取：
	 */
	public Integer getFinEntHaslegalcase() {
		return finEntHaslegalcase;
	}
	/**
	 * 设置：
	 */
	public void setFinEntHasoperationexception(Integer finEntHasoperationexception) {
		this.finEntHasoperationexception = finEntHasoperationexception;
	}
	/**
	 * 获取：
	 */
	public Integer getFinEntHasoperationexception() {
		return finEntHasoperationexception;
	}
	/**
	 * 设置：
	 */
	public void setFinEntLastmodify(Date finEntLastmodify) {
		this.finEntLastmodify = finEntLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinEntLastmodify() {
		return finEntLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setFinEntLastyearrevenue(BigDecimal finEntLastyearrevenue) {
		this.finEntLastyearrevenue = finEntLastyearrevenue;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinEntLastyearrevenue() {
		return finEntLastyearrevenue;
	}
	/**
	 * 设置：
	 */
	public void setFinEntName(String finEntName) {
		this.finEntName = finEntName;
	}
	/**
	 * 获取：
	 */
	public String getFinEntName() {
		return finEntName;
	}
	/**
	 * 设置：
	 */
	public void setFinEntOthpleasset(BigDecimal finEntOthpleasset) {
		this.finEntOthpleasset = finEntOthpleasset;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinEntOthpleasset() {
		return finEntOthpleasset;
	}
	/**
	 * 设置：
	 */
	public void setFinEntProfit(BigDecimal finEntProfit) {
		this.finEntProfit = finEntProfit;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinEntProfit() {
		return finEntProfit;
	}
	/**
	 * 设置：
	 */
	public void setFinEntTaxamount(BigDecimal finEntTaxamount) {
		this.finEntTaxamount = finEntTaxamount;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinEntTaxamount() {
		return finEntTaxamount;
	}
	/**
	 * 设置：
	 */
	public void setFkFinIndId(Integer fkFinIndId) {
		this.fkFinIndId = fkFinIndId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkFinIndId() {
		return fkFinIndId;
	}
	/**
	 * 设置：
	 */
	public void setPkFinEntId(Integer pkFinEntId) {
		this.pkFinEntId = pkFinEntId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkFinEntId() {
		return pkFinEntId;
	}
	/**
	 * 设置：
	 */
	public void setFinEntOperatinglife(Integer finEntOperatinglife) {
		this.finEntOperatinglife = finEntOperatinglife;
	}
	/**
	 * 获取：
	 */
	public Integer getFinEntOperatinglife() {
		return finEntOperatinglife;
	}
}
