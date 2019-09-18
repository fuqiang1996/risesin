package com.risesin.service_api.modules.comuser.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 通用用户拓展
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "ext_common_user")
public class ExtCommonUser implements Serializable {

    private static final long serialVersionUID = 2561082346877530573L;

    /**
     * 主键ID
     */
    @Id
    @Column(name = "pk_ext_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 外键：用户ID
     */
    @Column(name = "fk_com_user_id")
    private Long comUserId;

    /**
     * 外键：渠道ID
     */
    @Column(name = "fk_cha_def_id")
    private Long chaDefId;

    /**
     * 定制软文URL
     */
    @Column(name = "ext_share_link")
    private String extShareLink;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "ext_delflag")
    private Long extDelflag;

    /**
     * 用户名
     */
    @Column(name = "ext_com_username")
    private String extComUsername;

    /**
     * 用户名
     */
    @Column(name = "ext_com_user_addtime")
    private Date extComUserAddtime;

    /**
     * 渠道名称
     */
    @Column(name = "ext_cha_def_name")
    private String extChaDefName;

}