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
 * 系统用户拓展实体
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
@Table(name = "ext_sys_user", schema = "risesin", catalog = "")
@DynamicInsert
@DynamicUpdate
public class ExtSysUser implements Serializable {

    private static final long serialVersionUID = 5754605881869413331L;

    /**
     * 主键ID
     */
    @Id
    @Column(name = "pk_ext_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 系统用户ID
     */
    @Column(name = "fk_sys_user_id")
    private Long userId;


    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "ext_delflag")
    private Long delFlag;
    /**
     * 用户名
     */
    @Column(name = "ext_sys_username")
    private String username;
    /**
     * 创建时间
     */
    @Column(name = "ext_sys_user_addtime")
    private LocalDateTime addTime;


}
