package com.risesin.service_api.modules.system.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

/**
 * 权限对象
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
@Table(name = "sys_permission")
@DynamicInsert
@DynamicUpdate
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 5870616841516286079L;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_per_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 权限名称
     */
    @Column(name = "per_name")
    private String perName;

    /**
     * 权限标识
     */
    @Column(name = "per_perms")
    private String perPerms;

    /**
     * 权限url
     */
    @Column(name = "per_url")
    private String perUrl;

    /**
     * 父级权限
     */
    @Column(name = "per_parent_id")
    private Long perParentId;

    /**
     * 描述与备注
     */
    @Column(name = "per_remark")
    private String perRemark;

    /**
     * 排序
     */
    @Column(name = "per_order_num")
    private Long perOrderNum;

    /**
     * 创建时间
     */
    @Column(name = "per_addtime")
    private LocalDateTime addTime;

    /**
     * 修改时间
     */
    @Column(name = "per_lastmodify")
    private LocalDateTime lastModify;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "per_delflag")
    private Long delFlag;

}
