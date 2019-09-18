package com.risesin.service_api.modules.base.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description  CommentType评价类型
 * @Author  Darling
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name="comment_type")
public class CommentType implements Serializable{

	/**
	 * 主键
	 */
	@Id
	@Column(name = "pk_comt_typ_id" )
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long comtTypeId;

	/**
	 * 创建时间
	 */
	@Column(name = "comt_type_addtime" )
	private Date addtime;

	/**
	 * 最后修改时间
	 */
	@Column(name = "cstt_comt_type_lastmodify" )
	private Date lastmodify;

	/**
	 * 评价类型
	 */
	@Column(name = "comt_type_name" )
	private String comtTypeName;

	/**
	 * 状态（0：睡眠，1：可用）
	 */
	@Column(name = "comt_type_state" )
	private Integer comtTypeState;
	
}
