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
@TableName("industry")
public class IndustryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String pkIndCode;
	/**
	 * 
	 */
	private String indName;
	/**
	 * 
	 */
	private String indDelflag;
	/**
	 * 
	 */
	private String indParent;
	/**
	 * 
	 */
	private Date indAddtime;
	/**
	 * 
	 */
	private Date indLastmodify;

	/**
	 * 设置：
	 */
	public void setPkIndCode(String pkIndCode) {
		this.pkIndCode = pkIndCode;
	}
	/**
	 * 获取：
	 */
	public String getPkIndCode() {
		return pkIndCode;
	}
	/**
	 * 设置：
	 */
	public void setIndName(String indName) {
		this.indName = indName;
	}
	/**
	 * 获取：
	 */
	public String getIndName() {
		return indName;
	}
	/**
	 * 设置：
	 */
	public void setIndDelflag(String indDelflag) {
		this.indDelflag = indDelflag;
	}
	/**
	 * 获取：
	 */
	public String getIndDelflag() {
		return indDelflag;
	}
	/**
	 * 设置：
	 */
	public void setIndParent(String indParent) {
		this.indParent = indParent;
	}
	/**
	 * 获取：
	 */
	public String getIndParent() {
		return indParent;
	}
	/**
	 * 设置：
	 */
	public void setIndAddtime(Date indAddtime) {
		this.indAddtime = indAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getIndAddtime() {
		return indAddtime;
	}
	/**
	 * 设置：
	 */
	public void setIndLastmodify(Date indLastmodify) {
		this.indLastmodify = indLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getIndLastmodify() {
		return indLastmodify;
	}
}
