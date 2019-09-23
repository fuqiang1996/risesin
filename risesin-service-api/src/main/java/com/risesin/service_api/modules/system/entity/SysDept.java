package com.risesin.service_api.modules.system.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

/**
 * 平台部门实体
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
@Data
@Table(name = "sys_dept")
@DynamicInsert
@DynamicUpdate
public class SysDept implements Serializable {

    private static final long serialVersionUID = 8449633740536463231L;

    /**
     * 主键
     */
    @Id
    @Column(name = "pk_dept_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 部门名称
     */
    @Column(name = "dept_name")
    private String deptName;

    /**
     * 上级部门ID，一级部门为0
     */
    @Column(name = "dept_parent_id")
    private Long parentId;

    /**
     * 排序
     */
    @Column(name = "dept_order_num")
    private Long orderNum;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "dept_del_flag")
    private Long delFlag;

    /**
     * 公司ID
     */
    @Column(name = "fk_dept_bran_id")
    private Long branId;

    /**
     * 创建时间
     */
    @Column(name = "dept_addtime")
    private LocalDateTime addTime;

    /**
     * 修改时间
     */
    @Column(name = "dept_lastmodify")
    private LocalDateTime lastModify;

}
