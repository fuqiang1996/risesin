package com.risesin.service_api.modules.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Description  LegalRepresentative法人代表类
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="legal_representative" )
public class LegalRepresentative  implements Serializable {

	private static final long serialVersionUID =  3271761717565383349L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_legrep_addtime" )
	private Date addtime;

	/**
	 * 年龄
	 */
   	@Column(name = "fin_legrep_age" )
	private Long repAge;

	/**
	 * 编号
	 */
   	@Column(name = "fin_legrep_code" )
	private String repCode;

	/**
	 * 征信状况
	 */
   	@Column(name = "fin_legrep_creditstatus" )
	private String repCreditstatus;

	/**
	 * 删除标记
	 */
   	@Column(name = "fin_legrep_delflag" )
	private Long delflag;

	/**
	 * 是否有司法案件
	 */
   	@Column(name = "fin_legrep_haslegcase" )
	private Long hasLegalcase;

	/**
	 * 是否股东
	 */
   	@Column(name = "fin_legrep_isstockholder" )
	private Long isStockholder;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_legrep_lastmodify" )
	private Date lastmodify;

	/**
	 * 法人代表姓名
	 */
   	@Column(name = "fin_legrep_name" )
	private String repName;

	/**
	 * 个人资产
	 */
   	@Column(name = "fin_legrep_personalasset" )
	private Double repPersonalAsset;

	/**
	 * 个人负债
	 */
   	@Column(name = "fin_legrep_personaldebt" )
	private Double repPersonalDebt;

	/**
	 * 股份所占比例
	 */
   	@Column(name = "fin_legrep_sharerate" )
	private Double repSharerate;

	/**
	 * 起任时间
	 */
   	@Column(name = "fin_legrep_startingtime" )
	private Date repStartingTime;

	/**
	 * 主键
	 */
   	@Column(name = "pk_fin_legrep_id" )
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long repId;

}
