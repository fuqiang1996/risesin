package com.risesin.service_api.modules.base.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

/**
 * @Description EnterpriseInfoType企业信息类型类
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "enterprise_info_type")
public class EnterpriseInfoType implements Serializable {

    private static final long serialVersionUID = 8944874193327655262L;

    /**
     * 创建时间
     */
    @Column(name = "fin_entinfotype_addtime")
    private Date addTime;

    /**
     * 编号
     */
    @Column(name = "fin_entinfotype_code")
    private String infoTypeCode;

    /**
     * 删除标记
     */
    @Column(name = "fin_entinfotype_delflag")
    private Long delFlag;

    /**
     * 最后修改时间
     */
    @Column(name = "fin_entinfotype_lastmodify")
    private Date lastModify;

    /**
     * 类型名称
     */
    @Column(name = "fin_entinfotype_name")
    private String infoTypeName;

    /**
     * 主键
     */
    @Column(name = "pk_fin_entinfotype_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
