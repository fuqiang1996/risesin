package com.risesin.auth.sysuser;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_user", schema = "risesin", catalog = "")
public class SysUserEntity {
    private String sysAccount;
    private String sysUserName;
    private String sysCity;
    private String sysDistrict;
    private String sysLiveAddress;
    private Timestamp sysGmtCreate;
    private Timestamp sysGmtModified;
    private String sysMailbox;
    private String sysPassword;
    private String sysPhone;
    private String sysProvince;
    private String sysSex;
    private Integer sysStatus;
    private Integer sysDelFlag;
    private Integer fkComDeptId;
    private String sysOpenId;
    private String sysQruuid;
    private int pkId;

    @Basic
    @Column(name = "sys_account", nullable = true, length = 50)
    public String getSysAccount() {
        return sysAccount;
    }

    public void setSysAccount(String sysAccount) {
        this.sysAccount = sysAccount;
    }

    @Basic
    @Column(name = "sys_user_name", nullable = true, length = 50)
    public String getSysUserName() {
        return sysUserName;
    }

    public void setSysUserName(String sysUserName) {
        this.sysUserName = sysUserName;
    }

    @Basic
    @Column(name = "sys_city", nullable = true, length = 50)
    public String getSysCity() {
        return sysCity;
    }

    public void setSysCity(String sysCity) {
        this.sysCity = sysCity;
    }

    @Basic
    @Column(name = "sys_district", nullable = true, length = 50)
    public String getSysDistrict() {
        return sysDistrict;
    }

    public void setSysDistrict(String sysDistrict) {
        this.sysDistrict = sysDistrict;
    }

    @Basic
    @Column(name = "sys_live_address", nullable = true, length = 50)
    public String getSysLiveAddress() {
        return sysLiveAddress;
    }

    public void setSysLiveAddress(String sysLiveAddress) {
        this.sysLiveAddress = sysLiveAddress;
    }

    @Basic
    @Column(name = "sys_gmt_create", nullable = true)
    public Timestamp getSysGmtCreate() {
        return sysGmtCreate;
    }

    public void setSysGmtCreate(Timestamp sysGmtCreate) {
        this.sysGmtCreate = sysGmtCreate;
    }

    @Basic
    @Column(name = "sys_gmt_modified", nullable = true)
    public Timestamp getSysGmtModified() {
        return sysGmtModified;
    }

    public void setSysGmtModified(Timestamp sysGmtModified) {
        this.sysGmtModified = sysGmtModified;
    }

    @Basic
    @Column(name = "sys_mailbox", nullable = true, length = 50)
    public String getSysMailbox() {
        return sysMailbox;
    }

    public void setSysMailbox(String sysMailbox) {
        this.sysMailbox = sysMailbox;
    }

    @Basic
    @Column(name = "sys_password", nullable = true, length = 50)
    public String getSysPassword() {
        return sysPassword;
    }

    public void setSysPassword(String sysPassword) {
        this.sysPassword = sysPassword;
    }

    @Basic
    @Column(name = "sys_phone", nullable = true, length = 50)
    public String getSysPhone() {
        return sysPhone;
    }

    public void setSysPhone(String sysPhone) {
        this.sysPhone = sysPhone;
    }

    @Basic
    @Column(name = "sys_province", nullable = true, length = 50)
    public String getSysProvince() {
        return sysProvince;
    }

    public void setSysProvince(String sysProvince) {
        this.sysProvince = sysProvince;
    }

    @Basic
    @Column(name = "sys_sex", nullable = true, length = 50)
    public String getSysSex() {
        return sysSex;
    }

    public void setSysSex(String sysSex) {
        this.sysSex = sysSex;
    }

    @Basic
    @Column(name = "sys_status", nullable = true)
    public Integer getSysStatus() {
        return sysStatus;
    }

    public void setSysStatus(Integer sysStatus) {
        this.sysStatus = sysStatus;
    }

    @Basic
    @Column(name = "sys_del_flag", nullable = true)
    public Integer getSysDelFlag() {
        return sysDelFlag;
    }

    public void setSysDelFlag(Integer sysDelFlag) {
        this.sysDelFlag = sysDelFlag;
    }

    @Basic
    @Column(name = "fk_com_dept_id", nullable = true)
    public Integer getFkComDeptId() {
        return fkComDeptId;
    }

    public void setFkComDeptId(Integer fkComDeptId) {
        this.fkComDeptId = fkComDeptId;
    }

    @Basic
    @Column(name = "sys_open_id", nullable = true, length = 50)
    public String getSysOpenId() {
        return sysOpenId;
    }

    public void setSysOpenId(String sysOpenId) {
        this.sysOpenId = sysOpenId;
    }

    @Basic
    @Column(name = "sys_qruuid", nullable = true, length = 50)
    public String getSysQruuid() {
        return sysQruuid;
    }

    public void setSysQruuid(String sysQruuid) {
        this.sysQruuid = sysQruuid;
    }

    @Id
    @Column(name = "pk_id", nullable = false)
    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUserEntity that = (SysUserEntity) o;
        return pkId == that.pkId &&
                Objects.equals(sysAccount, that.sysAccount) &&
                Objects.equals(sysUserName, that.sysUserName) &&
                Objects.equals(sysCity, that.sysCity) &&
                Objects.equals(sysDistrict, that.sysDistrict) &&
                Objects.equals(sysLiveAddress, that.sysLiveAddress) &&
                Objects.equals(sysGmtCreate, that.sysGmtCreate) &&
                Objects.equals(sysGmtModified, that.sysGmtModified) &&
                Objects.equals(sysMailbox, that.sysMailbox) &&
                Objects.equals(sysPassword, that.sysPassword) &&
                Objects.equals(sysPhone, that.sysPhone) &&
                Objects.equals(sysProvince, that.sysProvince) &&
                Objects.equals(sysSex, that.sysSex) &&
                Objects.equals(sysStatus, that.sysStatus) &&
                Objects.equals(sysDelFlag, that.sysDelFlag) &&
                Objects.equals(fkComDeptId, that.fkComDeptId) &&
                Objects.equals(sysOpenId, that.sysOpenId) &&
                Objects.equals(sysQruuid, that.sysQruuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysAccount, sysUserName, sysCity, sysDistrict, sysLiveAddress, sysGmtCreate, sysGmtModified, sysMailbox, sysPassword, sysPhone, sysProvince, sysSex, sysStatus, sysDelFlag, fkComDeptId, sysOpenId, sysQruuid, pkId);
    }
}
