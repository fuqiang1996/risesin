package com.risesin.auth.actionPlan;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "fin_imp_plan", schema = "risesin", catalog = "")
public class FinImpPlanEntity {
    private int pkId;
    private Integer fkFinCasId;
    private String actProName;
    private Timestamp actProAddtime;
    private Integer actProDelflag;
    private Integer fkExtEntAtoInfoId;
    private Double actSinceritygold;

    @Id
    @Column(name = "pk_id", nullable = false)
    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    @Basic
    @Column(name = "fk_fin_cas_id", nullable = true)
    public Integer getFkFinCasId() {
        return fkFinCasId;
    }

    public void setFkFinCasId(Integer fkFinCasId) {
        this.fkFinCasId = fkFinCasId;
    }

    @Basic
    @Column(name = "act_pro_name", nullable = true, length = 50)
    public String getActProName() {
        return actProName;
    }

    public void setActProName(String actProName) {
        this.actProName = actProName;
    }

    @Basic
    @Column(name = "act_pro_addtime", nullable = true)
    public Timestamp getActProAddtime() {
        return actProAddtime;
    }

    public void setActProAddtime(Timestamp actProAddtime) {
        this.actProAddtime = actProAddtime;
    }

    @Basic
    @Column(name = "act_pro_delflag", nullable = true)
    public Integer getActProDelflag() {
        return actProDelflag;
    }

    public void setActProDelflag(Integer actProDelflag) {
        this.actProDelflag = actProDelflag;
    }

    @Basic
    @Column(name = "fk_ext_ent_ato_info_id", nullable = true)
    public Integer getFkExtEntAtoInfoId() {
        return fkExtEntAtoInfoId;
    }

    public void setFkExtEntAtoInfoId(Integer fkExtEntAtoInfoId) {
        this.fkExtEntAtoInfoId = fkExtEntAtoInfoId;
    }

    @Basic
    @Column(name = "act_sinceritygold", nullable = true, precision = 2)
    public Double getActSinceritygold() {
        return actSinceritygold;
    }

    public void setActSinceritygold(Double actSinceritygold) {
        this.actSinceritygold = actSinceritygold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinImpPlanEntity that = (FinImpPlanEntity) o;
        return pkId == that.pkId &&
                Objects.equals(fkFinCasId, that.fkFinCasId) &&
                Objects.equals(actProName, that.actProName) &&
                Objects.equals(actProAddtime, that.actProAddtime) &&
                Objects.equals(actProDelflag, that.actProDelflag) &&
                Objects.equals(fkExtEntAtoInfoId, that.fkExtEntAtoInfoId) &&
                Objects.equals(actSinceritygold, that.actSinceritygold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkId, fkFinCasId, actProName, actProAddtime, actProDelflag, fkExtEntAtoInfoId, actSinceritygold);
    }
}
