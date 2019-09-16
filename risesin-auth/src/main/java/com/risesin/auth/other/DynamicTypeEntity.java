package com.risesin.auth.other;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "dynamic_type", schema = "risesin", catalog = "")
public class DynamicTypeEntity {
    private Timestamp dynTypAddtime;
    private String dynTypCode;
    private Integer dynTypDelflag;
    private Timestamp dynTypLastmodify;
    private String dynTypName;
    private int pkDynTypId;
    private Integer fkSysUserid;

    @Basic
    @Column(name = "dyn_typ_addtime", nullable = true)
    public Timestamp getDynTypAddtime() {
        return dynTypAddtime;
    }

    public void setDynTypAddtime(Timestamp dynTypAddtime) {
        this.dynTypAddtime = dynTypAddtime;
    }

    @Basic
    @Column(name = "dyn_typ_code", nullable = true, length = 64)
    public String getDynTypCode() {
        return dynTypCode;
    }

    public void setDynTypCode(String dynTypCode) {
        this.dynTypCode = dynTypCode;
    }

    @Basic
    @Column(name = "dyn_typ_delflag", nullable = true)
    public Integer getDynTypDelflag() {
        return dynTypDelflag;
    }

    public void setDynTypDelflag(Integer dynTypDelflag) {
        this.dynTypDelflag = dynTypDelflag;
    }

    @Basic
    @Column(name = "dyn_typ_lastmodify", nullable = true)
    public Timestamp getDynTypLastmodify() {
        return dynTypLastmodify;
    }

    public void setDynTypLastmodify(Timestamp dynTypLastmodify) {
        this.dynTypLastmodify = dynTypLastmodify;
    }

    @Basic
    @Column(name = "dyn_typ_name", nullable = true, length = 64)
    public String getDynTypName() {
        return dynTypName;
    }

    public void setDynTypName(String dynTypName) {
        this.dynTypName = dynTypName;
    }

    @Id
    @Column(name = "pk_dyn_typ_id", nullable = false)
    public int getPkDynTypId() {
        return pkDynTypId;
    }

    public void setPkDynTypId(int pkDynTypId) {
        this.pkDynTypId = pkDynTypId;
    }

    @Basic
    @Column(name = "fk_sys_userid", nullable = true)
    public Integer getFkSysUserid() {
        return fkSysUserid;
    }

    public void setFkSysUserid(Integer fkSysUserid) {
        this.fkSysUserid = fkSysUserid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicTypeEntity that = (DynamicTypeEntity) o;
        return pkDynTypId == that.pkDynTypId &&
                Objects.equals(dynTypAddtime, that.dynTypAddtime) &&
                Objects.equals(dynTypCode, that.dynTypCode) &&
                Objects.equals(dynTypDelflag, that.dynTypDelflag) &&
                Objects.equals(dynTypLastmodify, that.dynTypLastmodify) &&
                Objects.equals(dynTypName, that.dynTypName) &&
                Objects.equals(fkSysUserid, that.fkSysUserid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dynTypAddtime, dynTypCode, dynTypDelflag, dynTypLastmodify, dynTypName, pkDynTypId, fkSysUserid);
    }
}
