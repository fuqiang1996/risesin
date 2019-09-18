package com.risesin.service_api.modules.comment.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description  LoanagencyComment助贷机构评价类
 * @Author  Darling
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name="loanagency_comment")
public class LoanAgencyComment implements Serializable{

	/**
	 * 主键
	 */
	@Id
	@Column(name = "pk_comment_id" )
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long commentId;

	/**
	 * 评价描述
	 */
	@Column(name = "comment_description" )
	private String commentDescription;

	/**
	 * 融资项目id
	 */
	@Column(name = "fk_project_id" )
	private Long projectId;

	/**
	 * 添加时间
	 */
	@Column(name = "comment_addtime" )
	private Date commentAddtime;

	/**
	 * 评分
	 */
	@Column(name = "comment_score" )
	private Integer commentScore;

	/**
	 * 评价类型id
	 */
	@Column(name = "fk_comment_typeid" )
	private Long fkCommentTypeid;
}
