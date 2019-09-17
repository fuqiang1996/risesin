package com.risesin.service_api.modules.actionPlan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 企业独立信息拓展实体
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "ext_enterprise_atomicity_info")
public class ExtEnterpriseAtomicityInfo implements Serializable {

    private static final long serialVersionUID = 3622672700117038299L;

    /**
     * 主键
     */
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 外键:企业独立信息ID
     */
    @Column(name = "fk_ext_fin_entinfo_id")
    private Long finEntinfoId;

    /**
     * 文件名
     */
    @Column(name = "ext_file_name")
    private String fileName;

    /**
     * 文件类型
     */
    @Column(name = "ext_file_type")
    private String fileType;

    /**
     * 文件url
     */
    @Column(name = "ext_file_url")
    private String fileUrl;

    /**
     * 创建时间
     */
    @Column(name = "ext_addtime")
    private Date addtime;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "ext_del_flag")
    private Long delFlag;

    /**
     * 备注
     */
    @Column(name = "ext_remark")
    private String remark;

    /**
     * 最后修改时期
     */
    @Column(name = "ext_lastmodified")
    private Date lastmodified;

}
