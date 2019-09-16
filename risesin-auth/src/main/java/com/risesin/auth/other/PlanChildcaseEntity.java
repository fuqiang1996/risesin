package com.risesin.auth.other;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "plan_childcase", schema = "risesin", catalog = "")
public class PlanChildcaseEntity {
    private Timestamp finCasAddtime;
    private Timestamp finCasLastmodify;
    private Integer fkFinLegrepId;
    private Integer fkFinPlaId;
    private Integer fkFinStoId;
    private int pkFinCasId;
    private Integer fkFinEntId;

    @Basic
    @Column(name = "fin_cas_addtime", nullable = true)
    public Timestamp getFinCasAddtime() {
        return finCasAddtime;
    }

    public void setFinCasAddtime(Timestamp finCasAddtime) {
        this.finCasAddtime = finCasAddtime;
    }

    @Basic
    @Column(name = "fin_cas_lastmodify", nullable = true)
    public Timestamp getFinCasLastmodify() {
        return finCasLastmodify;
    }

    public void setFinCasLastmodify(Timestamp finCasLastmodify) {
        this.finCasLastmodify = finCasLastmodify;
    }

    @Basic
    @Column(name = "fk_fin_legrep_id", nullable = true)
    public Integer getFkFinLegrepId() {
        return fkFinLegrepId;
    }

    public void setFkFinLegrepId(Integer fkFinLegrepId) {
        this.fkFinLegrepId = fkFinLegrepId;
    }

    @Basic
    @Column(name = "fk_fin_pla_id", nullable = true)
    public Integer getFkFinPlaId() {
        return fkFinPlaId;
    }

    public void setFkFinPlaId(Integer fkFinPlaId) {
        this.fkFinPlaId = fkFinPlaId;
    }

    @Basic
    @Column(name = "fk_fin_sto_id", nullable = true)
    public Integer getFkFinStoId() {
        return fkFinStoId;
    }

    public void setFkFinStoId(Integer fkFinStoId) {
        this.fkFinStoId = fkFinStoId;
    }

    @Id
    @Column(name = "pk_fin_cas_id", nullable = false)
    public int getPkFinCasId() {
        return pkFinCasId;
    }

    public void setPkFinCasId(int pkFinCasId) {
        this.pkFinCasId = pkFinCasId;
    }

    @Basic
    @Column(name = "fk_fin_ent_id", nullable = true)
    public Integer getFkFinEntId() {
        return fkFinEntId;
    }

    public void setFkFinEntId(Integer fkFinEntId) {
        this.fkFinEntId = fkFinEntId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanChildcaseEntity that = (PlanChildcaseEntity) o;
        return pkFinCasId == that.pkFinCasId &&
                Objects.equals(finCasAddtime, that.finCasAddtime) &&
                Objects.equals(finCasLastmodify, that.finCasLastmodify) &&
                Objects.equals(fkFinLegrepId, that.fkFinLegrepId) &&
                Objects.equals(fkFinPlaId, that.fkFinPlaId) &&
                Objects.equals(fkFinStoId, that.fkFinStoId) &&
                Objects.equals(fkFinEntId, that.fkFinEntId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finCasAddtime, finCasLastmodify, fkFinLegrepId, fkFinPlaId, fkFinStoId, pkFinCasId, fkFinEntId);
    }
}
