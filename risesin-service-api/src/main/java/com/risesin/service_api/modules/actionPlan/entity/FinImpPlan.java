package com.risesin.service_api.modules.actionPlan.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 融资执行方案实体
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "fin_imp_plan")
public class FinImpPlan implements Serializable {

    private static final long serialVersionUID = 5593261935629956628L;

    /**
     * 主键
     */
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 外键：支线方案ID
     */
    @Column(name = "fk_fin_cas_id")
    private Long finCasId;

    /**
     * 方案名称
     */
    @Column(name = "act_pro_name")
    private String proName;

    /**
     * 创建时间
     */
    @Column(name = "act_pro_addtime")
    private java.time.Instant addTime;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "act_pro_delflag", columnDefinition = "int default 0")
    private Long delFlag;

    /**
     * 外键：企业独立信息拓展表ID
     */
    @Column(name = "fk_ext_ent_ato_info_id")
    private Long extEntAtoInfoId;

    /**
     * 诚意金
     */
    @Column(name = "act_sinceritygold")
    private BigDecimal sincerityGold;

}
