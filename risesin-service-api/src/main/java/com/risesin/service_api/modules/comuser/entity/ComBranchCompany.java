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
 * 分公司
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
@Table(name = "com_branch_company")
public class ComBranchCompany implements Serializable {

    private static final long serialVersionUID = 3782815130642385862L;

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
    private LocalDateTime addTime;

    /**
     * 最后修改时间
     */
    @Column(name = "bran_lastmodified")
    private LocalDateTime lastModified;

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
