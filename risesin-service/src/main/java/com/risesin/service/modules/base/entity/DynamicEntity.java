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
 * @date 2019-09-12 15:11:50
 */
@TableName("dynamic")
public class DynamicEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date dynAddtime;
	/**
	 * 
	 */
	private String dynContent;
	/**
	 * 
	 */
	private Integer fkComUserid;
	/**
	 * 
	 */
	@TableId
	private Integer pkDynId;

	/**
	 * 设置：
	 */
	public void setDynAddtime(Date dynAddtime) {
		this.dynAddtime = dynAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getDynAddtime() {
		return dynAddtime;
	}
	/**
	 * 设置：
	 */
	public void setDynContent(String dynContent) {
		this.dynContent = dynContent;
	}
	/**
	 * 获取：
	 */
	public String getDynContent() {
		return dynContent;
	}
	/**
	 * 设置：
	 */
	public void setFkComUserid(Integer fkComUserid) {
		this.fkComUserid = fkComUserid;
	}
	/**
	 * 获取：
	 */
	public Integer getFkComUserid() {
		return fkComUserid;
	}
	/**
	 * 设置：
	 */
	public void setPkDynId(Integer pkDynId) {
		this.pkDynId = pkDynId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkDynId() {
		return pkDynId;
	}
}
