package com.risesin.service.modules.product.entity;


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
 * @date 2019-09-12 15:11:50
 */
@TableName("product")
public class ProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date finProAddtime;
	/**
	 * 
	 */
	private String finProApplicant;
	/**
	 * 
	 */
	private String finProCode;
	/**
	 * 
	 */
	private Float finProDebtrate;
	/**
	 * 
	 */
	private Integer finProDelflag;
	/**
	 * 
	 */
	private String finProDescription;
	/**
	 * 
	 */
	private String finProGuarantor;
	/**
	 * 
	 */
	private Date finProLastmodify;
	/**
	 * 
	 */
	private Integer finProLendingcycle;
	/**
	 * 
	 */
	private String finProName;
	/**
	 * 
	 */
	private BigDecimal finProMinquota;
	/**
	 * 
	 */
	private String finProState;
	/**
	 * 
	 */
	private Integer fkFinTypeId;
	/**
	 * 
	 */
	private Integer fkSysUsrId;
	/**
	 * 
	 */
	@TableId
	private Integer pkFinProId;
	/**
	 * 
	 */
	private BigDecimal finProMaxquota;

	/**
	 * 设置：
	 */
	public void setFinProAddtime(Date finProAddtime) {
		this.finProAddtime = finProAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinProAddtime() {
		return finProAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinProApplicant(String finProApplicant) {
		this.finProApplicant = finProApplicant;
	}
	/**
	 * 获取：
	 */
	public String getFinProApplicant() {
		return finProApplicant;
	}
	/**
	 * 设置：
	 */
	public void setFinProCode(String finProCode) {
		this.finProCode = finProCode;
	}
	/**
	 * 获取：
	 */
	public String getFinProCode() {
		return finProCode;
	}
	/**
	 * 设置：
	 */
	public void setFinProDebtrate(Float finProDebtrate) {
		this.finProDebtrate = finProDebtrate;
	}
	/**
	 * 获取：
	 */
	public Float getFinProDebtrate() {
		return finProDebtrate;
	}
	/**
	 * 设置：
	 */
	public void setFinProDelflag(Integer finProDelflag) {
		this.finProDelflag = finProDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getFinProDelflag() {
		return finProDelflag;
	}
	/**
	 * 设置：
	 */
	public void setFinProDescription(String finProDescription) {
		this.finProDescription = finProDescription;
	}
	/**
	 * 获取：
	 */
	public String getFinProDescription() {
		return finProDescription;
	}
	/**
	 * 设置：
	 */
	public void setFinProGuarantor(String finProGuarantor) {
		this.finProGuarantor = finProGuarantor;
	}
	/**
	 * 获取：
	 */
	public String getFinProGuarantor() {
		return finProGuarantor;
	}
	/**
	 * 设置：
	 */
	public void setFinProLastmodify(Date finProLastmodify) {
		this.finProLastmodify = finProLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinProLastmodify() {
		return finProLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setFinProLendingcycle(Integer finProLendingcycle) {
		this.finProLendingcycle = finProLendingcycle;
	}
	/**
	 * 获取：
	 */
	public Integer getFinProLendingcycle() {
		return finProLendingcycle;
	}
	/**
	 * 设置：
	 */
	public void setFinProName(String finProName) {
		this.finProName = finProName;
	}
	/**
	 * 获取：
	 */
	public String getFinProName() {
		return finProName;
	}
	/**
	 * 设置：
	 */
	public void setFinProMinquota(BigDecimal finProMinquota) {
		this.finProMinquota = finProMinquota;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinProMinquota() {
		return finProMinquota;
	}
	/**
	 * 设置：
	 */
	public void setFinProState(String finProState) {
		this.finProState = finProState;
	}
	/**
	 * 获取：
	 */
	public String getFinProState() {
		return finProState;
	}
	/**
	 * 设置：
	 */
	public void setFkFinTypeId(Integer fkFinTypeId) {
		this.fkFinTypeId = fkFinTypeId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkFinTypeId() {
		return fkFinTypeId;
	}
	/**
	 * 设置：
	 */
	public void setFkSysUsrId(Integer fkSysUsrId) {
		this.fkSysUsrId = fkSysUsrId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkSysUsrId() {
		return fkSysUsrId;
	}
	/**
	 * 设置：
	 */
	public void setPkFinProId(Integer pkFinProId) {
		this.pkFinProId = pkFinProId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkFinProId() {
		return pkFinProId;
	}
	/**
	 * 设置：
	 */
	public void setFinProMaxquota(BigDecimal finProMaxquota) {
		this.finProMaxquota = finProMaxquota;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinProMaxquota() {
		return finProMaxquota;
	}
}
