package com.risesin.service_api.modules.aritle.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 分享追踪
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "sharing")
public class Sharing implements Serializable {

    private static final long serialVersionUID = 6198005210658037246L;

    /**
     * 主键ID
     */
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 外键：软文ID
     */
    @Column(name = "fk_art_id")
    private Long artId;

    /**
     * 分享次数
     */
    @Column(name = "sha_count")
    private Long count;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "sha_del_flag")
    private Long delFlag;

    /**
     * 点击率
     */
    @Column(name = "sha_hits")
    private Long hits;

    /**
     * 是否允许编辑：-1 不允许 0 允许
     */
    @Column(name = "sha_isedit")
    private Long isedit;

    /**
     * 分享链接
     */
    @Column(name = "sha_link")
    private String link;

    /**
     * 分享方式
     */
    @Column(name = "sha_method")
    private String method;

    /**
     * 停止分享
     */
    @Column(name = "sha_stopsharing")
    private String stopsharing;

    /**
     * 创建时间
     */
    @Column(name = "sha_addtime")
    private Date addtime;

    /**
     * 最后修改时间
     */
    @Column(name = "sha_lastmodify")
    private Date lastmodify;

}
