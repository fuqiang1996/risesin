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
 * SysPermissionRole对象
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
@Table(name = "sys_permission_role")
@DynamicInsert
@DynamicUpdate
public class SysPermissionRole implements Serializable {

    private static final long serialVersionUID = 4907592795468149437L;

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
     * 权限ID
     */
    @Column(name = "fk_permission_id")
    private Long fkPermissionId;

}
