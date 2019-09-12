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
@TableName("stockholder")
public class StockholderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date finStoAddtime;
	/**
	 * 
	 */
	private Integer finStoAge;
	/**
	 * 
	 */
	private String finStoCode;
	/**
	 * 
	 */
	private String finStoCreditstatus;
	/**
	 * 
	 */
	private Integer finStoHaslegalcase;
	/**
	 * 
	 */
	private Date finStoLastmodify;
	/**
	 * 
	 */
	private String finStoName;
	/**
	 * 
	 */
	private BigDecimal finStoPersonalasset;
	/**
	 * 
	 */
	private BigDecimal finStoPersonaldebt;
	/**
	 * 
	 */
	private Float finStoSharerate;
	/**
	 * 
	 */
	@TableId
	private Integer pkFinStoId;

	/**
	 * 设置：
	 */
	public void setFinStoAddtime(Date finStoAddtime) {
		this.finStoAddtime = finStoAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinStoAddtime() {
		return finStoAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinStoAge(Integer finStoAge) {
		this.finStoAge = finStoAge;
	}
	/**
	 * 获取：
	 */
	public Integer getFinStoAge() {
		return finStoAge;
	}
	/**
	 * 设置：
	 */
	public void setFinStoCode(String finStoCode) {
		this.finStoCode = finStoCode;
	}
	/**
	 * 获取：
	 */
	public String getFinStoCode() {
		return finStoCode;
	}
	/**
	 * 设置：
	 */
	public void setFinStoCreditstatus(String finStoCreditstatus) {
		this.finStoCreditstatus = finStoCreditstatus;
	}
	/**
	 * 获取：
	 */
	public String getFinStoCreditstatus() {
		return finStoCreditstatus;
	}
	/**
	 * 设置：
	 */
	public void setFinStoHaslegalcase(Integer finStoHaslegalcase) {
		this.finStoHaslegalcase = finStoHaslegalcase;
	}
	/**
	 * 获取：
	 */
	public Integer getFinStoHaslegalcase() {
		return finStoHaslegalcase;
	}
	/**
	 * 设置：
	 */
	public void setFinStoLastmodify(Date finStoLastmodify) {
		this.finStoLastmodify = finStoLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinStoLastmodify() {
		return finStoLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setFinStoName(String finStoName) {
		this.finStoName = finStoName;
	}
	/**
	 * 获取：
	 */
	public String getFinStoName() {
		return finStoName;
	}
	/**
	 * 设置：
	 */
	public void setFinStoPersonalasset(BigDecimal finStoPersonalasset) {
		this.finStoPersonalasset = finStoPersonalasset;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinStoPersonalasset() {
		return finStoPersonalasset;
	}
	/**
	 * 设置：
	 */
	public void setFinStoPersonaldebt(BigDecimal finStoPersonaldebt) {
		this.finStoPersonaldebt = finStoPersonaldebt;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinStoPersonaldebt() {
		return finStoPersonaldebt;
	}
	/**
	 * 设置：
	 */
	public void setFinStoSharerate(Float finStoSharerate) {
		this.finStoSharerate = finStoSharerate;
	}
	/**
	 * 获取：
	 */
	public Float getFinStoSharerate() {
		return finStoSharerate;
	}
	/**
	 * 设置：
	 */
	public void setPkFinStoId(Integer pkFinStoId) {
		this.pkFinStoId = pkFinStoId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkFinStoId() {
		return pkFinStoId;
	}
}
