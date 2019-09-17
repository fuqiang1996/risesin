package com.risesin.service_api.modules.comuser.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

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
     * 权限ID
     */
    @Column(name = "fk_permission_id")
    private Long permissionId;

}
