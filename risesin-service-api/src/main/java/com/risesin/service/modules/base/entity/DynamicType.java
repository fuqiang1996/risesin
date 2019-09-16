package com.risesin.service.modules.base.entity;

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
 * @Description  DynamicType动态类型类
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="dynamic_type" )
public class DynamicType  implements Serializable {

	private static final long serialVersionUID =  1932582936320963437L;

	/**
	 * 创建时间
	 */
   	@Column(name = "dyn_typ_addtime" )
	private Date addtime;

	/**
	 * 编号
	 */
   	@Column(name = "dyn_typ_code" )
	private String dynTypeCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "dyn_typ_delflag" )
	private Long delflag;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "dyn_typ_lastmodify" )
	private Date lastmodify;

	/**
	 * 名称
	 */
   	@Column(name = "dyn_typ_name" )
	private String dynTypeName;

	/**
	 * 主键
	 */
   	@Column(name = "pk_dyn_typ_id" )
    @Id
	private Long dynTypeId;

	/**
	 * 平台用户id
	 */
   	@Column(name = "fk_sys_userid" )
	private Long sysUserId;

}
