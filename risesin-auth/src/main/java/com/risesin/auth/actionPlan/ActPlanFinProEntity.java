package com.risesin.auth.actionPlan;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "act_plan_fin_pro", schema = "risesin", catalog = "")
public class ActPlanFinProEntity {
    private Integer fkFinProId;
    private Integer fkActProId;
    private int pkId;

    @Basic
    @Column(name = "fk_fin_pro_id", nullable = true)
    public Integer getFkFinProId() {
        return fkFinProId;
    }

    public void setFkFinProId(Integer fkFinProId) {
        this.fkFinProId = fkFinProId;
    }

    @Basic
    @Column(name = "fk_act_pro_id", nullable = true)
    public Integer getFkActProId() {
        return fkActProId;
    }

    public void setFkActProId(Integer fkActProId) {
        this.fkActProId = fkActProId;
    }

    @Id
    @Column(name = "pk_id", nullable = false)
    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActPlanFinProEntity that = (ActPlanFinProEntity) o;
        return pkId == that.pkId &&
                Objects.equals(fkFinProId, that.fkFinProId) &&
                Objects.equals(fkActProId, that.fkActProId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fkFinProId, fkActProId, pkId);
    }
}
