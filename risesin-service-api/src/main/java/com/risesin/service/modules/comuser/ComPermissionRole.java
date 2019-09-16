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
 * PermissionRole 对象
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "com_permission_role")
public class ComPermissionRole implements Serializable {

    private static final long serialVersionUID = 5566268858746947053L;

    /**
     * 主键ID：自动增长
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
     * 权限ID
     */
    @Column(name = "fk_permission_id")
    private Long permissionId;

}
