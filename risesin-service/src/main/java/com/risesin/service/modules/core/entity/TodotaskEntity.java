package com.risesin.service.modules.core.entity;


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
@TableName("todotask")
public class TodotaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date finTasAddtime;
	/**
	 * 
	 */
	private String finTasCode;
	/**
	 * 
	 */
	private Integer finTasDelflag;
	/**
	 * 
	 */
	private String finTasDescription;
	/**
	 * 
	 */
	private Date finTasLastmodify;
	/**
	 * 
	 */
	private String finTasName;
	/**
	 * 
	 */
	private String finTasState;
	/**
	 * 
	 */
	private String fkAssCode;
	/**
	 * 
	 */
	private Integer fkActProId;
	/**
	 * 
	 */
	@TableId
	private Integer pkFinTasId;

	/**
	 * 设置：
	 */
	public void setFinTasAddtime(Date finTasAddtime) {
		this.finTasAddtime = finTasAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinTasAddtime() {
		return finTasAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinTasCode(String finTasCode) {
		this.finTasCode = finTasCode;
	}
	/**
	 * 获取：
	 */
	public String getFinTasCode() {
		return finTasCode;
	}
	/**
	 * 设置：
	 */
	public void setFinTasDelflag(Integer finTasDelflag) {
		this.finTasDelflag = finTasDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getFinTasDelflag() {
		return finTasDelflag;
	}
	/**
	 * 设置：
	 */
	public void setFinTasDescription(String finTasDescription) {
		this.finTasDescription = finTasDescription;
	}
	/**
	 * 获取：
	 */
	public String getFinTasDescription() {
		return finTasDescription;
	}
	/**
	 * 设置：
	 */
	public void setFinTasLastmodify(Date finTasLastmodify) {
		this.finTasLastmodify = finTasLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinTasLastmodify() {
		return finTasLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setFinTasName(String finTasName) {
		this.finTasName = finTasName;
	}
	/**
	 * 获取：
	 */
	public String getFinTasName() {
		return finTasName;
	}
	/**
	 * 设置：
	 */
	public void setFinTasState(String finTasState) {
		this.finTasState = finTasState;
	}
	/**
	 * 获取：
	 */
	public String getFinTasState() {
		return finTasState;
	}
	/**
	 * 设置：
	 */
	public void setFkAssCode(String fkAssCode) {
		this.fkAssCode = fkAssCode;
	}
	/**
	 * 获取：
	 */
	public String getFkAssCode() {
		return fkAssCode;
	}
	/**
	 * 设置：
	 */
	public void setFkActProId(Integer fkActProId) {
		this.fkActProId = fkActProId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkActProId() {
		return fkActProId;
	}
	/**
	 * 设置：
	 */
	public void setPkFinTasId(Integer pkFinTasId) {
		this.pkFinTasId = pkFinTasId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkFinTasId() {
		return pkFinTasId;
	}
}
