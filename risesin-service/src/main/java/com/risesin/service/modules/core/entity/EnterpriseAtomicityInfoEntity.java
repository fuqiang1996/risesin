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
 * @date 2019-09-12 15:12:05
 */
@TableName("enterprise_atomicity_info")
public class EnterpriseAtomicityInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date finEntinfoAddtime;
	/**
	 * 
	 */
	private String finEntinfoCode;
	/**
	 * 
	 */
	private Integer finEntinfoDelflag;
	/**
	 * 
	 */
	private String finEntinfoDescription;
	/**
	 * 
	 */
	private Date finEntinfoLastmodify;
	/**
	 * 
	 */
	private String finEntinfoName;
	/**
	 * 
	 */
	private Integer fkFinEntinfotypeId;
	/**
	 * 
	 */
	@TableId
	private Integer pkFinEntinfoId;

	/**
	 * 设置：
	 */
	public void setFinEntinfoAddtime(Date finEntinfoAddtime) {
		this.finEntinfoAddtime = finEntinfoAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinEntinfoAddtime() {
		return finEntinfoAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinEntinfoCode(String finEntinfoCode) {
		this.finEntinfoCode = finEntinfoCode;
	}
	/**
	 * 获取：
	 */
	public String getFinEntinfoCode() {
		return finEntinfoCode;
	}
	/**
	 * 设置：
	 */
	public void setFinEntinfoDelflag(Integer finEntinfoDelflag) {
		this.finEntinfoDelflag = finEntinfoDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getFinEntinfoDelflag() {
		return finEntinfoDelflag;
	}
	/**
	 * 设置：
	 */
	public void setFinEntinfoDescription(String finEntinfoDescription) {
		this.finEntinfoDescription = finEntinfoDescription;
	}
	/**
	 * 获取：
	 */
	public String getFinEntinfoDescription() {
		return finEntinfoDescription;
	}
	/**
	 * 设置：
	 */
	public void setFinEntinfoLastmodify(Date finEntinfoLastmodify) {
		this.finEntinfoLastmodify = finEntinfoLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinEntinfoLastmodify() {
		return finEntinfoLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setFinEntinfoName(String finEntinfoName) {
		this.finEntinfoName = finEntinfoName;
	}
	/**
	 * 获取：
	 */
	public String getFinEntinfoName() {
		return finEntinfoName;
	}
	/**
	 * 设置：
	 */
	public void setFkFinEntinfotypeId(Integer fkFinEntinfotypeId) {
		this.fkFinEntinfotypeId = fkFinEntinfotypeId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkFinEntinfotypeId() {
		return fkFinEntinfotypeId;
	}
	/**
	 * 设置：
	 */
	public void setPkFinEntinfoId(Integer pkFinEntinfoId) {
		this.pkFinEntinfoId = pkFinEntinfoId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkFinEntinfoId() {
		return pkFinEntinfoId;
	}
}
