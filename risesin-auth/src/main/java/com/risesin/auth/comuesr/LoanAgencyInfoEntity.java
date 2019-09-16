package com.risesin.auth.comuesr;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "loan_agency_info", schema = "risesin", catalog = "")
public class LoanAgencyInfoEntity {
    private int pkLoanAgenId;
    private String loanAgenWebsite;
    private String loanAgenName;
    private String loanBusinessAddress;
    private String loanEnglishName;
    private String loanIndustryInvolved;
    private Timestamp loanAgenAddtime;
    private Timestamp loanLastmodify;
    private Integer loanOrderNum;
    private String loanPhone;
    private String loanRegAddress;
    private String loanAgenArea;
    private String loanAgenFullname;
    private Integer loanDelFlag;

    @Id
    @Column(name = "pk_loan_agen_id", nullable = false)
    public int getPkLoanAgenId() {
        return pkLoanAgenId;
    }

    public void setPkLoanAgenId(int pkLoanAgenId) {
        this.pkLoanAgenId = pkLoanAgenId;
    }

    @Basic
    @Column(name = "loan_agen_website", nullable = true, length = 50)
    public String getLoanAgenWebsite() {
        return loanAgenWebsite;
    }

    public void setLoanAgenWebsite(String loanAgenWebsite) {
        this.loanAgenWebsite = loanAgenWebsite;
    }

    @Basic
    @Column(name = "loan_agen_name", nullable = true, length = 50)
    public String getLoanAgenName() {
        return loanAgenName;
    }

    public void setLoanAgenName(String loanAgenName) {
        this.loanAgenName = loanAgenName;
    }

    @Basic
    @Column(name = "loan_business_address", nullable = true, length = 50)
    public String getLoanBusinessAddress() {
        return loanBusinessAddress;
    }

    public void setLoanBusinessAddress(String loanBusinessAddress) {
        this.loanBusinessAddress = loanBusinessAddress;
    }

    @Basic
    @Column(name = "loan_english_name", nullable = true, length = 50)
    public String getLoanEnglishName() {
        return loanEnglishName;
    }

    public void setLoanEnglishName(String loanEnglishName) {
        this.loanEnglishName = loanEnglishName;
    }

    @Basic
    @Column(name = "loan_industry_involved", nullable = true, length = 50)
    public String getLoanIndustryInvolved() {
        return loanIndustryInvolved;
    }

    public void setLoanIndustryInvolved(String loanIndustryInvolved) {
        this.loanIndustryInvolved = loanIndustryInvolved;
    }

    @Basic
    @Column(name = "loan_agen_addtime", nullable = true)
    public Timestamp getLoanAgenAddtime() {
        return loanAgenAddtime;
    }

    public void setLoanAgenAddtime(Timestamp loanAgenAddtime) {
        this.loanAgenAddtime = loanAgenAddtime;
    }

    @Basic
    @Column(name = "loan_lastmodify", nullable = true)
    public Timestamp getLoanLastmodify() {
        return loanLastmodify;
    }

    public void setLoanLastmodify(Timestamp loanLastmodify) {
        this.loanLastmodify = loanLastmodify;
    }

    @Basic
    @Column(name = "loan_order_num", nullable = true)
    public Integer getLoanOrderNum() {
        return loanOrderNum;
    }

    public void setLoanOrderNum(Integer loanOrderNum) {
        this.loanOrderNum = loanOrderNum;
    }

    @Basic
    @Column(name = "loan_phone", nullable = true, length = 50)
    public String getLoanPhone() {
        return loanPhone;
    }

    public void setLoanPhone(String loanPhone) {
        this.loanPhone = loanPhone;
    }

    @Basic
    @Column(name = "loan_reg_address", nullable = true, length = 50)
    public String getLoanRegAddress() {
        return loanRegAddress;
    }

    public void setLoanRegAddress(String loanRegAddress) {
        this.loanRegAddress = loanRegAddress;
    }

    @Basic
    @Column(name = "loan_agen_area", nullable = true, length = 50)
    public String getLoanAgenArea() {
        return loanAgenArea;
    }

    public void setLoanAgenArea(String loanAgenArea) {
        this.loanAgenArea = loanAgenArea;
    }

    @Basic
    @Column(name = "loan_agen_fullname", nullable = true, length = 50)
    public String getLoanAgenFullname() {
        return loanAgenFullname;
    }

    public void setLoanAgenFullname(String loanAgenFullname) {
        this.loanAgenFullname = loanAgenFullname;
    }

    @Basic
    @Column(name = "loan_del_flag", nullable = true)
    public Integer getLoanDelFlag() {
        return loanDelFlag;
    }

    public void setLoanDelFlag(Integer loanDelFlag) {
        this.loanDelFlag = loanDelFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanAgencyInfoEntity that = (LoanAgencyInfoEntity) o;
        return pkLoanAgenId == that.pkLoanAgenId &&
                Objects.equals(loanAgenWebsite, that.loanAgenWebsite) &&
                Objects.equals(loanAgenName, that.loanAgenName) &&
                Objects.equals(loanBusinessAddress, that.loanBusinessAddress) &&
                Objects.equals(loanEnglishName, that.loanEnglishName) &&
                Objects.equals(loanIndustryInvolved, that.loanIndustryInvolved) &&
                Objects.equals(loanAgenAddtime, that.loanAgenAddtime) &&
                Objects.equals(loanLastmodify, that.loanLastmodify) &&
                Objects.equals(loanOrderNum, that.loanOrderNum) &&
                Objects.equals(loanPhone, that.loanPhone) &&
                Objects.equals(loanRegAddress, that.loanRegAddress) &&
                Objects.equals(loanAgenArea, that.loanAgenArea) &&
                Objects.equals(loanAgenFullname, that.loanAgenFullname) &&
                Objects.equals(loanDelFlag, that.loanDelFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkLoanAgenId, loanAgenWebsite, loanAgenName, loanBusinessAddress, loanEnglishName, loanIndustryInvolved, loanAgenAddtime, loanLastmodify, loanOrderNum, loanPhone, loanRegAddress, loanAgenArea, loanAgenFullname, loanDelFlag);
    }
}
