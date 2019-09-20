package com.risesin.service_api.modules.base.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

/**
 * @Description DynamicType动态类型类
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "dynamic_type")
public class DynamicType implements Serializable {

    private static final long serialVersionUID = 1932582936320963437L;

    /**
     * 创建时间
     */
    @Column(name = "dyn_typ_addtime")
    private Date addTime;

    /**
     * 编号
     */
    @Column(name = "dyn_typ_code")
    private String dynTypeCode;

    /**
     * 删除标记
     */
    @Column(name = "dyn_typ_delflag")
    private Long delFlag;

    /**
     * 最后修改时间
     */
    @Column(name = "dyn_typ_lastmodify")
    private Date lastmodify;

    /**
     * 名称
     */
    @Column(name = "dyn_typ_name")
    private String dynTypeName;

    /**
     * 主键
     */
    @Column(name = "pk_dyn_typ_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dynTypeId;

    /**
     * 平台用户id
     */
    @Column(name = "fk_sys_userid")
    private Long sysUserId;

}
