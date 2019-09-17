package com.risesin.service_api.modules.actionPlan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * PlanFinPro 对象
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "act_plan_fin_pro")
public class ActPlanFinPro implements Serializable {

    private static final long serialVersionUID = 661585595886911483L;

    /**
     * 融资产品ID
     */
    @Column(name = "fk_fin_pro_id")
    private Long finProId;

    /**
     * 方案ID
     */
    @Column(name = "fk_act_pro_id")
    private Long proId;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
