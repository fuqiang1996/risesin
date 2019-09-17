package com.risesin.service_api.modules.system.entity;

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
@Table ( name ="sys_role_menu" )
public class SysRoleMenu  implements Serializable {

	private static final long serialVersionUID =  6912470049793540652L;

	/**
	 * 主键ID：自动增长
	 */
   	@Column(name = "pk_id" )
    @Id
	private Long pkId;

	/**
	 * 角色ID
	 */
   	@Column(name = "fk_role_id" )
	private Long fkRoleId;

	/**
	 * 菜单ID
	 */
   	@Column(name = "fk_menu_id" )
	private Long fkMenuId;

}
