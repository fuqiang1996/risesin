package com.risesin.auth.comuesr;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "common_user", schema = "risesin", catalog = "")
public class CommonUserEntity {
    private int pkId;
    private String comAccount;
    private String comUserName;
    private String comCity;
    private String comDistrict;
    private String comLiveAddress;
    private Timestamp comGmtCreate;
    private Timestamp comGmtModified;
    private String comMailbox;
    private String comPassword;
    private String comPhone;
    private String comProvince;
    private String comSex;
    private Integer comDelFlag;
    private Integer fkComDeptId;
    private String comOpenId;
    private String comQruuid;

    @Id
    @Column(name = "pk_id", nullable = false)
    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    @Basic
    @Column(name = "com_account", nullable = true, length = 50)
    public String getComAccount() {
        return comAccount;
    }

    public void setComAccount(String comAccount) {
        this.comAccount = comAccount;
    }

    @Basic
    @Column(name = "com_user_name", nullable = true, length = 50)
    public String getComUserName() {
        return comUserName;
    }

    public void setComUserName(String comUserName) {
        this.comUserName = comUserName;
    }

    @Basic
    @Column(name = "com_city", nullable = true, length = 50)
    public String getComCity() {
        return comCity;
    }

    public void setComCity(String comCity) {
        this.comCity = comCity;
    }

    @Basic
    @Column(name = "com_district", nullable = true, length = 50)
    public String getComDistrict() {
        return comDistrict;
    }

    public void setComDistrict(String comDistrict) {
        this.comDistrict = comDistrict;
    }

    @Basic
    @Column(name = "com_live_address", nullable = true, length = 50)
    public String getComLiveAddress() {
        return comLiveAddress;
    }

    public void setComLiveAddress(String comLiveAddress) {
        this.comLiveAddress = comLiveAddress;
    }

    @Basic
    @Column(name = "com_gmt_create", nullable = true)
    public Timestamp getComGmtCreate() {
        return comGmtCreate;
    }

    public void setComGmtCreate(Timestamp comGmtCreate) {
        this.comGmtCreate = comGmtCreate;
    }

    @Basic
    @Column(name = "com_gmt_modified", nullable = true)
    public Timestamp getComGmtModified() {
        return comGmtModified;
    }

    public void setComGmtModified(Timestamp comGmtModified) {
        this.comGmtModified = comGmtModified;
    }

    @Basic
    @Column(name = "com_mailbox", nullable = true, length = 50)
    public String getComMailbox() {
        return comMailbox;
    }

    public void setComMailbox(String comMailbox) {
        this.comMailbox = comMailbox;
    }

    @Basic
    @Column(name = "com_password", nullable = true, length = 50)
    public String getComPassword() {
        return comPassword;
    }

    public void setComPassword(String comPassword) {
        this.comPassword = comPassword;
    }

    @Basic
    @Column(name = "com_phone", nullable = true, length = 50)
    public String getComPhone() {
        return comPhone;
    }

    public void setComPhone(String comPhone) {
        this.comPhone = comPhone;
    }

    @Basic
    @Column(name = "com_province", nullable = true, length = 50)
    public String getComProvince() {
        return comProvince;
    }

    public void setComProvince(String comProvince) {
        this.comProvince = comProvince;
    }

    @Basic
    @Column(name = "com_sex", nullable = true, length = 50)
    public String getComSex() {
        return comSex;
    }

    public void setComSex(String comSex) {
        this.comSex = comSex;
    }

    @Basic
    @Column(name = "com_del_flag", nullable = true)
    public Integer getComDelFlag() {
        return comDelFlag;
    }

    public void setComDelFlag(Integer comDelFlag) {
        this.comDelFlag = comDelFlag;
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
    @Column(name = "com_open_id", nullable = true, length = 50)
    public String getComOpenId() {
        return comOpenId;
    }

    public void setComOpenId(String comOpenId) {
        this.comOpenId = comOpenId;
    }

    @Basic
    @Column(name = "com_qruuid", nullable = true, length = 50)
    public String getComQruuid() {
        return comQruuid;
    }

    public void setComQruuid(String comQruuid) {
        this.comQruuid = comQruuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonUserEntity that = (CommonUserEntity) o;
        return pkId == that.pkId &&
                Objects.equals(comAccount, that.comAccount) &&
                Objects.equals(comUserName, that.comUserName) &&
                Objects.equals(comCity, that.comCity) &&
                Objects.equals(comDistrict, that.comDistrict) &&
                Objects.equals(comLiveAddress, that.comLiveAddress) &&
                Objects.equals(comGmtCreate, that.comGmtCreate) &&
                Objects.equals(comGmtModified, that.comGmtModified) &&
                Objects.equals(comMailbox, that.comMailbox) &&
                Objects.equals(comPassword, that.comPassword) &&
                Objects.equals(comPhone, that.comPhone) &&
                Objects.equals(comProvince, that.comProvince) &&
                Objects.equals(comSex, that.comSex) &&
                Objects.equals(comDelFlag, that.comDelFlag) &&
                Objects.equals(fkComDeptId, that.fkComDeptId) &&
                Objects.equals(comOpenId, that.comOpenId) &&
                Objects.equals(comQruuid, that.comQruuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkId, comAccount, comUserName, comCity, comDistrict, comLiveAddress, comGmtCreate, comGmtModified, comMailbox, comPassword, comPhone, comProvince, comSex, comDelFlag, fkComDeptId, comOpenId, comQruuid);
    }
}
