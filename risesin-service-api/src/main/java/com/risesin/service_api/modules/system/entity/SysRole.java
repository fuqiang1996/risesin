package com.risesin.service_api.modules.system.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 角色实体
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "sys_role")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 2413038774822406361L;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pkRoleId;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色标识
     */
    @Column(name = "role_sign")
    private String roleSign;

    /**
     * 创建时间
     */
    @Column(name = "role_addtime")
    private Date roleAddtime;

    /**
     * 最后修改时间
     */
    @Column(name = "role_lastmodified")
    private Date roleLastmodified;

    /**
     * 创建用户id
     */
    @Column(name = "fk_user_id_create")
    private Long fkUserIdCreate;

    /**
     * 排序
     */
    @Column(name = "role_order_num")
    private String roleOrderNum;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "role_delflag")
    private Long roleDelflag;

}
