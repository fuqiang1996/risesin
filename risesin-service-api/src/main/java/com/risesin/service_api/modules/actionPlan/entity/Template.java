package com.risesin.service_api.modules.actionPlan.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 定制模板实体
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "template")
public class Template implements Serializable {

    private static final long serialVersionUID = 5497212937435166983L;

    /**
     * 模板主键ID
     */
    @Id
    @Column(name = "pk_tem_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 外键：助贷机构ID
     */
    @Column(name = "fk_loan_agen_id")
    private Long loanAgenId;

    /**
     * 模板封底
     */
    @Column(name = "tem_backcover_url")
    private String backcoverUrl;

    /**
     * 模板结尾
     */
    @Column(name = "tem_end")
    private String end;

    /**
     * 模板开头
     */
    @Column(name = "tem_start")
    private String start;

    /**
     * 主体分析内容
     */
    @Column(name = "tem_main_analysis")
    private String mainAnalysis;

    /**
     * 上传时间
     */
    @Column(name = "tem_addtime")
    private Date addtime;

    /**
     * 产品内容
     */
    @Column(name = "tem_product")
    private String product;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "tem_del_flag")
    private Long delFlag;

    /**
     * 最后修改时间
     */
    @Column(name = "tem_lastmodify")
    private Date lastmodify;

}
