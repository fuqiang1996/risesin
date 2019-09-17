package com.risesin.service_api.modules.comuser.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

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
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
