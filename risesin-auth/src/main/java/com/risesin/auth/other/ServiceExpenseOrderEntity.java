package com.risesin.auth.other;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "service_expense_order", schema = "risesin", catalog = "")
public class ServiceExpenseOrderEntity {
    private Timestamp expOrdAddtime;
    private String expOrdCode;
    private Integer expOrdDelflag;
    private BigDecimal expOrdMoney;
    private Integer expOrdStatus;
    private int pkExpOrdId;
    private Integer fkExpTypId;
    private String comUsername;
    private String commodityName;
    private Integer commodityNum;
    private Double commodityPrice;
    private String commodityUrl;
    private String expOrdRemark;
    private Timestamp expOrdClosetime;
    private String serPackageCode;

    @Basic
    @Column(name = "exp_ord_addtime", nullable = true)
    public Timestamp getExpOrdAddtime() {
        return expOrdAddtime;
    }

    public void setExpOrdAddtime(Timestamp expOrdAddtime) {
        this.expOrdAddtime = expOrdAddtime;
    }

    @Basic
    @Column(name = "exp_ord_code", nullable = true, length = 64)
    public String getExpOrdCode() {
        return expOrdCode;
    }

    public void setExpOrdCode(String expOrdCode) {
        this.expOrdCode = expOrdCode;
    }

    @Basic
    @Column(name = "exp_ord_delflag", nullable = true)
    public Integer getExpOrdDelflag() {
        return expOrdDelflag;
    }

    public void setExpOrdDelflag(Integer expOrdDelflag) {
        this.expOrdDelflag = expOrdDelflag;
    }

    @Basic
    @Column(name = "exp_ord_money", nullable = true, precision = 2)
    public BigDecimal getExpOrdMoney() {
        return expOrdMoney;
    }

    public void setExpOrdMoney(BigDecimal expOrdMoney) {
        this.expOrdMoney = expOrdMoney;
    }

    @Basic
    @Column(name = "exp_ord_status", nullable = true)
    public Integer getExpOrdStatus() {
        return expOrdStatus;
    }

    public void setExpOrdStatus(Integer expOrdStatus) {
        this.expOrdStatus = expOrdStatus;
    }

    @Id
    @Column(name = "pk_exp_ord_id", nullable = false)
    public int getPkExpOrdId() {
        return pkExpOrdId;
    }

    public void setPkExpOrdId(int pkExpOrdId) {
        this.pkExpOrdId = pkExpOrdId;
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
    @Column(name = "commodity_num", nullable = true)
    public Integer getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(Integer commodityNum) {
        this.commodityNum = commodityNum;
    }

    @Basic
    @Column(name = "commodity_price", nullable = true, precision = 2)
    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    @Basic
    @Column(name = "commodity_url", nullable = true, length = 128)
    public String getCommodityUrl() {
        return commodityUrl;
    }

    public void setCommodityUrl(String commodityUrl) {
        this.commodityUrl = commodityUrl;
    }

    @Basic
    @Column(name = "exp_ord_remark", nullable = true, length = 128)
    public String getExpOrdRemark() {
        return expOrdRemark;
    }

    public void setExpOrdRemark(String expOrdRemark) {
        this.expOrdRemark = expOrdRemark;
    }

    @Basic
    @Column(name = "exp_ord_closetime", nullable = true)
    public Timestamp getExpOrdClosetime() {
        return expOrdClosetime;
    }

    public void setExpOrdClosetime(Timestamp expOrdClosetime) {
        this.expOrdClosetime = expOrdClosetime;
    }

    @Basic
    @Column(name = "ser_package_code", nullable = true, length = 64)
    public String getSerPackageCode() {
        return serPackageCode;
    }

    public void setSerPackageCode(String serPackageCode) {
        this.serPackageCode = serPackageCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceExpenseOrderEntity that = (ServiceExpenseOrderEntity) o;
        return pkExpOrdId == that.pkExpOrdId &&
                Objects.equals(expOrdAddtime, that.expOrdAddtime) &&
                Objects.equals(expOrdCode, that.expOrdCode) &&
                Objects.equals(expOrdDelflag, that.expOrdDelflag) &&
                Objects.equals(expOrdMoney, that.expOrdMoney) &&
                Objects.equals(expOrdStatus, that.expOrdStatus) &&
                Objects.equals(fkExpTypId, that.fkExpTypId) &&
                Objects.equals(comUsername, that.comUsername) &&
                Objects.equals(commodityName, that.commodityName) &&
                Objects.equals(commodityNum, that.commodityNum) &&
                Objects.equals(commodityPrice, that.commodityPrice) &&
                Objects.equals(commodityUrl, that.commodityUrl) &&
                Objects.equals(expOrdRemark, that.expOrdRemark) &&
                Objects.equals(expOrdClosetime, that.expOrdClosetime) &&
                Objects.equals(serPackageCode, that.serPackageCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expOrdAddtime, expOrdCode, expOrdDelflag, expOrdMoney, expOrdStatus, pkExpOrdId, fkExpTypId, comUsername, commodityName, commodityNum, commodityPrice, commodityUrl, expOrdRemark, expOrdClosetime, serPackageCode);
    }
}
