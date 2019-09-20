package com.risesin.service_api.modules.system.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * SysRoleMenu 对象
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */
@Accessors(chain = true)
@Setter
@Getter
@ToString
@Entity
@Table(name = "sys_role_menu")
@DynamicInsert
@DynamicUpdate
public class SysRoleMenu implements Serializable {

    private static final long serialVersionUID = 6912470049793540652L;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色ID
     */
    @Column(name = "fk_role_id")
    private Long fkRoleId;

    /**
     * 菜单ID
     */
    @Column(name = "fk_menu_id")
    private Long fkMenuId;

}
