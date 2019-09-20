package com.risesin.service_api.modules.comuser.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


/**
 * 通用用户权限表
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */
@Accessors(chain = true) // 可将对象转换成链式设置值(流的形式)
@DynamicInsert // 插入或者修改时 字符串为 ''
@DynamicUpdate
@Setter
@Getter
@ToString
@Entity
@Table(name = "com_permission")
public class ComPermission implements Serializable {

    private static final long serialVersionUID = 7434629412203101540L;

    /**
     * 权限ID
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
    private Long parentId;

    /**
     * 描述与备注
     */
    @Column(name = "per_remark")
    private String remark;

    /**
     * 排序
     */
    @Column(name = "per_order_num")
    private Long orderNum;

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
