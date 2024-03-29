package com.risesin.service_api.modules.comuser.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


/**
 * 助贷机构公司实体
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */
@Accessors(chain = true) // 可将对象转换成链式设置值(流的形式)
@DynamicInsert // 插入或者修改时 字符串为 ''
@DynamicUpdate
@Setter
@Getter
@ToString
@Entity
@Table(name = "loan_agency_info")
public class LoanAgencyInfo implements Serializable {

    private static final long serialVersionUID = 1206939784898219980L;

    /**
     * 主键ID
     */
    @Id
    @Column(name = "pk_loan_agen_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 公司网址
     */
    @Column(name = "loan_agen_website")
    private String loanAgenWebsite;

    /**
     * 公司名称
     */
    @Column(name = "loan_agen_name")
    private String loanAgenName;

    /**
     * 办公地址
     */
    @Column(name = "loan_business_address")
    private String loanBusinessAddress;

    /**
     * 英文名称
     */
    @Column(name = "loan_english_name")
    private String loanEnglishName;

    /**
     * 所属行业
     */
    @Column(name = "loan_industry_involved")
    private String loanIndustryInvolved;

    /**
     * 创建时间
     */
    @Column(name = "loan_agen_addtime")
    private LocalDateTime loanAgenAddtime;

    /**
     * 最后修改时间
     */
    @Column(name = "loan_lastmodify")
    private LocalDateTime loanLastmodify;

    /**
     * 排序
     */
    @Column(name = "loan_order_num")
    private Long loanOrderNum;

    /**
     * 电话
     */
    @Column(name = "loan_phone")
    private String loanPhone;

    /**
     * 公司注册地址
     */
    @Column(name = "loan_reg_address")
    private String loanRegAddress;

    /**
     * 区域
     */
    @Column(name = "loan_agen_area")
    private String loanAgenArea;

    /**
     * 公司全称
     */
    @Column(name = "loan_agen_fullname")
    private String loanAgenFullname;

    /**
     * 是否删除：-1删除 0不删除
     */
    @Column(name = "loan_del_flag")
    private Long delFlag;

}
