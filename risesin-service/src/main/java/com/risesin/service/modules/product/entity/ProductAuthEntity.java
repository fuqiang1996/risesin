package com.risesin.service.modules.product.entity;

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
@TableName("product_auth")
public class ProductAuthEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date finProAutAddtime;
	/**
	 * 
	 */
	private String finProAutCode;
	/**
	 * 
	 */
	private Integer finProAutDelflag;
	/**
	 * 
	 */
	private Date finProAutLastmodify;
	/**
	 * 
	 */
	private Float finProAuthRate;
	/**
	 * 
	 */
	private String finProAuthState;
	/**
	 * 
	 */
	private Integer fkFinProId;
	/**
	 * 
	 */
	private Integer fkSysUsrId;
	/**
	 * 
	 */
	@TableId
	private Integer pkFinProAutId;

	/**
	 * 设置：
	 */
	public void setFinProAutAddtime(Date finProAutAddtime) {
		this.finProAutAddtime = finProAutAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinProAutAddtime() {
		return finProAutAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinProAutCode(String finProAutCode) {
		this.finProAutCode = finProAutCode;
	}
	/**
	 * 获取：
	 */
	public String getFinProAutCode() {
		return finProAutCode;
	}
	/**
	 * 设置：
	 */
	public void setFinProAutDelflag(Integer finProAutDelflag) {
		this.finProAutDelflag = finProAutDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getFinProAutDelflag() {
		return finProAutDelflag;
	}
	/**
	 * 设置：
	 */
	public void setFinProAutLastmodify(Date finProAutLastmodify) {
		this.finProAutLastmodify = finProAutLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinProAutLastmodify() {
		return finProAutLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setFinProAuthRate(Float finProAuthRate) {
		this.finProAuthRate = finProAuthRate;
	}
	/**
	 * 获取：
	 */
	public Float getFinProAuthRate() {
		return finProAuthRate;
	}
	/**
	 * 设置：
	 */
	public void setFinProAuthState(String finProAuthState) {
		this.finProAuthState = finProAuthState;
	}
	/**
	 * 获取：
	 */
	public String getFinProAuthState() {
		return finProAuthState;
	}
	/**
	 * 设置：
	 */
	public void setFkFinProId(Integer fkFinProId) {
		this.fkFinProId = fkFinProId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkFinProId() {
		return fkFinProId;
	}
	/**
	 * 设置：
	 */
	public void setFkSysUsrId(Integer fkSysUsrId) {
		this.fkSysUsrId = fkSysUsrId;
	}
	/**
	 * 获取：
	 */
	public Integer getFkSysUsrId() {
		return fkSysUsrId;
	}
	/**
	 * 设置：
	 */
	public void setPkFinProAutId(Integer pkFinProAutId) {
		this.pkFinProAutId = pkFinProAutId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkFinProAutId() {
		return pkFinProAutId;
	}
}
