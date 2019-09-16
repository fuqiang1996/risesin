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
 * @Description  Dynamic动态类
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="dynamic" )
public class Dynamic  implements Serializable {

	private static final long serialVersionUID =  8445839373260509431L;

	/**
	 * 创建时间
	 */
   	@Column(name = "dyn_addtime" )
	private Date addtime;

	/**
	 * 业务内容
	 */
   	@Column(name = "dyn_content" )
	private String dynamicContent;

	/**
	 * 通用用户id
	 */
   	@Column(name = "fk_com_userid" )
	private Long commonUserId;

	/**
	 * 主键
	 */
   	@Column(name = "pk_dyn_id" )
    @Id
	private Long dynamicId;

}
