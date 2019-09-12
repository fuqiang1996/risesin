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
@TableName("enterprise_info_type")
public class EnterpriseInfoTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date finEntinfotypeAddtime;
	/**
	 * 
	 */
	private String finEntinfotypeCode;
	/**
	 * 
	 */
	private Integer finEntinfotypeDelflag;
	/**
	 * 
	 */
	private Date finEntinfotypeLastmodify;
	/**
	 * 
	 */
	private String finEntinfotypeName;
	/**
	 * 
	 */
	@TableId
	private Integer pkFinEntinfotypeId;

	/**
	 * 设置：
	 */
	public void setFinEntinfotypeAddtime(Date finEntinfotypeAddtime) {
		this.finEntinfotypeAddtime = finEntinfotypeAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinEntinfotypeAddtime() {
		return finEntinfotypeAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinEntinfotypeCode(String finEntinfotypeCode) {
		this.finEntinfotypeCode = finEntinfotypeCode;
	}
	/**
	 * 获取：
	 */
	public String getFinEntinfotypeCode() {
		return finEntinfotypeCode;
	}
	/**
	 * 设置：
	 */
	public void setFinEntinfotypeDelflag(Integer finEntinfotypeDelflag) {
		this.finEntinfotypeDelflag = finEntinfotypeDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getFinEntinfotypeDelflag() {
		return finEntinfotypeDelflag;
	}
	/**
	 * 设置：
	 */
	public void setFinEntinfotypeLastmodify(Date finEntinfotypeLastmodify) {
		this.finEntinfotypeLastmodify = finEntinfotypeLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinEntinfotypeLastmodify() {
		return finEntinfotypeLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setFinEntinfotypeName(String finEntinfotypeName) {
		this.finEntinfotypeName = finEntinfotypeName;
	}
	/**
	 * 获取：
	 */
	public String getFinEntinfotypeName() {
		return finEntinfotypeName;
	}
	/**
	 * 设置：
	 */
	public void setPkFinEntinfotypeId(Integer pkFinEntinfotypeId) {
		this.pkFinEntinfotypeId = pkFinEntinfotypeId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkFinEntinfotypeId() {
		return pkFinEntinfotypeId;
	}
}
