package com.risesin.service_api.modules.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @Description  FintypeLinkChildcase融资类型与支线方案连接表
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
@Table ( name ="fintype_link_childcase" )
public class FintypeLinkChildcase  implements Serializable {

	private static final long serialVersionUID =  8875407245246304939L;


	/**
	 * 主键
	 */
	@Column(name = "pk_fin_lin_cas_id" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 融资类型id
	 */
   	@Column(name = "fk_fin_type_id" )
	private Long finTypeId;

	/**
	 * 支线方案id
	 */
   	@Column(name = "fk_fin_cas_id" )
	private Long caseId;

}
