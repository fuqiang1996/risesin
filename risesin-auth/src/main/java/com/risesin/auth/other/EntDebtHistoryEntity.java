package com.risesin.auth.other;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ent_debt_history", schema = "risesin", catalog = "")
public class EntDebtHistoryEntity {
    private Timestamp finDebhisAddtime;
    private String finDebhisCode;
    private Integer finDebhisDelflag;
    private Integer finDebhisIsoverdue;
    private Timestamp finDebhisLastmodify;
    private String finDebhisLiabilitytype;
    private Timestamp finDebhisLoandate;
    private BigDecimal finDebhisNonpayment;
    private BigDecimal finDebhisPaid;
    private Timestamp finDebhisTimelimit;
    private Integer fkFinEntEntid;
    private int pkFinDebhisId;

    @Basic
    @Column(name = "fin_debhis_addtime", nullable = true)
    public Timestamp getFinDebhisAddtime() {
        return finDebhisAddtime;
    }

    public void setFinDebhisAddtime(Timestamp finDebhisAddtime) {
        this.finDebhisAddtime = finDebhisAddtime;
    }

    @Basic
    @Column(name = "fin_debhis_code", nullable = true, length = 64)
    public String getFinDebhisCode() {
        return finDebhisCode;
    }

    public void setFinDebhisCode(String finDebhisCode) {
        this.finDebhisCode = finDebhisCode;
    }

    @Basic
    @Column(name = "fin_debhis_delflag", nullable = true)
    public Integer getFinDebhisDelflag() {
        return finDebhisDelflag;
    }

    public void setFinDebhisDelflag(Integer finDebhisDelflag) {
        this.finDebhisDelflag = finDebhisDelflag;
    }

    @Basic
    @Column(name = "fin_debhis_isoverdue", nullable = true)
    public Integer getFinDebhisIsoverdue() {
        return finDebhisIsoverdue;
    }

    public void setFinDebhisIsoverdue(Integer finDebhisIsoverdue) {
        this.finDebhisIsoverdue = finDebhisIsoverdue;
    }

    @Basic
    @Column(name = "fin_debhis_lastmodify", nullable = true)
    public Timestamp getFinDebhisLastmodify() {
        return finDebhisLastmodify;
    }

    public void setFinDebhisLastmodify(Timestamp finDebhisLastmodify) {
        this.finDebhisLastmodify = finDebhisLastmodify;
    }

    @Basic
    @Column(name = "fin_debhis_liabilitytype", nullable = true, length = 64)
    public String getFinDebhisLiabilitytype() {
        return finDebhisLiabilitytype;
    }

    public void setFinDebhisLiabilitytype(String finDebhisLiabilitytype) {
        this.finDebhisLiabilitytype = finDebhisLiabilitytype;
    }

    @Basic
    @Column(name = "fin_debhis_loandate", nullable = true)
    public Timestamp getFinDebhisLoandate() {
        return finDebhisLoandate;
    }

    public void setFinDebhisLoandate(Timestamp finDebhisLoandate) {
        this.finDebhisLoandate = finDebhisLoandate;
    }

    @Basic
    @Column(name = "fin_debhis_nonpayment", nullable = true, precision = 2)
    public BigDecimal getFinDebhisNonpayment() {
        return finDebhisNonpayment;
    }

    public void setFinDebhisNonpayment(BigDecimal finDebhisNonpayment) {
        this.finDebhisNonpayment = finDebhisNonpayment;
    }

    @Basic
    @Column(name = "fin_debhis_paid", nullable = true, precision = 2)
    public BigDecimal getFinDebhisPaid() {
        return finDebhisPaid;
    }

    public void setFinDebhisPaid(BigDecimal finDebhisPaid) {
        this.finDebhisPaid = finDebhisPaid;
    }

    @Basic
    @Column(name = "fin_debhis_timelimit", nullable = true)
    public Timestamp getFinDebhisTimelimit() {
        return finDebhisTimelimit;
    }

    public void setFinDebhisTimelimit(Timestamp finDebhisTimelimit) {
        this.finDebhisTimelimit = finDebhisTimelimit;
    }

    @Basic
    @Column(name = "fk_fin_ent_entid", nullable = true)
    public Integer getFkFinEntEntid() {
        return fkFinEntEntid;
    }

    public void setFkFinEntEntid(Integer fkFinEntEntid) {
        this.fkFinEntEntid = fkFinEntEntid;
    }

    @Id
    @Column(name = "pk_fin_debhis_id", nullable = false)
    public int getPkFinDebhisId() {
        return pkFinDebhisId;
    }

    public void setPkFinDebhisId(int pkFinDebhisId) {
        this.pkFinDebhisId = pkFinDebhisId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntDebtHistoryEntity that = (EntDebtHistoryEntity) o;
        return pkFinDebhisId == that.pkFinDebhisId &&
                Objects.equals(finDebhisAddtime, that.finDebhisAddtime) &&
                Objects.equals(finDebhisCode, that.finDebhisCode) &&
                Objects.equals(finDebhisDelflag, that.finDebhisDelflag) &&
                Objects.equals(finDebhisIsoverdue, that.finDebhisIsoverdue) &&
                Objects.equals(finDebhisLastmodify, that.finDebhisLastmodify) &&
                Objects.equals(finDebhisLiabilitytype, that.finDebhisLiabilitytype) &&
                Objects.equals(finDebhisLoandate, that.finDebhisLoandate) &&
                Objects.equals(finDebhisNonpayment, that.finDebhisNonpayment) &&
                Objects.equals(finDebhisPaid, that.finDebhisPaid) &&
                Objects.equals(finDebhisTimelimit, that.finDebhisTimelimit) &&
                Objects.equals(fkFinEntEntid, that.fkFinEntEntid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finDebhisAddtime, finDebhisCode, finDebhisDelflag, finDebhisIsoverdue, finDebhisLastmodify, finDebhisLiabilitytype, finDebhisLoandate, finDebhisNonpayment, finDebhisPaid, finDebhisTimelimit, fkFinEntEntid, pkFinDebhisId);
    }
}
