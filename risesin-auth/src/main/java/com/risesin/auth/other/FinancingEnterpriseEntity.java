package com.risesin.auth.other;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "financing_enterprise", schema = "risesin", catalog = "")
public class FinancingEnterpriseEntity {
    private Timestamp finEntAddtime;
    private String finEntCode;
    private Double finEntDebtrate;
    private Integer finEntDelflag;
    private BigDecimal finEntFixasset;
    private Integer finEntHaslegalcase;
    private Integer finEntHasoperationexception;
    private Timestamp finEntLastmodify;
    private BigDecimal finEntLastyearrevenue;
    private String finEntName;
    private BigDecimal finEntOthpleasset;
    private BigDecimal finEntProfit;
    private BigDecimal finEntTaxamount;
    private Integer fkFinIndId;
    private int pkFinEntId;
    private Integer finEntOperatinglife;

    @Basic
    @Column(name = "fin_ent_addtime", nullable = true)
    public Timestamp getFinEntAddtime() {
        return finEntAddtime;
    }

    public void setFinEntAddtime(Timestamp finEntAddtime) {
        this.finEntAddtime = finEntAddtime;
    }

    @Basic
    @Column(name = "fin_ent_code", nullable = true, length = 64)
    public String getFinEntCode() {
        return finEntCode;
    }

    public void setFinEntCode(String finEntCode) {
        this.finEntCode = finEntCode;
    }

    @Basic
    @Column(name = "fin_ent_debtrate", nullable = true, precision = 2)
    public Double getFinEntDebtrate() {
        return finEntDebtrate;
    }

    public void setFinEntDebtrate(Double finEntDebtrate) {
        this.finEntDebtrate = finEntDebtrate;
    }

    @Basic
    @Column(name = "fin_ent_delflag", nullable = true)
    public Integer getFinEntDelflag() {
        return finEntDelflag;
    }

    public void setFinEntDelflag(Integer finEntDelflag) {
        this.finEntDelflag = finEntDelflag;
    }

    @Basic
    @Column(name = "fin_ent_fixasset", nullable = true, precision = 2)
    public BigDecimal getFinEntFixasset() {
        return finEntFixasset;
    }

    public void setFinEntFixasset(BigDecimal finEntFixasset) {
        this.finEntFixasset = finEntFixasset;
    }

    @Basic
    @Column(name = "fin_ent_haslegalcase", nullable = true)
    public Integer getFinEntHaslegalcase() {
        return finEntHaslegalcase;
    }

    public void setFinEntHaslegalcase(Integer finEntHaslegalcase) {
        this.finEntHaslegalcase = finEntHaslegalcase;
    }

    @Basic
    @Column(name = "fin_ent_hasoperationexception", nullable = true)
    public Integer getFinEntHasoperationexception() {
        return finEntHasoperationexception;
    }

    public void setFinEntHasoperationexception(Integer finEntHasoperationexception) {
        this.finEntHasoperationexception = finEntHasoperationexception;
    }

    @Basic
    @Column(name = "fin_ent_lastmodify", nullable = true)
    public Timestamp getFinEntLastmodify() {
        return finEntLastmodify;
    }

    public void setFinEntLastmodify(Timestamp finEntLastmodify) {
        this.finEntLastmodify = finEntLastmodify;
    }

    @Basic
    @Column(name = "fin_ent_lastyearrevenue", nullable = true, precision = 2)
    public BigDecimal getFinEntLastyearrevenue() {
        return finEntLastyearrevenue;
    }

    public void setFinEntLastyearrevenue(BigDecimal finEntLastyearrevenue) {
        this.finEntLastyearrevenue = finEntLastyearrevenue;
    }

    @Basic
    @Column(name = "fin_ent_name", nullable = true, length = 64)
    public String getFinEntName() {
        return finEntName;
    }

    public void setFinEntName(String finEntName) {
        this.finEntName = finEntName;
    }

    @Basic
    @Column(name = "fin_ent_othpleasset", nullable = true, precision = 2)
    public BigDecimal getFinEntOthpleasset() {
        return finEntOthpleasset;
    }

    public void setFinEntOthpleasset(BigDecimal finEntOthpleasset) {
        this.finEntOthpleasset = finEntOthpleasset;
    }

    @Basic
    @Column(name = "fin_ent_profit", nullable = true, precision = 2)
    public BigDecimal getFinEntProfit() {
        return finEntProfit;
    }

    public void setFinEntProfit(BigDecimal finEntProfit) {
        this.finEntProfit = finEntProfit;
    }

    @Basic
    @Column(name = "fin_ent_taxamount", nullable = true, precision = 2)
    public BigDecimal getFinEntTaxamount() {
        return finEntTaxamount;
    }

    public void setFinEntTaxamount(BigDecimal finEntTaxamount) {
        this.finEntTaxamount = finEntTaxamount;
    }

    @Basic
    @Column(name = "fk_fin_ind_id", nullable = true)
    public Integer getFkFinIndId() {
        return fkFinIndId;
    }

    public void setFkFinIndId(Integer fkFinIndId) {
        this.fkFinIndId = fkFinIndId;
    }

    @Id
    @Column(name = "pk_fin_ent_id", nullable = false)
    public int getPkFinEntId() {
        return pkFinEntId;
    }

    public void setPkFinEntId(int pkFinEntId) {
        this.pkFinEntId = pkFinEntId;
    }

    @Basic
    @Column(name = "fin_ent_operatinglife", nullable = true)
    public Integer getFinEntOperatinglife() {
        return finEntOperatinglife;
    }

    public void setFinEntOperatinglife(Integer finEntOperatinglife) {
        this.finEntOperatinglife = finEntOperatinglife;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinancingEnterpriseEntity that = (FinancingEnterpriseEntity) o;
        return pkFinEntId == that.pkFinEntId &&
                Objects.equals(finEntAddtime, that.finEntAddtime) &&
                Objects.equals(finEntCode, that.finEntCode) &&
                Objects.equals(finEntDebtrate, that.finEntDebtrate) &&
                Objects.equals(finEntDelflag, that.finEntDelflag) &&
                Objects.equals(finEntFixasset, that.finEntFixasset) &&
                Objects.equals(finEntHaslegalcase, that.finEntHaslegalcase) &&
                Objects.equals(finEntHasoperationexception, that.finEntHasoperationexception) &&
                Objects.equals(finEntLastmodify, that.finEntLastmodify) &&
                Objects.equals(finEntLastyearrevenue, that.finEntLastyearrevenue) &&
                Objects.equals(finEntName, that.finEntName) &&
                Objects.equals(finEntOthpleasset, that.finEntOthpleasset) &&
                Objects.equals(finEntProfit, that.finEntProfit) &&
                Objects.equals(finEntTaxamount, that.finEntTaxamount) &&
                Objects.equals(fkFinIndId, that.fkFinIndId) &&
                Objects.equals(finEntOperatinglife, that.finEntOperatinglife);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finEntAddtime, finEntCode, finEntDebtrate, finEntDelflag, finEntFixasset, finEntHaslegalcase, finEntHasoperationexception, finEntLastmodify, finEntLastyearrevenue, finEntName, finEntOthpleasset, finEntProfit, finEntTaxamount, fkFinIndId, pkFinEntId, finEntOperatinglife);
    }
}
