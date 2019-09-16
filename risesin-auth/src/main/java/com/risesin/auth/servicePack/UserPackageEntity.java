package com.risesin.auth.servicePack;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user_package", schema = "risesin", catalog = "")
public class UserPackageEntity {
    private int pkUserPackId;
    private Timestamp userPackAddtime;
    private String userPackCode;
    private Integer userPackCount;
    private String userPackImg;
    private String userPackKeywords;
    private Timestamp userPackLastmodify;
    private String userPackName;
    private Integer userPackOrdernum;
    private Integer userPackPrice;
    private Integer userPackPv;
    private Integer userPackDelflag;
    private Integer userPackUsercount;
    private String userPackageDesc;

    @Id
    @Column(name = "pk_user_pack_id", nullable = false)
    public int getPkUserPackId() {
        return pkUserPackId;
    }

    public void setPkUserPackId(int pkUserPackId) {
        this.pkUserPackId = pkUserPackId;
    }

    @Basic
    @Column(name = "user_pack_addtime", nullable = true)
    public Timestamp getUserPackAddtime() {
        return userPackAddtime;
    }

    public void setUserPackAddtime(Timestamp userPackAddtime) {
        this.userPackAddtime = userPackAddtime;
    }

    @Basic
    @Column(name = "user_pack_code", nullable = true, length = 50)
    public String getUserPackCode() {
        return userPackCode;
    }

    public void setUserPackCode(String userPackCode) {
        this.userPackCode = userPackCode;
    }

    @Basic
    @Column(name = "user_pack_count", nullable = true)
    public Integer getUserPackCount() {
        return userPackCount;
    }

    public void setUserPackCount(Integer userPackCount) {
        this.userPackCount = userPackCount;
    }

    @Basic
    @Column(name = "user_pack_img", nullable = true, length = 50)
    public String getUserPackImg() {
        return userPackImg;
    }

    public void setUserPackImg(String userPackImg) {
        this.userPackImg = userPackImg;
    }

    @Basic
    @Column(name = "user_pack_keywords", nullable = true, length = 50)
    public String getUserPackKeywords() {
        return userPackKeywords;
    }

    public void setUserPackKeywords(String userPackKeywords) {
        this.userPackKeywords = userPackKeywords;
    }

    @Basic
    @Column(name = "user_pack_lastmodify", nullable = true)
    public Timestamp getUserPackLastmodify() {
        return userPackLastmodify;
    }

    public void setUserPackLastmodify(Timestamp userPackLastmodify) {
        this.userPackLastmodify = userPackLastmodify;
    }

    @Basic
    @Column(name = "user_pack_name", nullable = true, length = 50)
    public String getUserPackName() {
        return userPackName;
    }

    public void setUserPackName(String userPackName) {
        this.userPackName = userPackName;
    }

    @Basic
    @Column(name = "user_pack_ordernum", nullable = true)
    public Integer getUserPackOrdernum() {
        return userPackOrdernum;
    }

    public void setUserPackOrdernum(Integer userPackOrdernum) {
        this.userPackOrdernum = userPackOrdernum;
    }

    @Basic
    @Column(name = "user_pack_price", nullable = true)
    public Integer getUserPackPrice() {
        return userPackPrice;
    }

    public void setUserPackPrice(Integer userPackPrice) {
        this.userPackPrice = userPackPrice;
    }

    @Basic
    @Column(name = "user_pack_pv", nullable = true)
    public Integer getUserPackPv() {
        return userPackPv;
    }

    public void setUserPackPv(Integer userPackPv) {
        this.userPackPv = userPackPv;
    }

    @Basic
    @Column(name = "user_pack_delflag", nullable = true)
    public Integer getUserPackDelflag() {
        return userPackDelflag;
    }

    public void setUserPackDelflag(Integer userPackDelflag) {
        this.userPackDelflag = userPackDelflag;
    }

    @Basic
    @Column(name = "user_pack_usercount", nullable = true)
    public Integer getUserPackUsercount() {
        return userPackUsercount;
    }

    public void setUserPackUsercount(Integer userPackUsercount) {
        this.userPackUsercount = userPackUsercount;
    }

    @Basic
    @Column(name = "user_package_desc", nullable = true, length = 250)
    public String getUserPackageDesc() {
        return userPackageDesc;
    }

    public void setUserPackageDesc(String userPackageDesc) {
        this.userPackageDesc = userPackageDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPackageEntity that = (UserPackageEntity) o;
        return pkUserPackId == that.pkUserPackId &&
                Objects.equals(userPackAddtime, that.userPackAddtime) &&
                Objects.equals(userPackCode, that.userPackCode) &&
                Objects.equals(userPackCount, that.userPackCount) &&
                Objects.equals(userPackImg, that.userPackImg) &&
                Objects.equals(userPackKeywords, that.userPackKeywords) &&
                Objects.equals(userPackLastmodify, that.userPackLastmodify) &&
                Objects.equals(userPackName, that.userPackName) &&
                Objects.equals(userPackOrdernum, that.userPackOrdernum) &&
                Objects.equals(userPackPrice, that.userPackPrice) &&
                Objects.equals(userPackPv, that.userPackPv) &&
                Objects.equals(userPackDelflag, that.userPackDelflag) &&
                Objects.equals(userPackUsercount, that.userPackUsercount) &&
                Objects.equals(userPackageDesc, that.userPackageDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkUserPackId, userPackAddtime, userPackCode, userPackCount, userPackImg, userPackKeywords, userPackLastmodify, userPackName, userPackOrdernum, userPackPrice, userPackPv, userPackDelflag, userPackUsercount, userPackageDesc);
    }
}
