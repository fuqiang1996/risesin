package com.risesin.auth.sysuser;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_permission", schema = "risesin", catalog = "")
public class SysPermissionEntity {
    private int pkPerId;
    private String perName;
    private String perPerms;
    private String perUrl;
    private Integer perParentId;
    private String perRemark;
    private Integer perOrderNum;
    private Timestamp perAddtime;
    private Timestamp perLastmodify;
    private Integer perDelflag;

    @Id
    @Column(name = "pk_per_id", nullable = false)
    public int getPkPerId() {
        return pkPerId;
    }

    public void setPkPerId(int pkPerId) {
        this.pkPerId = pkPerId;
    }

    @Basic
    @Column(name = "per_name", nullable = true, length = 50)
    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    @Basic
    @Column(name = "per_perms", nullable = true, length = 50)
    public String getPerPerms() {
        return perPerms;
    }

    public void setPerPerms(String perPerms) {
        this.perPerms = perPerms;
    }

    @Basic
    @Column(name = "per_url", nullable = true, length = 50)
    public String getPerUrl() {
        return perUrl;
    }

    public void setPerUrl(String perUrl) {
        this.perUrl = perUrl;
    }

    @Basic
    @Column(name = "per_parent_id", nullable = true)
    public Integer getPerParentId() {
        return perParentId;
    }

    public void setPerParentId(Integer perParentId) {
        this.perParentId = perParentId;
    }

    @Basic
    @Column(name = "per_remark", nullable = true, length = 250)
    public String getPerRemark() {
        return perRemark;
    }

    public void setPerRemark(String perRemark) {
        this.perRemark = perRemark;
    }

    @Basic
    @Column(name = "per_order_num", nullable = true)
    public Integer getPerOrderNum() {
        return perOrderNum;
    }

    public void setPerOrderNum(Integer perOrderNum) {
        this.perOrderNum = perOrderNum;
    }

    @Basic
    @Column(name = "per_addtime", nullable = true)
    public Timestamp getPerAddtime() {
        return perAddtime;
    }

    public void setPerAddtime(Timestamp perAddtime) {
        this.perAddtime = perAddtime;
    }

    @Basic
    @Column(name = "per_lastmodify", nullable = true)
    public Timestamp getPerLastmodify() {
        return perLastmodify;
    }

    public void setPerLastmodify(Timestamp perLastmodify) {
        this.perLastmodify = perLastmodify;
    }

    @Basic
    @Column(name = "per_delflag", nullable = true)
    public Integer getPerDelflag() {
        return perDelflag;
    }

    public void setPerDelflag(Integer perDelflag) {
        this.perDelflag = perDelflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysPermissionEntity that = (SysPermissionEntity) o;
        return pkPerId == that.pkPerId &&
                Objects.equals(perName, that.perName) &&
                Objects.equals(perPerms, that.perPerms) &&
                Objects.equals(perUrl, that.perUrl) &&
                Objects.equals(perParentId, that.perParentId) &&
                Objects.equals(perRemark, that.perRemark) &&
                Objects.equals(perOrderNum, that.perOrderNum) &&
                Objects.equals(perAddtime, that.perAddtime) &&
                Objects.equals(perLastmodify, that.perLastmodify) &&
                Objects.equals(perDelflag, that.perDelflag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkPerId, perName, perPerms, perUrl, perParentId, perRemark, perOrderNum, perAddtime, perLastmodify, perDelflag);
    }
}
