package com.risesin.service_api.modules.base.entity;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Description  Industry行业类
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="industry" )
public class Industry  implements Serializable {

	private static final long serialVersionUID =  674579360544372711L;

	/**
	 * 编号
	 */
   	@Column(name = "pk_ind_id" )
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long industryId;

	/**
	 * 编号
	 */
	@Column(name = "ind_code" )
	private String industryCode;

	/**
	 * 名称
	 */
   	@Column(name = "ind_name" )
	private String industryName;

	/**
	 * 删除标记
	 */
   	@Column(name = "ind_delflag" )
	private String delflag;

	/**
	 * 父id
	 */
   	@Column(name = "ind_parent" )
	private String industryPid;

	/**
	 * 创建时间
	 */
   	@Column(name = "ind_addtime" )
	private Date addtime;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "ind_lastmodify" )
	private Date lastmodify;

}
