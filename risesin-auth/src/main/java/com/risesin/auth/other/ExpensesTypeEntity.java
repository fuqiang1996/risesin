package com.risesin.auth.other;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "expenses_type", schema = "risesin", catalog = "")
public class ExpensesTypeEntity {
    private Timestamp expTypAddtime;
    private String expTypCode;
    private Integer expTypDelflag;
    private int pkExpTypId;
    private Timestamp expTypLastmodify;
    private String expTypName;
    private Integer fkSysUserid;

    @Basic
    @Column(name = "exp_typ_addtime", nullable = true)
    public Timestamp getExpTypAddtime() {
        return expTypAddtime;
    }

    public void setExpTypAddtime(Timestamp expTypAddtime) {
        this.expTypAddtime = expTypAddtime;
    }

    @Basic
    @Column(name = "exp_typ_code", nullable = true, length = 64)
    public String getExpTypCode() {
        return expTypCode;
    }

    public void setExpTypCode(String expTypCode) {
        this.expTypCode = expTypCode;
    }

    @Basic
    @Column(name = "exp_typ_delflag", nullable = true)
    public Integer getExpTypDelflag() {
        return expTypDelflag;
    }

    public void setExpTypDelflag(Integer expTypDelflag) {
        this.expTypDelflag = expTypDelflag;
    }

    @Id
    @Column(name = "pk_exp_typ_id", nullable = false)
    public int getPkExpTypId() {
        return pkExpTypId;
    }

    public void setPkExpTypId(int pkExpTypId) {
        this.pkExpTypId = pkExpTypId;
    }

    @Basic
    @Column(name = "exp_typ_lastmodify", nullable = true)
    public Timestamp getExpTypLastmodify() {
        return expTypLastmodify;
    }

    public void setExpTypLastmodify(Timestamp expTypLastmodify) {
        this.expTypLastmodify = expTypLastmodify;
    }

    @Basic
    @Column(name = "exp_typ_name", nullable = true, length = 64)
    public String getExpTypName() {
        return expTypName;
    }

    public void setExpTypName(String expTypName) {
        this.expTypName = expTypName;
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
        ExpensesTypeEntity that = (ExpensesTypeEntity) o;
        return pkExpTypId == that.pkExpTypId &&
                Objects.equals(expTypAddtime, that.expTypAddtime) &&
                Objects.equals(expTypCode, that.expTypCode) &&
                Objects.equals(expTypDelflag, that.expTypDelflag) &&
                Objects.equals(expTypLastmodify, that.expTypLastmodify) &&
                Objects.equals(expTypName, that.expTypName) &&
                Objects.equals(fkSysUserid, that.fkSysUserid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expTypAddtime, expTypCode, expTypDelflag, pkExpTypId, expTypLastmodify, expTypName, fkSysUserid);
    }
}
