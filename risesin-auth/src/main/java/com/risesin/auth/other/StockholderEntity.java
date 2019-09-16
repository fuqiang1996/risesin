package com.risesin.auth.other;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stockholder", schema = "risesin", catalog = "")
public class StockholderEntity {
    private Timestamp finStoAddtime;
    private Integer finStoAge;
    private String finStoCode;
    private String finStoCreditstatus;
    private Integer finStoHaslegalcase;
    private Timestamp finStoLastmodify;
    private String finStoName;
    private BigDecimal finStoPersonalasset;
    private BigDecimal finStoPersonaldebt;
    private Double finStoSharerate;
    private int pkFinStoId;

    @Basic
    @Column(name = "fin_sto_addtime", nullable = true)
    public Timestamp getFinStoAddtime() {
        return finStoAddtime;
    }

    public void setFinStoAddtime(Timestamp finStoAddtime) {
        this.finStoAddtime = finStoAddtime;
    }

    @Basic
    @Column(name = "fin_sto_age", nullable = true)
    public Integer getFinStoAge() {
        return finStoAge;
    }

    public void setFinStoAge(Integer finStoAge) {
        this.finStoAge = finStoAge;
    }

    @Basic
    @Column(name = "fin_sto_code", nullable = true, length = 64)
    public String getFinStoCode() {
        return finStoCode;
    }

    public void setFinStoCode(String finStoCode) {
        this.finStoCode = finStoCode;
    }

    @Basic
    @Column(name = "fin_sto_creditstatus", nullable = true, length = 64)
    public String getFinStoCreditstatus() {
        return finStoCreditstatus;
    }

    public void setFinStoCreditstatus(String finStoCreditstatus) {
        this.finStoCreditstatus = finStoCreditstatus;
    }

    @Basic
    @Column(name = "fin_sto_haslegalcase", nullable = true)
    public Integer getFinStoHaslegalcase() {
        return finStoHaslegalcase;
    }

    public void setFinStoHaslegalcase(Integer finStoHaslegalcase) {
        this.finStoHaslegalcase = finStoHaslegalcase;
    }

    @Basic
    @Column(name = "fin_sto_lastmodify", nullable = true)
    public Timestamp getFinStoLastmodify() {
        return finStoLastmodify;
    }

    public void setFinStoLastmodify(Timestamp finStoLastmodify) {
        this.finStoLastmodify = finStoLastmodify;
    }

    @Basic
    @Column(name = "fin_sto_name", nullable = true, length = 50)
    public String getFinStoName() {
        return finStoName;
    }

    public void setFinStoName(String finStoName) {
        this.finStoName = finStoName;
    }

    @Basic
    @Column(name = "fin_sto_personalasset", nullable = true, precision = 2)
    public BigDecimal getFinStoPersonalasset() {
        return finStoPersonalasset;
    }

    public void setFinStoPersonalasset(BigDecimal finStoPersonalasset) {
        this.finStoPersonalasset = finStoPersonalasset;
    }

    @Basic
    @Column(name = "fin_sto_personaldebt", nullable = true, precision = 2)
    public BigDecimal getFinStoPersonaldebt() {
        return finStoPersonaldebt;
    }

    public void setFinStoPersonaldebt(BigDecimal finStoPersonaldebt) {
        this.finStoPersonaldebt = finStoPersonaldebt;
    }

    @Basic
    @Column(name = "fin_sto_sharerate", nullable = true, precision = 2)
    public Double getFinStoSharerate() {
        return finStoSharerate;
    }

    public void setFinStoSharerate(Double finStoSharerate) {
        this.finStoSharerate = finStoSharerate;
    }

    @Id
    @Column(name = "pk_fin_sto_id", nullable = false)
    public int getPkFinStoId() {
        return pkFinStoId;
    }

    public void setPkFinStoId(int pkFinStoId) {
        this.pkFinStoId = pkFinStoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockholderEntity that = (StockholderEntity) o;
        return pkFinStoId == that.pkFinStoId &&
                Objects.equals(finStoAddtime, that.finStoAddtime) &&
                Objects.equals(finStoAge, that.finStoAge) &&
                Objects.equals(finStoCode, that.finStoCode) &&
                Objects.equals(finStoCreditstatus, that.finStoCreditstatus) &&
                Objects.equals(finStoHaslegalcase, that.finStoHaslegalcase) &&
                Objects.equals(finStoLastmodify, that.finStoLastmodify) &&
                Objects.equals(finStoName, that.finStoName) &&
                Objects.equals(finStoPersonalasset, that.finStoPersonalasset) &&
                Objects.equals(finStoPersonaldebt, that.finStoPersonaldebt) &&
                Objects.equals(finStoSharerate, that.finStoSharerate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finStoAddtime, finStoAge, finStoCode, finStoCreditstatus, finStoHaslegalcase, finStoLastmodify, finStoName, finStoPersonalasset, finStoPersonaldebt, finStoSharerate, pkFinStoId);
    }
}
