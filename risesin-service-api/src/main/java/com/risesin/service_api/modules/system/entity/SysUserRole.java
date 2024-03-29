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
 * SysUserRole 对象
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
@Table(name = "sys_user_role")
@DynamicInsert
@DynamicUpdate
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = 4631097168623753841L;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "fk_common_user_id")
    private Long commonUserId;

    /**
     * 角色ID
     */
    @Column(name = "fk_role_id")
    private Long roleId;

}
