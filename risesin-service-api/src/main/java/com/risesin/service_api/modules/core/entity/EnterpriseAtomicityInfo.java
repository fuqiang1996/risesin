package com.risesin.service_api.modules.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


/**
 * @Description  EnterpriseAtomicityInfo企业独立信息类
 * @Author  Baby
 * @Date 2019-09-16 
 */
@Accessors(chain = true) // 可将对象转换成链式设置值(流的形式)
@DynamicInsert // 插入或者修改时 字符串为 ''
@DynamicUpdate
@Setter
@Getter
@ToString
@Entity
@Table ( name ="enterprise_atomicity_info" )
public class EnterpriseAtomicityInfo  implements Serializable {

	private static final long serialVersionUID =  5891211446139314018L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_entinfo_addtime" )
	private LocalDateTime addTime;

	/**
	 * 编号
	 */
   	@Column(name = "fin_entinfo_code" )
	private String atoInfoCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "fin_entinfo_delflag" )
	private Long delFlag;

	/**
	 * 描述
	 */
   	@Column(name = "fin_entinfo_description" )
	private String atoInfoDescription;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_entinfo_lastmodify" )
	private LocalDateTime lastModify;

	/**
	 * 名称
	 */
   	@Column(name = "fin_entinfo_name" )
	private String atoInfoName;

	/**
	 * 企业信息类型id
	 */
   	@Column(name = "fk_fin_entinfotype_id" )
	private Long infoTypeId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_fin_entinfo_id" )
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

}
