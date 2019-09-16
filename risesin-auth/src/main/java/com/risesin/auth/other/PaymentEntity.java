package com.risesin.auth.other;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "payment", schema = "risesin", catalog = "")
public class PaymentEntity {
    private Timestamp payAddtime;
    private String payCode;
    private Integer payDelflag;
    private String payMethod;
    private BigDecimal payMoney;
    private String payStatus;
    private int pkPayId;
    private Integer fkExpOrdId;

    @Basic
    @Column(name = "pay_addtime", nullable = true)
    public Timestamp getPayAddtime() {
        return payAddtime;
    }

    public void setPayAddtime(Timestamp payAddtime) {
        this.payAddtime = payAddtime;
    }

    @Basic
    @Column(name = "pay_code", nullable = true, length = 64)
    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    @Basic
    @Column(name = "pay_delflag", nullable = true)
    public Integer getPayDelflag() {
        return payDelflag;
    }

    public void setPayDelflag(Integer payDelflag) {
        this.payDelflag = payDelflag;
    }

    @Basic
    @Column(name = "pay_method", nullable = true, length = 64)
    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    @Basic
    @Column(name = "pay_money", nullable = true, precision = 2)
    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    @Basic
    @Column(name = "pay_status", nullable = true, length = 64)
    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    @Id
    @Column(name = "pk_pay_id", nullable = false)
    public int getPkPayId() {
        return pkPayId;
    }

    public void setPkPayId(int pkPayId) {
        this.pkPayId = pkPayId;
    }

    @Basic
    @Column(name = "fk_exp_ord_id", nullable = true)
    public Integer getFkExpOrdId() {
        return fkExpOrdId;
    }

    public void setFkExpOrdId(Integer fkExpOrdId) {
        this.fkExpOrdId = fkExpOrdId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentEntity that = (PaymentEntity) o;
        return pkPayId == that.pkPayId &&
                Objects.equals(payAddtime, that.payAddtime) &&
                Objects.equals(payCode, that.payCode) &&
                Objects.equals(payDelflag, that.payDelflag) &&
                Objects.equals(payMethod, that.payMethod) &&
                Objects.equals(payMoney, that.payMoney) &&
                Objects.equals(payStatus, that.payStatus) &&
                Objects.equals(fkExpOrdId, that.fkExpOrdId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payAddtime, payCode, payDelflag, payMethod, payMoney, payStatus, pkPayId, fkExpOrdId);
    }
}
