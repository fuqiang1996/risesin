package com.risesin.service_api.modules.product.entity;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

/**
 * @Description  ProductAuth产品代理类
 * @Author  Baby
 * @Date 2019-09-16 
 */
@Accessors(chain = true)
@Setter
@Getter
@ToString
@Entity
@Table ( name ="product_auth" )
@DynamicInsert
@DynamicUpdate
public class ProductAuth  implements Serializable {

	private static final long serialVersionUID =  6918880329740580610L;

	/**
	 * 主键
	 */
	@Column(name = "pk_fin_pro_aut_id" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_pro_aut_addtime")
	private LocalDateTime addTime;

	/**
	 * 编号
	 */
   	@Column(name = "fin_pro_aut_code" )
	private String proAuthCode;

	/**
	 * 删除标记
	 */
   	@Column(name = "fin_pro_aut_delflag" )
	private Long delFlag;

	/**
	 * 最后修改时间
	 */
   	@Column(name = "fin_pro_aut_lastmodify" )
	private LocalDateTime lastModify;

	/**
	 * 代理费率
	 */
   	@Column(name = "fin_pro_auth_rate" )
	private Double proAuthRate;

	/**
	 * 产品代理审核状态
	 */
   	@Column(name = "fin_pro_auth_state",columnDefinition="varchar(255) default '[]'")
	private String proAuthState;

	/**
	 * 产品id
	 */
   	@Column(name = "fk_fin_pro_id" )
	private Long productId;

	/**
	 * 审核人id
	 */
   	@Column(name = "fk_sys_usr_id" )
	private Long sysUserId;

}
