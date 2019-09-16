package com.risesin.auth.sysuser;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ext_sys_user", schema = "risesin", catalog = "")
public class ExtSysUserEntity {
    private int pkExtId;
    private Integer fkSysUserId;
    private Integer fkChaDefId;
    private Integer extDelflag;
    private String extSysUsername;
    private Timestamp extSysUserAddtime;
    private String extChaDefName;

    @Id
    @Column(name = "pk_ext_id", nullable = false)
    public int getPkExtId() {
        return pkExtId;
    }

    public void setPkExtId(int pkExtId) {
        this.pkExtId = pkExtId;
    }

    @Basic
    @Column(name = "fk_sys_user_id", nullable = true)
    public Integer getFkSysUserId() {
        return fkSysUserId;
    }

    public void setFkSysUserId(Integer fkSysUserId) {
        this.fkSysUserId = fkSysUserId;
    }

    @Basic
    @Column(name = "fk_cha_def_id", nullable = true)
    public Integer getFkChaDefId() {
        return fkChaDefId;
    }

    public void setFkChaDefId(Integer fkChaDefId) {
        this.fkChaDefId = fkChaDefId;
    }

    @Basic
    @Column(name = "ext_delflag", nullable = true)
    public Integer getExtDelflag() {
        return extDelflag;
    }

    public void setExtDelflag(Integer extDelflag) {
        this.extDelflag = extDelflag;
    }

    @Basic
    @Column(name = "ext_sys_username", nullable = true, length = 50)
    public String getExtSysUsername() {
        return extSysUsername;
    }

    public void setExtSysUsername(String extSysUsername) {
        this.extSysUsername = extSysUsername;
    }

    @Basic
    @Column(name = "ext_sys_user_addtime", nullable = true)
    public Timestamp getExtSysUserAddtime() {
        return extSysUserAddtime;
    }

    public void setExtSysUserAddtime(Timestamp extSysUserAddtime) {
        this.extSysUserAddtime = extSysUserAddtime;
    }

    @Basic
    @Column(name = "ext_cha_def_name", nullable = true, length = 50)
    public String getExtChaDefName() {
        return extChaDefName;
    }

    public void setExtChaDefName(String extChaDefName) {
        this.extChaDefName = extChaDefName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtSysUserEntity that = (ExtSysUserEntity) o;
        return pkExtId == that.pkExtId &&
                Objects.equals(fkSysUserId, that.fkSysUserId) &&
                Objects.equals(fkChaDefId, that.fkChaDefId) &&
                Objects.equals(extDelflag, that.extDelflag) &&
                Objects.equals(extSysUsername, that.extSysUsername) &&
                Objects.equals(extSysUserAddtime, that.extSysUserAddtime) &&
                Objects.equals(extChaDefName, that.extChaDefName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkExtId, fkSysUserId, fkChaDefId, extDelflag, extSysUsername, extSysUserAddtime, extChaDefName);
    }
}
