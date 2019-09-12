package com.risesin.service.modules.base.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author fuqiang
 * @email 1607711260@gmail.com
 * @date 2019-09-12 15:11:14
 */
@TableName("financing_type")
public class FinancingTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String pkFinTypeId;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String finTypeParent;
	/**
	 * 
	 */
	private Integer finTypeSeq;
	/**
	 * 
	 */
	private Integer finTypeState;
	/**
	 * 
	 */
	private String finTypeUrl;
	/**
	 * 
	 */
	private Date finTypeAddtime;
	/**
	 * 
	 */
	private Date finTypeLastmodify;

	/**
	 * 设置：
	 */
	public void setPkFinTypeId(String pkFinTypeId) {
		this.pkFinTypeId = pkFinTypeId;
	}
	/**
	 * 获取：
	 */
	public String getPkFinTypeId() {
		return pkFinTypeId;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setFinTypeParent(String finTypeParent) {
		this.finTypeParent = finTypeParent;
	}
	/**
	 * 获取：
	 */
	public String getFinTypeParent() {
		return finTypeParent;
	}
	/**
	 * 设置：
	 */
	public void setFinTypeSeq(Integer finTypeSeq) {
		this.finTypeSeq = finTypeSeq;
	}
	/**
	 * 获取：
	 */
	public Integer getFinTypeSeq() {
		return finTypeSeq;
	}
	/**
	 * 设置：
	 */
	public void setFinTypeState(Integer finTypeState) {
		this.finTypeState = finTypeState;
	}
	/**
	 * 获取：
	 */
	public Integer getFinTypeState() {
		return finTypeState;
	}
	/**
	 * 设置：
	 */
	public void setFinTypeUrl(String finTypeUrl) {
		this.finTypeUrl = finTypeUrl;
	}
	/**
	 * 获取：
	 */
	public String getFinTypeUrl() {
		return finTypeUrl;
	}
	/**
	 * 设置：
	 */
	public void setFinTypeAddtime(Date finTypeAddtime) {
		this.finTypeAddtime = finTypeAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinTypeAddtime() {
		return finTypeAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinTypeLastmodify(Date finTypeLastmodify) {
		this.finTypeLastmodify = finTypeLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinTypeLastmodify() {
		return finTypeLastmodify;
	}
}
