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
@TableName("legal_representative")
public class LegalRepresentativeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date finLegrepAddtime;
	/**
	 * 
	 */
	private Integer finLegrepAge;
	/**
	 * 
	 */
	private String finLegrepCode;
	/**
	 * 
	 */
	private String finLegrepCreditstatus;
	/**
	 * 
	 */
	private Integer finLegrepDelflag;
	/**
	 * 
	 */
	private Integer finLegrepHaslegcase;
	/**
	 * 
	 */
	private Integer finLegrepIsstockholder;
	/**
	 * 
	 */
	private Date finLegrepLastmodify;
	/**
	 * 
	 */
	private String finLegrepName;
	/**
	 * 
	 */
	private BigDecimal finLegrepPersonalasset;
	/**
	 * 
	 */
	private BigDecimal finLegrepPersonaldebt;
	/**
	 * 
	 */
	private Float finLegrepSharerate;
	/**
	 * 
	 */
	private Date finLegrepStartingtime;
	/**
	 * 
	 */
	@TableId
	private Integer pkFinLegrepId;

	/**
	 * 设置：
	 */
	public void setFinLegrepAddtime(Date finLegrepAddtime) {
		this.finLegrepAddtime = finLegrepAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinLegrepAddtime() {
		return finLegrepAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinLegrepAge(Integer finLegrepAge) {
		this.finLegrepAge = finLegrepAge;
	}
	/**
	 * 获取：
	 */
	public Integer getFinLegrepAge() {
		return finLegrepAge;
	}
	/**
	 * 设置：
	 */
	public void setFinLegrepCode(String finLegrepCode) {
		this.finLegrepCode = finLegrepCode;
	}
	/**
	 * 获取：
	 */
	public String getFinLegrepCode() {
		return finLegrepCode;
	}
	/**
	 * 设置：
	 */
	public void setFinLegrepCreditstatus(String finLegrepCreditstatus) {
		this.finLegrepCreditstatus = finLegrepCreditstatus;
	}
	/**
	 * 获取：
	 */
	public String getFinLegrepCreditstatus() {
		return finLegrepCreditstatus;
	}
	/**
	 * 设置：
	 */
	public void setFinLegrepDelflag(Integer finLegrepDelflag) {
		this.finLegrepDelflag = finLegrepDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getFinLegrepDelflag() {
		return finLegrepDelflag;
	}
	/**
	 * 设置：
	 */
	public void setFinLegrepHaslegcase(Integer finLegrepHaslegcase) {
		this.finLegrepHaslegcase = finLegrepHaslegcase;
	}
	/**
	 * 获取：
	 */
	public Integer getFinLegrepHaslegcase() {
		return finLegrepHaslegcase;
	}
	/**
	 * 设置：
	 */
	public void setFinLegrepIsstockholder(Integer finLegrepIsstockholder) {
		this.finLegrepIsstockholder = finLegrepIsstockholder;
	}
	/**
	 * 获取：
	 */
	public Integer getFinLegrepIsstockholder() {
		return finLegrepIsstockholder;
	}
	/**
	 * 设置：
	 */
	public void setFinLegrepLastmodify(Date finLegrepLastmodify) {
		this.finLegrepLastmodify = finLegrepLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinLegrepLastmodify() {
		return finLegrepLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setFinLegrepName(String finLegrepName) {
		this.finLegrepName = finLegrepName;
	}
	/**
	 * 获取：
	 */
	public String getFinLegrepName() {
		return finLegrepName;
	}
	/**
	 * 设置：
	 */
	public void setFinLegrepPersonalasset(BigDecimal finLegrepPersonalasset) {
		this.finLegrepPersonalasset = finLegrepPersonalasset;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinLegrepPersonalasset() {
		return finLegrepPersonalasset;
	}
	/**
	 * 设置：
	 */
	public void setFinLegrepPersonaldebt(BigDecimal finLegrepPersonaldebt) {
		this.finLegrepPersonaldebt = finLegrepPersonaldebt;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinLegrepPersonaldebt() {
		return finLegrepPersonaldebt;
	}
	/**
	 * 设置：
	 */
	public void setFinLegrepSharerate(Float finLegrepSharerate) {
		this.finLegrepSharerate = finLegrepSharerate;
	}
	/**
	 * 获取：
	 */
	public Float getFinLegrepSharerate() {
		return finLegrepSharerate;
	}
	/**
	 * 设置：
	 */
	public void setFinLegrepStartingtime(Date finLegrepStartingtime) {
		this.finLegrepStartingtime = finLegrepStartingtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinLegrepStartingtime() {
		return finLegrepStartingtime;
	}
	/**
	 * 设置：
	 */
	public void setPkFinLegrepId(Integer pkFinLegrepId) {
		this.pkFinLegrepId = pkFinLegrepId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkFinLegrepId() {
		return pkFinLegrepId;
	}
}
