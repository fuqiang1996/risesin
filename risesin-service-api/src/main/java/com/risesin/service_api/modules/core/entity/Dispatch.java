package com.risesin.service_api.modules.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Description  Dispatch分单派单类
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="dispatch" )
public class Dispatch  implements Serializable {

	private static final long serialVersionUID =  5374700471412214274L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_dispa_addtime" )
	private Date addtime;

	/**
	 * 编号
	 */
   	@Column(name = "fin_dispa_code" )
	private String dispatchCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "fin_dispa_delflag" )
	private Long delflag;

	/**
	 * 描述信息
	 */
   	@Column(name = "fin_dispa_desc" )
	private String dispatchDesc;

	/**
	 * 最后修改日期
	 */
   	@Column(name = "fin_dispa_lastmodify" )
	private Date lastmodify;

	/**
	 * 管理权（通用(助贷机构)用户id）
	 */
   	@Column(name = "fk_com_userid" )
	private Long commonUserId;

	/**
	 * 融资预案或方案code
	 */
   	@Column(name = "fk_plan_code" )
	private Long planCode;

	/**
	 * 所有权（助贷机构id）
	 */
   	@Column(name = "fk_loan_agen_id" )
	private Long loanAgentId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_fin_dispa_id" )
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dispatchId;

}
