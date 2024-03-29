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
 * @Description  
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
@Table ( name ="plan_childcase" )
public class PlanChildcase  implements Serializable {

	private static final long serialVersionUID =  3781762127491165054L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_cas_addtime" )
	private LocalDateTime addTime;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_cas_lastmodify" )
	private LocalDateTime lastModify;

	/**
	 * 法人id
	 */
   	@Column(name = "fk_fin_legrep_id" )
	private Long repId;

	/**
	 * 融资预案id
	 */
   	@Column(name = "fk_fin_pla_id" )
	private Long planId;

	/**
	 * 股东id
	 */
   	@Column(name = "fk_fin_sto_id" )
	private Long stockolderId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_fin_cas_id" )
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 融资主体id
	 */
   	@Column(name = "fk_fin_ent_id" )
	private Long entId;

	/**
	 * 删除标记
	 */
	@Column(name = "fin_cas_delflag" )
	private Long delFlag;

}
