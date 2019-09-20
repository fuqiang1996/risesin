package com.risesin.service_api.modules.aritle.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

/**
 * 软文实体
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "article")
public class Article implements Serializable {

    private static final long serialVersionUID = 4606409147423120419L;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 外键：拓展通用用户ID
     */
    @Column(name = "fk_ext_com_user_id")
    private Long extComUserId;

    /**
     * 文章标题
     */
    @Column(name = "art_title")
    private String title;

    /**
     * 副标题
     */
    @Column(name = "art_subhead")
    private String subhead;

    /**
     * 自定义备注
     */
    @Column(name = "art_remark")
    private String remark;

    /**
     * 是否置顶：-1 否 0 是
     */
    @Column(name = "art_ontop")
    private Long onTop;

    /**
     * 最后修改时间
     */
    @Column(name = "art_lastmodify")
    private Date lastModify;

    /**
     * 关键字
     */
    @Column(name = "art_keywords")
    private String keywords;

    /**
     * 是否推荐：-1 否 0 是
     */
    @Column(name = "art_iselite")
    private Long isElite;

    /**
     * 简介
     */
    @Column(name = "art_intro")
    private String intro;

    /**
     * 图片正文URL
     */
    @Column(name = "art_img")
    private String img;

    /**
     * 点击数
     */
    @Column(name = "art_hits")
    private Long hits;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "art_delflag")
    private Long delFlag;

    /**
     * 文章来源
     */
    @Column(name = "art_copyfrom")
    private String copyFrom;

    /**
     * 正文
     */
    @Column(name = "art_content")
    private String content;

    /**
     * 作者
     */
    @Column(name = "art_author")
    private String author;

    /**
     * 添加时间
     */
    @Column(name = "art_addtime")
    private Date addTime;

}
