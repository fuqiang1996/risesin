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
 * 通用用户角色
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
@Table(name = "com_role")
public class ComRole implements Serializable {

    private static final long serialVersionUID = 4479212223298268198L;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    private LocalDateTime addTime;

    /**
     * 创建时间
     */
    @Column(name = "role_lastmodified")
    private LocalDateTime lastModified;

    /**
     * 创建用户id
     */
    @Column(name = "fk_user_id_create")
    private Long uerIdCreate;

    /**
     * 排序
     */
    @Column(name = "role_order_num")
    private String orderNum;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "role_delflag")
    private Long delFlag;

}
