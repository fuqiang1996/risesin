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
 * @Description  ChildcaseLinEntatoinfo 支线方案与企业独立信息的连接类
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
@Table ( name ="childcase_lin_entatoinfo" )
public class ChildcaseLinEntatoinfo  implements Serializable {

	private static final long serialVersionUID =  3564013982715408503L;

	/**
	 * 主键
	 */
	@Column(name = "pk_cas_lin_inf_id" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	/**
	 * 支线方案id
	 */
   	@Column(name = "fk_fin_cas_id" )
	private Long caseId;

	/**
	 * 企业独立信息id
	 */
	@Column(name = "fk_fin_entinfo_id" )
	private Long atoInfoId;

}
