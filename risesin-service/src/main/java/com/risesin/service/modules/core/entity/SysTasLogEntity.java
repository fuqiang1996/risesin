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
@TableName("sys_tas_log")
public class SysTasLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Integer fkFinTasId;
	/**
	 * 
	 */
	@TableId
	private Integer pkTasLogId;
	/**
	 * 
	 */
	private Date tasLogAddtime;
	/**
	 * 
	 */
	private String tasLogCode;
	/**
	 * 
	 */
	private Date tasLogLastmodify;
	/**
	 * 
	 */
	private String tasLogOperation;

	/**
	 * 设置：
	 */
	public void setFkFinTasId(Integer fkFinTasId) {
		this.fkFinTasId = fkFinTasId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkFinTasId() {
		return fkFinTasId;
	}
	/**
	 * 设置：
	 */
	public void setPkTasLogId(Integer pkTasLogId) {
		this.pkTasLogId = pkTasLogId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkTasLogId() {
		return pkTasLogId;
	}
	/**
	 * 设置：
	 */
	public void setTasLogAddtime(Date tasLogAddtime) {
		this.tasLogAddtime = tasLogAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getTasLogAddtime() {
		return tasLogAddtime;
	}
	/**
	 * 设置：
	 */
	public void setTasLogCode(String tasLogCode) {
		this.tasLogCode = tasLogCode;
	}
	/**
	 * 获取：
	 */
	public String getTasLogCode() {
		return tasLogCode;
	}
	/**
	 * 设置：
	 */
	public void setTasLogLastmodify(Date tasLogLastmodify) {
		this.tasLogLastmodify = tasLogLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getTasLogLastmodify() {
		return tasLogLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setTasLogOperation(String tasLogOperation) {
		this.tasLogOperation = tasLogOperation;
	}
	/**
	 * 获取：
	 */
	public String getTasLogOperation() {
		return tasLogOperation;
	}
}
