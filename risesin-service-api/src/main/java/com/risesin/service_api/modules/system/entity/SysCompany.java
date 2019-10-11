package com.risesin.service_api.modules.system.entity;

import javax.persistence.*;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * 公司表
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Data
@Entity
@Table(name = "sys_company")
@DynamicInsert
//@DynamicUpdate
public class SysCompany implements Serializable {

    private static final long serialVersionUID = 1160233737434765698L;

    /**
     * 主键ID
     */
    @Id
    @Column(name = "pk_bran_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("主键ID")
    private Long id;

    /**
     * 公司名字
     */
    @Column(name = "bran_name")
    @ApiModelProperty("公司名字")
    private String name;

    /**
     * 区域
     */
    @Column(name = "bran_area")
    @ApiModelProperty("区域")
    private String area;

    /**
     * 办公地址
     */
    @Column(name = "bran_business_address")
    @ApiModelProperty("办公地址")
    private String businessAddress;

    /**
     * 公司注册地址
     */
    @Column(name = "bran_reg_address")
    @ApiModelProperty("公司注册地址")
    private String regAddress;

    /**
     * 排序
     */
    @Column(name = "bran_order_num")
    @ApiModelProperty("排序")
    private Long orderNum;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "bran_delflag")
    @ApiModelProperty("是否删除  -1：已删除  0：正常")
    private Long delFlag;

    /**
     * 创建时间
     */
    @Column(name = "bran_addtime")
    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 接受前台的时间格式，传到后台格式
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台的时间格式化,发送到前台
    private LocalDateTime addTime;

    /**
     * 最后修改时间
     */
    @Column(name = "bran_lastmodified")
    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // 接受前台的时间格式，传到后台格式
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台的时间格式化,发送到前台
    private LocalDateTime lastModify;

    /**
     * 负责人
     */
    @Column(name = "bran_leader")
    @ApiModelProperty("负责人")
    private String leader;

    /**
     * 外键：助贷机构ID
     */
    @Column(name = "fk_loan_agen_id")
    @ApiModelProperty("外键：助贷机构ID")
    private Long loanAgenId;

}
