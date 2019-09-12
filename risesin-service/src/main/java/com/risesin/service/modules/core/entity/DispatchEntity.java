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
 * @date 2019-09-12 15:11:50
 */
@TableName("dispatch")
public class DispatchEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date finDispaAddtime;
	/**
	 * 
	 */
	private String finDispaCode;
	/**
	 * 
	 */
	private Integer finDispaDelflag;
	/**
	 * 
	 */
	private String finDispaDesc;
	/**
	 * 
	 */
	private Date finDispaLastmodify;
	/**
	 * 
	 */
	private Integer fkComUserid;
	/**
	 * 
	 */
	private Integer fkPlanCode;
	/**
	 * 
	 */
	private Integer fkLoanAgenId;
	/**
	 * 
	 */
	@TableId
	private Integer pkFinDispaId;

	/**
	 * 设置：
	 */
	public void setFinDispaAddtime(Date finDispaAddtime) {
		this.finDispaAddtime = finDispaAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinDispaAddtime() {
		return finDispaAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinDispaCode(String finDispaCode) {
		this.finDispaCode = finDispaCode;
	}
	/**
	 * 获取：
	 */
	public String getFinDispaCode() {
		return finDispaCode;
	}
	/**
	 * 设置：
	 */
	public void setFinDispaDelflag(Integer finDispaDelflag) {
		this.finDispaDelflag = finDispaDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getFinDispaDelflag() {
		return finDispaDelflag;
	}
	/**
	 * 设置：
	 */
	public void setFinDispaDesc(String finDispaDesc) {
		this.finDispaDesc = finDispaDesc;
	}
	/**
	 * 获取：
	 */
	public String getFinDispaDesc() {
		return finDispaDesc;
	}
	/**
	 * 设置：
	 */
	public void setFinDispaLastmodify(Date finDispaLastmodify) {
		this.finDispaLastmodify = finDispaLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinDispaLastmodify() {
		return finDispaLastmodify;
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
	public void setFkPlanCode(Integer fkPlanCode) {
		this.fkPlanCode = fkPlanCode;
	}
	/**
	 * 获取：
	 */
	public Integer getFkPlanCode() {
		return fkPlanCode;
	}
	/**
	 * 设置：
	 */
	public void setFkLoanAgenId(Integer fkLoanAgenId) {
		this.fkLoanAgenId = fkLoanAgenId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkLoanAgenId() {
		return fkLoanAgenId;
	}
	/**
	 * 设置：
	 */
	public void setPkFinDispaId(Integer pkFinDispaId) {
		this.pkFinDispaId = pkFinDispaId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkFinDispaId() {
		return pkFinDispaId;
	}
}
