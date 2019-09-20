package com.risesin.service_api.modules.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table ( name ="stockholder" )
public class Stockholder  implements Serializable {

	private static final long serialVersionUID =  4829853889823045948L;

	/**
	 * 创建时间
	 */
   	@Column(name = "fin_sto_addtime" )
	private LocalDateTime addMime;

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
	private LocalDateTime lastModify;

	/**
	 * 股东姓名
	 */
   	@Column(name = "fin_sto_name" )
	private String stoName;

	/**
	 * 个人资产
	 */
   	@Column(name = "fin_sto_personalasset" )
	private BigDecimal stoPersonalAsset;

	/**
	 * 个人债务
	 */
   	@Column(name = "fin_sto_personaldebt" )
	private BigDecimal stoPersonalDebt;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 删除标记
	 */
	@Column(name = "fin_sto_delflag" )
	private Long delFlag;
}
