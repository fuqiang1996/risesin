package com.risesin.auth.other;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "legal_representative", schema = "risesin", catalog = "")
public class LegalRepresentativeEntity {
    private Timestamp finLegrepAddtime;
    private Integer finLegrepAge;
    private String finLegrepCode;
    private String finLegrepCreditstatus;
    private Integer finLegrepDelflag;
    private Integer finLegrepHaslegcase;
    private Integer finLegrepIsstockholder;
    private Timestamp finLegrepLastmodify;
    private String finLegrepName;
    private BigDecimal finLegrepPersonalasset;
    private BigDecimal finLegrepPersonaldebt;
    private Double finLegrepSharerate;
    private Timestamp finLegrepStartingtime;
    private int pkFinLegrepId;

    @Basic
    @Column(name = "fin_legrep_addtime", nullable = true)
    public Timestamp getFinLegrepAddtime() {
        return finLegrepAddtime;
    }

    public void setFinLegrepAddtime(Timestamp finLegrepAddtime) {
        this.finLegrepAddtime = finLegrepAddtime;
    }

    @Basic
    @Column(name = "fin_legrep_age", nullable = true)
    public Integer getFinLegrepAge() {
        return finLegrepAge;
    }

    public void setFinLegrepAge(Integer finLegrepAge) {
        this.finLegrepAge = finLegrepAge;
    }

    @Basic
    @Column(name = "fin_legrep_code", nullable = true, length = 64)
    public String getFinLegrepCode() {
        return finLegrepCode;
    }

    public void setFinLegrepCode(String finLegrepCode) {
        this.finLegrepCode = finLegrepCode;
    }

    @Basic
    @Column(name = "fin_legrep_creditstatus", nullable = true, length = 64)
    public String getFinLegrepCreditstatus() {
        return finLegrepCreditstatus;
    }

    public void setFinLegrepCreditstatus(String finLegrepCreditstatus) {
        this.finLegrepCreditstatus = finLegrepCreditstatus;
    }

    @Basic
    @Column(name = "fin_legrep_delflag", nullable = true)
    public Integer getFinLegrepDelflag() {
        return finLegrepDelflag;
    }

    public void setFinLegrepDelflag(Integer finLegrepDelflag) {
        this.finLegrepDelflag = finLegrepDelflag;
    }

    @Basic
    @Column(name = "fin_legrep_haslegcase", nullable = true)
    public Integer getFinLegrepHaslegcase() {
        return finLegrepHaslegcase;
    }

    public void setFinLegrepHaslegcase(Integer finLegrepHaslegcase) {
        this.finLegrepHaslegcase = finLegrepHaslegcase;
    }

    @Basic
    @Column(name = "fin_legrep_isstockholder", nullable = true)
    public Integer getFinLegrepIsstockholder() {
        return finLegrepIsstockholder;
    }

    public void setFinLegrepIsstockholder(Integer finLegrepIsstockholder) {
        this.finLegrepIsstockholder = finLegrepIsstockholder;
    }

    @Basic
    @Column(name = "fin_legrep_lastmodify", nullable = true)
    public Timestamp getFinLegrepLastmodify() {
        return finLegrepLastmodify;
    }

    public void setFinLegrepLastmodify(Timestamp finLegrepLastmodify) {
        this.finLegrepLastmodify = finLegrepLastmodify;
    }

    @Basic
    @Column(name = "fin_legrep_name", nullable = true, length = 64)
    public String getFinLegrepName() {
        return finLegrepName;
    }

    public void setFinLegrepName(String finLegrepName) {
        this.finLegrepName = finLegrepName;
    }

    @Basic
    @Column(name = "fin_legrep_personalasset", nullable = true, precision = 2)
    public BigDecimal getFinLegrepPersonalasset() {
        return finLegrepPersonalasset;
    }

    public void setFinLegrepPersonalasset(BigDecimal finLegrepPersonalasset) {
        this.finLegrepPersonalasset = finLegrepPersonalasset;
    }

    @Basic
    @Column(name = "fin_legrep_personaldebt", nullable = true, precision = 2)
    public BigDecimal getFinLegrepPersonaldebt() {
        return finLegrepPersonaldebt;
    }

    public void setFinLegrepPersonaldebt(BigDecimal finLegrepPersonaldebt) {
        this.finLegrepPersonaldebt = finLegrepPersonaldebt;
    }

    @Basic
    @Column(name = "fin_legrep_sharerate", nullable = true, precision = 2)
    public Double getFinLegrepSharerate() {
        return finLegrepSharerate;
    }

    public void setFinLegrepSharerate(Double finLegrepSharerate) {
        this.finLegrepSharerate = finLegrepSharerate;
    }

    @Basic
    @Column(name = "fin_legrep_startingtime", nullable = true)
    public Timestamp getFinLegrepStartingtime() {
        return finLegrepStartingtime;
    }

    public void setFinLegrepStartingtime(Timestamp finLegrepStartingtime) {
        this.finLegrepStartingtime = finLegrepStartingtime;
    }

    @Id
    @Column(name = "pk_fin_legrep_id", nullable = false)
    public int getPkFinLegrepId() {
        return pkFinLegrepId;
    }

    public void setPkFinLegrepId(int pkFinLegrepId) {
        this.pkFinLegrepId = pkFinLegrepId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LegalRepresentativeEntity that = (LegalRepresentativeEntity) o;
        return pkFinLegrepId == that.pkFinLegrepId &&
                Objects.equals(finLegrepAddtime, that.finLegrepAddtime) &&
                Objects.equals(finLegrepAge, that.finLegrepAge) &&
                Objects.equals(finLegrepCode, that.finLegrepCode) &&
                Objects.equals(finLegrepCreditstatus, that.finLegrepCreditstatus) &&
                Objects.equals(finLegrepDelflag, that.finLegrepDelflag) &&
                Objects.equals(finLegrepHaslegcase, that.finLegrepHaslegcase) &&
                Objects.equals(finLegrepIsstockholder, that.finLegrepIsstockholder) &&
                Objects.equals(finLegrepLastmodify, that.finLegrepLastmodify) &&
                Objects.equals(finLegrepName, that.finLegrepName) &&
                Objects.equals(finLegrepPersonalasset, that.finLegrepPersonalasset) &&
                Objects.equals(finLegrepPersonaldebt, that.finLegrepPersonaldebt) &&
                Objects.equals(finLegrepSharerate, that.finLegrepSharerate) &&
                Objects.equals(finLegrepStartingtime, that.finLegrepStartingtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finLegrepAddtime, finLegrepAge, finLegrepCode, finLegrepCreditstatus, finLegrepDelflag, finLegrepHaslegcase, finLegrepIsstockholder, finLegrepLastmodify, finLegrepName, finLegrepPersonalasset, finLegrepPersonaldebt, finLegrepSharerate, finLegrepStartingtime, pkFinLegrepId);
    }
}
