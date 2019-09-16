package com.risesin.service.modules.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Description  
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="stockholder" )
public class Stockholder  implements Serializable {

	private static final long serialVersionUID =  4829853889823045948L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_sto_addtime" )
	private Date addtime;

	/**
	 * 年龄
	 */
   	@Column(name = "fin_sto_age" )
	private Long stoAge;

	/**
	 * 编号
	 */
   	@Column(name = "fin_sto_code" )
	private String stoCode;

	/**
	 * 征信状况
	 */
   	@Column(name = "fin_sto_creditstatus" )
	private String stoCreditStatus;

	/**
	 * 是否有执行的司法案件
	 */
   	@Column(name = "fin_sto_haslegalcase" )
	private Long hasLegalcase;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_sto_lastmodify" )
	private Date lastmodify;

	/**
	 * 股东姓名
	 */
   	@Column(name = "fin_sto_name" )
	private String stoName;

	/**
	 * 个人资产
	 */
   	@Column(name = "fin_sto_personalasset" )
	private Double stoPersonalAsset;

	/**
	 * 个人债务
	 */
   	@Column(name = "fin_sto_personaldebt" )
	private Double stoPersonalDebt;

	/**
	 * 股份所占比例
	 */
   	@Column(name = "fin_sto_sharerate" )
	private Double stoSharerate;

	/**
	 * 主键
	 */
   	@Column(name = "pk_fin_sto_id" )
    @Id
	private Long StockholderId;

}
