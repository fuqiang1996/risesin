package com.risesin.auth.servicePack;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sms_package", schema = "risesin", catalog = "")
public class SmsPackageEntity {
    private int smsPackId;
    private String smsPackName;
    private Double smsPackPrice;
    private String smsPackImg;
    private String smsPackGrade;
    private String smsPackDesc;
    private Integer smsPackCount;
    private Integer smsPackPv;
    private Integer smsPackDelflag;
    private Timestamp smsPackAddtime;
    private String smsPackCode;
    private String smsPackUserCustomer;
    private Timestamp smsPackLastmidify;

    @Id
    @Column(name = "sms_pack_id", nullable = false)
    public int getSmsPackId() {
        return smsPackId;
    }

    public void setSmsPackId(int smsPackId) {
        this.smsPackId = smsPackId;
    }

    @Basic
    @Column(name = "sms_pack_name", nullable = true, length = 50)
    public String getSmsPackName() {
        return smsPackName;
    }

    public void setSmsPackName(String smsPackName) {
        this.smsPackName = smsPackName;
    }

    @Basic
    @Column(name = "sms_pack_price", nullable = true, precision = 2)
    public Double getSmsPackPrice() {
        return smsPackPrice;
    }

    public void setSmsPackPrice(Double smsPackPrice) {
        this.smsPackPrice = smsPackPrice;
    }

    @Basic
    @Column(name = "sms_pack_img", nullable = true, length = 50)
    public String getSmsPackImg() {
        return smsPackImg;
    }

    public void setSmsPackImg(String smsPackImg) {
        this.smsPackImg = smsPackImg;
    }

    @Basic
    @Column(name = "sms_pack_grade", nullable = true, length = 50)
    public String getSmsPackGrade() {
        return smsPackGrade;
    }

    public void setSmsPackGrade(String smsPackGrade) {
        this.smsPackGrade = smsPackGrade;
    }

    @Basic
    @Column(name = "sms_pack_desc", nullable = true, length = 50)
    public String getSmsPackDesc() {
        return smsPackDesc;
    }

    public void setSmsPackDesc(String smsPackDesc) {
        this.smsPackDesc = smsPackDesc;
    }

    @Basic
    @Column(name = "sms_pack_count", nullable = true)
    public Integer getSmsPackCount() {
        return smsPackCount;
    }

    public void setSmsPackCount(Integer smsPackCount) {
        this.smsPackCount = smsPackCount;
    }

    @Basic
    @Column(name = "sms_pack_pv", nullable = true)
    public Integer getSmsPackPv() {
        return smsPackPv;
    }

    public void setSmsPackPv(Integer smsPackPv) {
        this.smsPackPv = smsPackPv;
    }

    @Basic
    @Column(name = "sms_pack_delflag", nullable = true)
    public Integer getSmsPackDelflag() {
        return smsPackDelflag;
    }

    public void setSmsPackDelflag(Integer smsPackDelflag) {
        this.smsPackDelflag = smsPackDelflag;
    }

    @Basic
    @Column(name = "sms_pack_addtime", nullable = true)
    public Timestamp getSmsPackAddtime() {
        return smsPackAddtime;
    }

    public void setSmsPackAddtime(Timestamp smsPackAddtime) {
        this.smsPackAddtime = smsPackAddtime;
    }

    @Basic
    @Column(name = "sms_pack_code", nullable = true, length = 50)
    public String getSmsPackCode() {
        return smsPackCode;
    }

    public void setSmsPackCode(String smsPackCode) {
        this.smsPackCode = smsPackCode;
    }

    @Basic
    @Column(name = "sms_pack_user_customer", nullable = true, length = 50)
    public String getSmsPackUserCustomer() {
        return smsPackUserCustomer;
    }

    public void setSmsPackUserCustomer(String smsPackUserCustomer) {
        this.smsPackUserCustomer = smsPackUserCustomer;
    }

    @Basic
    @Column(name = "sms_pack_lastmidify", nullable = true)
    public Timestamp getSmsPackLastmidify() {
        return smsPackLastmidify;
    }

    public void setSmsPackLastmidify(Timestamp smsPackLastmidify) {
        this.smsPackLastmidify = smsPackLastmidify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmsPackageEntity that = (SmsPackageEntity) o;
        return smsPackId == that.smsPackId &&
                Objects.equals(smsPackName, that.smsPackName) &&
                Objects.equals(smsPackPrice, that.smsPackPrice) &&
                Objects.equals(smsPackImg, that.smsPackImg) &&
                Objects.equals(smsPackGrade, that.smsPackGrade) &&
                Objects.equals(smsPackDesc, that.smsPackDesc) &&
                Objects.equals(smsPackCount, that.smsPackCount) &&
                Objects.equals(smsPackPv, that.smsPackPv) &&
                Objects.equals(smsPackDelflag, that.smsPackDelflag) &&
                Objects.equals(smsPackAddtime, that.smsPackAddtime) &&
                Objects.equals(smsPackCode, that.smsPackCode) &&
                Objects.equals(smsPackUserCustomer, that.smsPackUserCustomer) &&
                Objects.equals(smsPackLastmidify, that.smsPackLastmidify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smsPackId, smsPackName, smsPackPrice, smsPackImg, smsPackGrade, smsPackDesc, smsPackCount, smsPackPv, smsPackDelflag, smsPackAddtime, smsPackCode, smsPackUserCustomer, smsPackLastmidify);
    }
}
