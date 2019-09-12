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
@TableName("service_expense_order")
public class ServiceExpenseOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date expOrdAddtime;
	/**
	 * 
	 */
	private String expOrdCode;
	/**
	 * 
	 */
	private Integer expOrdDelflag;
	/**
	 * 
	 */
	private BigDecimal expOrdMoney;
	/**
	 * 
	 */
	private Integer expOrdStatus;
	/**
	 * 
	 */
	@TableId
	private Integer pkExpOrdId;
	/**
	 * 
	 */
	private Integer fkExpTypId;
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
	private Integer commodityNum;
	/**
	 * 
	 */
	private Double commodityPrice;
	/**
	 * 
	 */
	private String commodityUrl;
	/**
	 * 
	 */
	private String expOrdRemark;
	/**
	 * 
	 */
	private Date expOrdClosetime;
	/**
	 * 
	 */
	private String serPackageCode;

	/**
	 * 设置：
	 */
	public void setExpOrdAddtime(Date expOrdAddtime) {
		this.expOrdAddtime = expOrdAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getExpOrdAddtime() {
		return expOrdAddtime;
	}
	/**
	 * 设置：
	 */
	public void setExpOrdCode(String expOrdCode) {
		this.expOrdCode = expOrdCode;
	}
	/**
	 * 获取：
	 */
	public String getExpOrdCode() {
		return expOrdCode;
	}
	/**
	 * 设置：
	 */
	public void setExpOrdDelflag(Integer expOrdDelflag) {
		this.expOrdDelflag = expOrdDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getExpOrdDelflag() {
		return expOrdDelflag;
	}
	/**
	 * 设置：
	 */
	public void setExpOrdMoney(BigDecimal expOrdMoney) {
		this.expOrdMoney = expOrdMoney;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getExpOrdMoney() {
		return expOrdMoney;
	}
	/**
	 * 设置：
	 */
	public void setExpOrdStatus(Integer expOrdStatus) {
		this.expOrdStatus = expOrdStatus;
	}
	/**
	 * 获取：
	 */
	public Integer getExpOrdStatus() {
		return expOrdStatus;
	}
	/**
	 * 设置：
	 */
	public void setPkExpOrdId(Integer pkExpOrdId) {
		this.pkExpOrdId = pkExpOrdId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkExpOrdId() {
		return pkExpOrdId;
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
	public void setCommodityNum(Integer commodityNum) {
		this.commodityNum = commodityNum;
	}
	/**
	 * 获取：
	 */
	public Integer getCommodityNum() {
		return commodityNum;
	}
	/**
	 * 设置：
	 */
	public void setCommodityPrice(Double commodityPrice) {
		this.commodityPrice = commodityPrice;
	}
	/**
	 * 获取：
	 */
	public Double getCommodityPrice() {
		return commodityPrice;
	}
	/**
	 * 设置：
	 */
	public void setCommodityUrl(String commodityUrl) {
		this.commodityUrl = commodityUrl;
	}
	/**
	 * 获取：
	 */
	public String getCommodityUrl() {
		return commodityUrl;
	}
	/**
	 * 设置：
	 */
	public void setExpOrdRemark(String expOrdRemark) {
		this.expOrdRemark = expOrdRemark;
	}
	/**
	 * 获取：
	 */
	public String getExpOrdRemark() {
		return expOrdRemark;
	}
	/**
	 * 设置：
	 */
	public void setExpOrdClosetime(Date expOrdClosetime) {
		this.expOrdClosetime = expOrdClosetime;
	}
	/**
	 * 获取：
	 */
	public Date getExpOrdClosetime() {
		return expOrdClosetime;
	}
	/**
	 * 设置：
	 */
	public void setSerPackageCode(String serPackageCode) {
		this.serPackageCode = serPackageCode;
	}
	/**
	 * 获取：
	 */
	public String getSerPackageCode() {
		return serPackageCode;
	}
}
