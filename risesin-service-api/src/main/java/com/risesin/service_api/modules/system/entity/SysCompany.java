package com.risesin.service_api.modules.system.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 公司表
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "sys_company")
public class SysCompany implements Serializable {

    private static final long serialVersionUID = 1160233737434765698L;

    /**
     * 主键ID
     */
    @Id
    @Column(name = "pk_bran_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 公司名字
     */
    @Column(name = "bran_name")
    private String name;

    /**
     * 区域
     */
    @Column(name = "bran_area")
    private String area;

    /**
     * 办公地址
     */
    @Column(name = "bran_business_address")
    private String businessAddress;

    /**
     * 公司注册地址
     */
    @Column(name = "bran_reg_address")
    private String regAddress;

    /**
     * 排序
     */
    @Column(name = "bran_order_num")
    private Long orderNum;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "bran_delflag")
    private Long delFlag;

    /**
     * 创建时间
     */
    @Column(name = "bran_addtime")
    private Date addTime;

    /**
     * 最后修改时间
     */
    @Column(name = "bran_lastmodified")
    private Date lastModified;

    /**
     * 负责人
     */
    @Column(name = "bran_leader")
    private String leader;

    /**
     * 外键：助贷机构ID
     */
    @Column(name = "fk_loan_agen_id")
    private Long loanAgenId;

}
