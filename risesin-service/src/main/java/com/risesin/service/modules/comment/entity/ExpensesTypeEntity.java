package com.risesin.service.modules.comment.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author fuqiang
 * @email 1607711260@gmail.com
 * @date 2019-09-12 09:48:49
 */
@TableName("expenses_type")
@Data
public class ExpensesTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Date expTypAddtime;
	/**
	 * 
	 */
	private String expTypCode;
	/**
	 * 
	 */
	private Integer expTypDelflag;
	/**
	 * 
	 */
	@TableId
	private Integer pkExpTypId;
	/**
	 * 
	 */
	private Date expTypLastmodify;
	/**
	 * 
	 */
	private String expTypName;
	/**
	 * 
	 */
	private String fkComUserid;
}
