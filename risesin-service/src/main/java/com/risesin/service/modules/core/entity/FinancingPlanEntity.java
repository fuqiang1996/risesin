package com.risesin.service.modules.core.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author fuqiang
 * @email 1607711260@gmail.com
 * @date 2019-09-12 15:11:50
 */
@TableName("financing_plan")
public class FinancingPlanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date finPlaAddtime;
	/**
	 * 
	 */
	private String finPlaApplicant;
	/**
	 * 
	 */
	private String finPlaApplicantemail;
	/**
	 * 
	 */
	private String finPlaApplicanttel;
	/**
	 * 
	 */
	private String finPlaCode;
	/**
	 * 
	 */
	private Integer finPlaDelflag;
	/**
	 * 
	 */
	private BigDecimal finPlaDemandquota;
	/**
	 * 
	 */
	private Date finPlaExpecttime;
	/**
	 * 
	 */
	private String finPlaGuaranteemode;
	/**
	 * 
	 */
	private Date finPlaLastmodify;
	/**
	 * 
	 */
	private Float finPlaMaxrate;
	/**
	 * 
	 */
	private Float finPlaMinrete;
	/**
	 * 
	 */
	private String finPlaPayment;
	/**
	 * 
	 */
	private String finPlaUseness;
	/**
	 * 
	 */
	private Integer fkSysUsrId;
	/**
	 * 
	 */
	@TableId
	private Integer pkFinPlaId;
	/**
	 * 
	 */
	private String finPlaStatus;
	/**
	 * 
	 */
	private String finPlaStage;

	/**
	 * 设置：
	 */
	public void setFinPlaAddtime(Date finPlaAddtime) {
		this.finPlaAddtime = finPlaAddtime;
	}
	/**
	 * 获取：
	 */
	public Date getFinPlaAddtime() {
		return finPlaAddtime;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaApplicant(String finPlaApplicant) {
		this.finPlaApplicant = finPlaApplicant;
	}
	/**
	 * 获取：
	 */
	public String getFinPlaApplicant() {
		return finPlaApplicant;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaApplicantemail(String finPlaApplicantemail) {
		this.finPlaApplicantemail = finPlaApplicantemail;
	}
	/**
	 * 获取：
	 */
	public String getFinPlaApplicantemail() {
		return finPlaApplicantemail;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaApplicanttel(String finPlaApplicanttel) {
		this.finPlaApplicanttel = finPlaApplicanttel;
	}
	/**
	 * 获取：
	 */
	public String getFinPlaApplicanttel() {
		return finPlaApplicanttel;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaCode(String finPlaCode) {
		this.finPlaCode = finPlaCode;
	}
	/**
	 * 获取：
	 */
	public String getFinPlaCode() {
		return finPlaCode;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaDelflag(Integer finPlaDelflag) {
		this.finPlaDelflag = finPlaDelflag;
	}
	/**
	 * 获取：
	 */
	public Integer getFinPlaDelflag() {
		return finPlaDelflag;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaDemandquota(BigDecimal finPlaDemandquota) {
		this.finPlaDemandquota = finPlaDemandquota;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFinPlaDemandquota() {
		return finPlaDemandquota;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaExpecttime(Date finPlaExpecttime) {
		this.finPlaExpecttime = finPlaExpecttime;
	}
	/**
	 * 获取：
	 */
	public Date getFinPlaExpecttime() {
		return finPlaExpecttime;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaGuaranteemode(String finPlaGuaranteemode) {
		this.finPlaGuaranteemode = finPlaGuaranteemode;
	}
	/**
	 * 获取：
	 */
	public String getFinPlaGuaranteemode() {
		return finPlaGuaranteemode;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaLastmodify(Date finPlaLastmodify) {
		this.finPlaLastmodify = finPlaLastmodify;
	}
	/**
	 * 获取：
	 */
	public Date getFinPlaLastmodify() {
		return finPlaLastmodify;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaMaxrate(Float finPlaMaxrate) {
		this.finPlaMaxrate = finPlaMaxrate;
	}
	/**
	 * 获取：
	 */
	public Float getFinPlaMaxrate() {
		return finPlaMaxrate;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaMinrete(Float finPlaMinrete) {
		this.finPlaMinrete = finPlaMinrete;
	}
	/**
	 * 获取：
	 */
	public Float getFinPlaMinrete() {
		return finPlaMinrete;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaPayment(String finPlaPayment) {
		this.finPlaPayment = finPlaPayment;
	}
	/**
	 * 获取：
	 */
	public String getFinPlaPayment() {
		return finPlaPayment;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaUseness(String finPlaUseness) {
		this.finPlaUseness = finPlaUseness;
	}
	/**
	 * 获取：
	 */
	public String getFinPlaUseness() {
		return finPlaUseness;
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
	public void setPkFinPlaId(Integer pkFinPlaId) {
		this.pkFinPlaId = pkFinPlaId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkFinPlaId() {
		return pkFinPlaId;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaStatus(String finPlaStatus) {
		this.finPlaStatus = finPlaStatus;
	}
	/**
	 * 获取：
	 */
	public String getFinPlaStatus() {
		return finPlaStatus;
	}
	/**
	 * 设置：
	 */
	public void setFinPlaStage(String finPlaStage) {
		this.finPlaStage = finPlaStage;
	}
	/**
	 * 获取：
	 */
	public String getFinPlaStage() {
		return finPlaStage;
	}
}
