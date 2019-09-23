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
 * @Description FinancingType融资类型类
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "financing_type")
public class FinancingType implements Serializable {

    private static final long serialVersionUID = 5857576786137974972L;

    /**
     * 主键
     */
    @Column(name = "pk_fin_type_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    @Column(name = "fin_type_name")
    private String finTypeName;

    /**
     * 父id
     */
    @Column(name = "fin_type_parent")
    private String finTypePid;

    /**
     * 排序
     */
    @Column(name = "fin_type_seq")
    private Long finTypeSeq;

    /**
     * 删除标记
     */
    @Column(name = "fin_type_delflag")
    private Long delFlag;

    /**
     * 节点url
     */
    @Column(name = "fin_type_url")
    private String finTypeUrl;

    /**
     * 创建时间
     */
    @Column(name = "fin_type_addtime")
    private Date addTime;

    /**
     * 最后修改时间
     */
    @Column(name = "fin_type_lastmodify")
    private Date lastModify;

}
