package com.risesin.auth.sysuser;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_company", schema = "risesin", catalog = "")
public class SysCompanyEntity {
    private int pkBranId;
    private String branName;
    private String branArea;
    private String branBusinessAddress;
    private String branRegAddress;
    private Integer branOrderNum;
    private Integer branDelflag;
    private Timestamp branAddtime;
    private Timestamp branLastmodified;
    private String branLeader;
    private Integer fkLoanAgenId;

    @Id
    @Column(name = "pk_bran_id", nullable = false)
    public int getPkBranId() {
        return pkBranId;
    }

    public void setPkBranId(int pkBranId) {
        this.pkBranId = pkBranId;
    }

    @Basic
    @Column(name = "bran_name", nullable = true, length = 50)
    public String getBranName() {
        return branName;
    }

    public void setBranName(String branName) {
        this.branName = branName;
    }

    @Basic
    @Column(name = "bran_area", nullable = true, length = 50)
    public String getBranArea() {
        return branArea;
    }

    public void setBranArea(String branArea) {
        this.branArea = branArea;
    }

    @Basic
    @Column(name = "bran_business_address", nullable = true, length = 50)
    public String getBranBusinessAddress() {
        return branBusinessAddress;
    }

    public void setBranBusinessAddress(String branBusinessAddress) {
        this.branBusinessAddress = branBusinessAddress;
    }

    @Basic
    @Column(name = "bran_reg_address", nullable = true, length = 50)
    public String getBranRegAddress() {
        return branRegAddress;
    }

    public void setBranRegAddress(String branRegAddress) {
        this.branRegAddress = branRegAddress;
    }

    @Basic
    @Column(name = "bran_order_num", nullable = true)
    public Integer getBranOrderNum() {
        return branOrderNum;
    }

    public void setBranOrderNum(Integer branOrderNum) {
        this.branOrderNum = branOrderNum;
    }

    @Basic
    @Column(name = "bran_delflag", nullable = true)
    public Integer getBranDelflag() {
        return branDelflag;
    }

    public void setBranDelflag(Integer branDelflag) {
        this.branDelflag = branDelflag;
    }

    @Basic
    @Column(name = "bran_addtime", nullable = true)
    public Timestamp getBranAddtime() {
        return branAddtime;
    }

    public void setBranAddtime(Timestamp branAddtime) {
        this.branAddtime = branAddtime;
    }

    @Basic
    @Column(name = "bran_lastmodified", nullable = true)
    public Timestamp getBranLastmodified() {
        return branLastmodified;
    }

    public void setBranLastmodified(Timestamp branLastmodified) {
        this.branLastmodified = branLastmodified;
    }

    @Basic
    @Column(name = "bran_leader", nullable = true, length = 50)
    public String getBranLeader() {
        return branLeader;
    }

    public void setBranLeader(String branLeader) {
        this.branLeader = branLeader;
    }

    @Basic
    @Column(name = "fk_loan_agen_id", nullable = true)
    public Integer getFkLoanAgenId() {
        return fkLoanAgenId;
    }

    public void setFkLoanAgenId(Integer fkLoanAgenId) {
        this.fkLoanAgenId = fkLoanAgenId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysCompanyEntity that = (SysCompanyEntity) o;
        return pkBranId == that.pkBranId &&
                Objects.equals(branName, that.branName) &&
                Objects.equals(branArea, that.branArea) &&
                Objects.equals(branBusinessAddress, that.branBusinessAddress) &&
                Objects.equals(branRegAddress, that.branRegAddress) &&
                Objects.equals(branOrderNum, that.branOrderNum) &&
                Objects.equals(branDelflag, that.branDelflag) &&
                Objects.equals(branAddtime, that.branAddtime) &&
                Objects.equals(branLastmodified, that.branLastmodified) &&
                Objects.equals(branLeader, that.branLeader) &&
                Objects.equals(fkLoanAgenId, that.fkLoanAgenId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkBranId, branName, branArea, branBusinessAddress, branRegAddress, branOrderNum, branDelflag, branAddtime, branLastmodified, branLeader, fkLoanAgenId);
    }
}
