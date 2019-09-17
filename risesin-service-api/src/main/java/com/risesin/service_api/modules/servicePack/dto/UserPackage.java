package com.risesin.service_api.modules.servicePack.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户包
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "user_package")
public class UserPackage implements Serializable {

    private static final long serialVersionUID = 6330794539016641815L;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_user_pack_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 发布时间
     */
    @Column(name = "user_pack_addtime")
    private Date addtime;

    /**
     * 商品编码:随机生成的一个字符串
     */
    @Column(name = "user_pack_code")
    private String code;

    /**
     * 用户包数量
     */
    @Column(name = "user_pack_count")
    private Long count;

    /**
     * 商品主图
     */
    @Column(name = "user_pack_img")
    private String img;

    /**
     * 关键字:方便用户搜索
     */
    @Column(name = "user_pack_keywords")
    private String keywords;

    /**
     * 最后修改时间
     */
    @Column(name = "user_pack_lastmodify")
    private Date lastmodify;

    /**
     * 用户包名称排序
     */
    @Column(name = "user_pack_name")
    private String packName;

    /**
     * 排序
     */
    @Column(name = "user_pack_ordernum")
    private Long ordernum;

    /**
     * 商品最低价:为了吸引用户进入浏览 给出最低配置甚至配件价格
     */
    @Column(name = "user_pack_price")
    private Long price;

    /**
     * 点击量
     */
    @Column(name = "user_pack_pv")
    private Long packPv;

    /**
     * 是否删除：-1 已删除 0 下架 1 上架
     */
    @Column(name = "user_pack_delflag")
    private Long delflag;

    /**
     * 用户数量
     */
    @Column(name = "user_pack_usercount")
    private Long userPackCount;

    /**
     * 商品描述
     */
    @Column(name = "user_package_desc")
    private String packageDesc;

}
