package com.risesin.service_api.modules.servicePack.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 短信包
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "sms_package")
public class SmsPackage implements Serializable {

    private static final long serialVersionUID = 6639127988807949346L;

    /**
     * 主键ID
     */
    @Id
    @Column(name = "sms_pack_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 短信包名称
     */
    @Column(name = "sms_pack_name")
    private String packName;

    /**
     * 短信包单价
     */
    @Column(name = "sms_pack_price")
    private Double packPrice;

    /**
     * 短信包主图(url)
     */
    @Column(name = "sms_pack_img")
    private String packImg;

    /**
     * 短信包评分
     */
    @Column(name = "sms_pack_grade")
    private String packGrade;

    /**
     * 短信包描述
     */
    @Column(name = "sms_pack_desc")
    private String packDesc;

    /**
     * 短信包条数
     */
    @Column(name = "sms_pack_count")
    private Long packCount;

    /**
     * 点击量
     */
    @Column(name = "sms_pack_pv")
    private Long packPv;

    /**
     * 产品状态：-1 已删除 0 下架 1 上架
     */
    @Column(name = "sms_pack_delflag")
    private Long packDelflag;

    /**
     * 发布时间
     */
    @Column(name = "sms_pack_addtime")
    private Date packAddtime;

    /**
     * 短信包编码：随机生成的一个字符串
     */
    @Column(name = "sms_pack_code")
    private String packCode;

    /**
     * 适用客户
     */
    @Column(name = "sms_pack_user_customer")
    private String packUserCustomer;

    /**
     * 最后修改时间
     */
    @Column(name = "sms_pack_lastmidify")
    private Date packLastmidify;

}
