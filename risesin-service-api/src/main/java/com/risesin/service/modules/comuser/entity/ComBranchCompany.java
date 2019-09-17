package com.risesin.service.modules.comuser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import java.util.Date;

/**
 * 分公司
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "com_branch_company")
public class ComBranchCompany implements Serializable {

    private static final long serialVersionUID = 3782815130642385862L;

    /**
     * 主键ID
     */
    @Column(name = "pk_bran_id")
    @Id
    private Long id;

    /**
     * 公司名字
     */
    @Column(name = "bran_name")
    private String branName;

    /**
     * 区域
     */
    @Column(name = "bran_area")
    private String branArea;

    /**
     * 办公地址
     */
    @Column(name = "bran_business_address")
    private String branBusinessAddress;

    /**
     * 公司注册地址
     */
    @Column(name = "bran_reg_address")
    private String branRegAddress;

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
