package com.risesin.service.modules.system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Id;

/**
 * @Description  
 * @Author  Baby
 * @Date 2019-09-16 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="sys_user_role" )
public class SysUserRole  implements Serializable {

	private static final long serialVersionUID =  4631097168623753841L;

	/**
	 * 主键ID：自动增长
	 */
   	@Column(name = "pk_id" )
    @Id
	private Long pkId;

	/**
	 * 用户ID
	 */
   	@Column(name = "fk_common_user_id" )
	private Long fkCommonUserId;

	/**
	 * 角色ID
	 */
   	@Column(name = "fk_role_id" )
	private Long fkRoleId;

}
