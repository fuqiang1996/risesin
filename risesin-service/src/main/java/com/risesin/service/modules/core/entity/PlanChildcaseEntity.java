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
@TableName("plan_childcase")
public class PlanChildcaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date finCasAddtime;
	/**
	 * 
	 */
	private Date finCasLastmodify;
	/**
	 * 
	 */
	private Integer fkFinLegrepId;
	/**
	 * 
	 */
	private Integer fkFinPlaId;
	/**
	 * 
	 */
	private Integer fkFinStoId;
	/**
	 * 
	 */
	@TableId
	private Integer pkFinCasId;
	/**
	 * 
	 */
	private Integer fkFinEntId;

	/**
	 * 设置：
	 */
	public void setFinCasAddtime(Date finCasAddtime) {
		this.finCasAddtime = finCasAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinCasAddtime() {
		return finCasAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinCasLastmodify(Date finCasLastmodify) {
		this.finCasLastmodify = finCasLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinCasLastmodify() {
		return finCasLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setFkFinLegrepId(Integer fkFinLegrepId) {
		this.fkFinLegrepId = fkFinLegrepId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkFinLegrepId() {
		return fkFinLegrepId;
	}
	/**
	 * 设置：
	 */
	public void setFkFinPlaId(Integer fkFinPlaId) {
		this.fkFinPlaId = fkFinPlaId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkFinPlaId() {
		return fkFinPlaId;
	}
	/**
	 * 设置：
	 */
	public void setFkFinStoId(Integer fkFinStoId) {
		this.fkFinStoId = fkFinStoId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkFinStoId() {
		return fkFinStoId;
	}
	/**
	 * 设置：
	 */
	public void setPkFinCasId(Integer pkFinCasId) {
		this.pkFinCasId = pkFinCasId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkFinCasId() {
		return pkFinCasId;
	}
	/**
	 * 设置：
	 */
	public void setFkFinEntId(Integer fkFinEntId) {
		this.fkFinEntId = fkFinEntId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkFinEntId() {
		return fkFinEntId;
	}
}
