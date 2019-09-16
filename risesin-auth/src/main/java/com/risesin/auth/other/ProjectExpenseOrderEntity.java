package com.risesin.auth.other;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "project_expense_order", schema = "risesin", catalog = "")
public class ProjectExpenseOrderEntity {
    private String comUsername;
    private String commodityName;
    private BigDecimal expTotalMoney;
    private Integer fkExpTypId;
    private Integer fkProId;
    private int pkProOrdId;
    private Timestamp proOrdAddtime;
    private Timestamp proOrdClosetime;
    private String proOrdCode;
    private Integer proOrdDelflag;
    private String proOrdRemark;
    private Integer proOrdStatus;

    @Basic
    @Column(name = "com_username", nullable = true, length = 64)
    public String getComUsername() {
        return comUsername;
    }

    public void setComUsername(String comUsername) {
        this.comUsername = comUsername;
    }

    @Basic
    @Column(name = "commodity_name", nullable = true, length = 64)
    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    @Basic
    @Column(name = "exp_total_money", nullable = true, precision = 2)
    public BigDecimal getExpTotalMoney() {
        return expTotalMoney;
    }

    public void setExpTotalMoney(BigDecimal expTotalMoney) {
        this.expTotalMoney = expTotalMoney;
    }

    @Basic
    @Column(name = "fk_exp_typ_id", nullable = true)
    public Integer getFkExpTypId() {
        return fkExpTypId;
    }

    public void setFkExpTypId(Integer fkExpTypId) {
        this.fkExpTypId = fkExpTypId;
    }

    @Basic
    @Column(name = "fk_pro_id", nullable = true)
    public Integer getFkProId() {
        return fkProId;
    }

    public void setFkProId(Integer fkProId) {
        this.fkProId = fkProId;
    }

    @Id
    @Column(name = "pk_pro_ord_id", nullable = false)
    public int getPkProOrdId() {
        return pkProOrdId;
    }

    public void setPkProOrdId(int pkProOrdId) {
        this.pkProOrdId = pkProOrdId;
    }

    @Basic
    @Column(name = "pro_ord_addtime", nullable = true)
    public Timestamp getProOrdAddtime() {
        return proOrdAddtime;
    }

    public void setProOrdAddtime(Timestamp proOrdAddtime) {
        this.proOrdAddtime = proOrdAddtime;
    }

    @Basic
    @Column(name = "pro_ord_closetime", nullable = true)
    public Timestamp getProOrdClosetime() {
        return proOrdClosetime;
    }

    public void setProOrdClosetime(Timestamp proOrdClosetime) {
        this.proOrdClosetime = proOrdClosetime;
    }

    @Basic
    @Column(name = "pro_ord_code", nullable = true, length = 64)
    public String getProOrdCode() {
        return proOrdCode;
    }

    public void setProOrdCode(String proOrdCode) {
        this.proOrdCode = proOrdCode;
    }

    @Basic
    @Column(name = "pro_ord_delflag", nullable = true)
    public Integer getProOrdDelflag() {
        return proOrdDelflag;
    }

    public void setProOrdDelflag(Integer proOrdDelflag) {
        this.proOrdDelflag = proOrdDelflag;
    }

    @Basic
    @Column(name = "pro_ord_remark", nullable = true, length = 64)
    public String getProOrdRemark() {
        return proOrdRemark;
    }

    public void setProOrdRemark(String proOrdRemark) {
        this.proOrdRemark = proOrdRemark;
    }

    @Basic
    @Column(name = "pro_ord_status", nullable = true)
    public Integer getProOrdStatus() {
        return proOrdStatus;
    }

    public void setProOrdStatus(Integer proOrdStatus) {
        this.proOrdStatus = proOrdStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectExpenseOrderEntity that = (ProjectExpenseOrderEntity) o;
        return pkProOrdId == that.pkProOrdId &&
                Objects.equals(comUsername, that.comUsername) &&
                Objects.equals(commodityName, that.commodityName) &&
                Objects.equals(expTotalMoney, that.expTotalMoney) &&
                Objects.equals(fkExpTypId, that.fkExpTypId) &&
                Objects.equals(fkProId, that.fkProId) &&
                Objects.equals(proOrdAddtime, that.proOrdAddtime) &&
                Objects.equals(proOrdClosetime, that.proOrdClosetime) &&
                Objects.equals(proOrdCode, that.proOrdCode) &&
                Objects.equals(proOrdDelflag, that.proOrdDelflag) &&
                Objects.equals(proOrdRemark, that.proOrdRemark) &&
                Objects.equals(proOrdStatus, that.proOrdStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comUsername, commodityName, expTotalMoney, fkExpTypId, fkProId, pkProOrdId, proOrdAddtime, proOrdClosetime, proOrdCode, proOrdDelflag, proOrdRemark, proOrdStatus);
    }
}
