package com.risesin.enterpriseuserservice.financingplan.bo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * @Description FinancingPlan融资预案类
 * @Author Baby
 * @Date 2019-09-16
 */
@Data
public class FinancingPlanBO implements Serializable {

    private static final long serialVersionUID = 4926316079425631709L;
    private String planApplicant;
    private String planApplicantTel;
    private String templateStart;
    private String main;
    private String content;
    private String templateEnd;

}
