package com.risesin.service.modules.comuser;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;

/**
 * RoleMenu 对象
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "com_role_menu")
public class ComRoleMenu implements Serializable {

    private static final long serialVersionUID = 6827758654704292568L;

    /**
     * 主键ID
     */
    @Column(name = "pk_id")
    @Id
    private Long id;

    /**
     * 角色ID
     */
    @Column(name = "fk_role_id")
    private Long roleId;

    /**
     * 菜单ID
     */
    @Column(name = "fk_menu_id")
    private Long menuId;

}
