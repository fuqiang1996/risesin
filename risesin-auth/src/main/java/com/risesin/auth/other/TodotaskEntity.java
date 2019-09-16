package com.risesin.auth.other;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "todotask", schema = "risesin", catalog = "")
public class TodotaskEntity {
    private Timestamp finTasAddtime;
    private String finTasCode;
    private Integer finTasDelflag;
    private String finTasDescription;
    private Timestamp finTasLastmodify;
    private String finTasName;
    private String finTasState;
    private String fkAssCode;
    private Integer fkActProId;
    private int pkFinTasId;

    @Basic
    @Column(name = "fin_tas_addtime", nullable = true)
    public Timestamp getFinTasAddtime() {
        return finTasAddtime;
    }

    public void setFinTasAddtime(Timestamp finTasAddtime) {
        this.finTasAddtime = finTasAddtime;
    }

    @Basic
    @Column(name = "fin_tas_code", nullable = true, length = 64)
    public String getFinTasCode() {
        return finTasCode;
    }

    public void setFinTasCode(String finTasCode) {
        this.finTasCode = finTasCode;
    }

    @Basic
    @Column(name = "fin_tas_delflag", nullable = true)
    public Integer getFinTasDelflag() {
        return finTasDelflag;
    }

    public void setFinTasDelflag(Integer finTasDelflag) {
        this.finTasDelflag = finTasDelflag;
    }

    @Basic
    @Column(name = "fin_tas_description", nullable = true, length = 255)
    public String getFinTasDescription() {
        return finTasDescription;
    }

    public void setFinTasDescription(String finTasDescription) {
        this.finTasDescription = finTasDescription;
    }

    @Basic
    @Column(name = "fin_tas_lastmodify", nullable = true)
    public Timestamp getFinTasLastmodify() {
        return finTasLastmodify;
    }

    public void setFinTasLastmodify(Timestamp finTasLastmodify) {
        this.finTasLastmodify = finTasLastmodify;
    }

    @Basic
    @Column(name = "fin_tas_name", nullable = true, length = 64)
    public String getFinTasName() {
        return finTasName;
    }

    public void setFinTasName(String finTasName) {
        this.finTasName = finTasName;
    }

    @Basic
    @Column(name = "fin_tas_state", nullable = true, length = 64)
    public String getFinTasState() {
        return finTasState;
    }

    public void setFinTasState(String finTasState) {
        this.finTasState = finTasState;
    }

    @Basic
    @Column(name = "fk_ass_code", nullable = true, length = 64)
    public String getFkAssCode() {
        return fkAssCode;
    }

    public void setFkAssCode(String fkAssCode) {
        this.fkAssCode = fkAssCode;
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
    @Column(name = "pk_fin_tas_id", nullable = false)
    public int getPkFinTasId() {
        return pkFinTasId;
    }

    public void setPkFinTasId(int pkFinTasId) {
        this.pkFinTasId = pkFinTasId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodotaskEntity that = (TodotaskEntity) o;
        return pkFinTasId == that.pkFinTasId &&
                Objects.equals(finTasAddtime, that.finTasAddtime) &&
                Objects.equals(finTasCode, that.finTasCode) &&
                Objects.equals(finTasDelflag, that.finTasDelflag) &&
                Objects.equals(finTasDescription, that.finTasDescription) &&
                Objects.equals(finTasLastmodify, that.finTasLastmodify) &&
                Objects.equals(finTasName, that.finTasName) &&
                Objects.equals(finTasState, that.finTasState) &&
                Objects.equals(fkAssCode, that.fkAssCode) &&
                Objects.equals(fkActProId, that.fkActProId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finTasAddtime, finTasCode, finTasDelflag, finTasDescription, finTasLastmodify, finTasName, finTasState, fkAssCode, fkActProId, pkFinTasId);
    }
}
