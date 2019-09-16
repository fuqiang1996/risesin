package com.risesin.auth.other;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "dispatch", schema = "risesin", catalog = "")
public class DispatchEntity {
    private Timestamp finDispaAddtime;
    private String finDispaCode;
    private Integer finDispaDelflag;
    private String finDispaDesc;
    private Timestamp finDispaLastmodify;
    private Integer fkComUserid;
    private Integer fkPlanCode;
    private Integer fkLoanAgenId;
    private int pkFinDispaId;

    @Basic
    @Column(name = "fin_dispa_addtime", nullable = true)
    public Timestamp getFinDispaAddtime() {
        return finDispaAddtime;
    }

    public void setFinDispaAddtime(Timestamp finDispaAddtime) {
        this.finDispaAddtime = finDispaAddtime;
    }

    @Basic
    @Column(name = "fin_dispa_code", nullable = true, length = 64)
    public String getFinDispaCode() {
        return finDispaCode;
    }

    public void setFinDispaCode(String finDispaCode) {
        this.finDispaCode = finDispaCode;
    }

    @Basic
    @Column(name = "fin_dispa_delflag", nullable = true)
    public Integer getFinDispaDelflag() {
        return finDispaDelflag;
    }

    public void setFinDispaDelflag(Integer finDispaDelflag) {
        this.finDispaDelflag = finDispaDelflag;
    }

    @Basic
    @Column(name = "fin_dispa_desc", nullable = true, length = 255)
    public String getFinDispaDesc() {
        return finDispaDesc;
    }

    public void setFinDispaDesc(String finDispaDesc) {
        this.finDispaDesc = finDispaDesc;
    }

    @Basic
    @Column(name = "fin_dispa_lastmodify", nullable = true)
    public Timestamp getFinDispaLastmodify() {
        return finDispaLastmodify;
    }

    public void setFinDispaLastmodify(Timestamp finDispaLastmodify) {
        this.finDispaLastmodify = finDispaLastmodify;
    }

    @Basic
    @Column(name = "fk_com_userid", nullable = true)
    public Integer getFkComUserid() {
        return fkComUserid;
    }

    public void setFkComUserid(Integer fkComUserid) {
        this.fkComUserid = fkComUserid;
    }

    @Basic
    @Column(name = "fk_plan_code", nullable = true)
    public Integer getFkPlanCode() {
        return fkPlanCode;
    }

    public void setFkPlanCode(Integer fkPlanCode) {
        this.fkPlanCode = fkPlanCode;
    }

    @Basic
    @Column(name = "fk_loan_agen_id", nullable = true)
    public Integer getFkLoanAgenId() {
        return fkLoanAgenId;
    }

    public void setFkLoanAgenId(Integer fkLoanAgenId) {
        this.fkLoanAgenId = fkLoanAgenId;
    }

    @Id
    @Column(name = "pk_fin_dispa_id", nullable = false)
    public int getPkFinDispaId() {
        return pkFinDispaId;
    }

    public void setPkFinDispaId(int pkFinDispaId) {
        this.pkFinDispaId = pkFinDispaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DispatchEntity that = (DispatchEntity) o;
        return pkFinDispaId == that.pkFinDispaId &&
                Objects.equals(finDispaAddtime, that.finDispaAddtime) &&
                Objects.equals(finDispaCode, that.finDispaCode) &&
                Objects.equals(finDispaDelflag, that.finDispaDelflag) &&
                Objects.equals(finDispaDesc, that.finDispaDesc) &&
                Objects.equals(finDispaLastmodify, that.finDispaLastmodify) &&
                Objects.equals(fkComUserid, that.fkComUserid) &&
                Objects.equals(fkPlanCode, that.fkPlanCode) &&
                Objects.equals(fkLoanAgenId, that.fkLoanAgenId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finDispaAddtime, finDispaCode, finDispaDelflag, finDispaDesc, finDispaLastmodify, fkComUserid, fkPlanCode, fkLoanAgenId, pkFinDispaId);
    }
}
