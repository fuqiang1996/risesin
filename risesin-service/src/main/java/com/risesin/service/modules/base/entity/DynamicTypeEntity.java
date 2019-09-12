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
@TableName("dynamic_type")
public class DynamicTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date dynTypAddtime;
	/**
	 * 
	 */
	private String dynTypCode;
	/**
	 * 
	 */
	private Integer dynTypDelflag;
	/**
	 * 
	 */
	private Date dynTypLastmodify;
	/**
	 * 
	 */
	private String dynTypName;
	/**
	 * 
	 */
	@TableId
	private Integer pkDynTypId;
	/**
	 * 
	 */
	private Integer fkSysUserid;

	/**
	 * 设置：
	 */
	public void setDynTypAddtime(Date dynTypAddtime) {
		this.dynTypAddtime = dynTypAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getDynTypAddtime() {
		return dynTypAddtime;
	}
	/**
	 * 设置：
	 */
	public void setDynTypCode(String dynTypCode) {
		this.dynTypCode = dynTypCode;
	}
	/**
	 * 获取：
	 */
	public String getDynTypCode() {
		return dynTypCode;
	}
	/**
	 * 设置：
	 */
	public void setDynTypDelflag(Integer dynTypDelflag) {
		this.dynTypDelflag = dynTypDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getDynTypDelflag() {
		return dynTypDelflag;
	}
	/**
	 * 设置：
	 */
	public void setDynTypLastmodify(Date dynTypLastmodify) {
		this.dynTypLastmodify = dynTypLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getDynTypLastmodify() {
		return dynTypLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setDynTypName(String dynTypName) {
		this.dynTypName = dynTypName;
	}
	/**
	 * 获取：
	 */
	public String getDynTypName() {
		return dynTypName;
	}
	/**
	 * 设置：
	 */
	public void setPkDynTypId(Integer pkDynTypId) {
		this.pkDynTypId = pkDynTypId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkDynTypId() {
		return pkDynTypId;
	}
	/**
	 * 设置：
	 */
	public void setFkSysUserid(Integer fkSysUserid) {
		this.fkSysUserid = fkSysUserid;
	}
	/**
	 * 获取：
	 */
	public Integer getFkSysUserid() {
		return fkSysUserid;
	}
}
