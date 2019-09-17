package com.risesin.service_api.modules.system.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * SysPermissionRole对象
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "sys_permission_role")
public class SysPermissionRole implements Serializable {

    private static final long serialVersionUID = 4907592795468149437L;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pkId;

    /**
     * 角色ID
     */
    @Column(name = "fk_role_id")
    private Long fkRoleId;

    /**
     * 权限ID
     */
    @Column(name = "fk_permission_id")
    private Long fkPermissionId;

}
