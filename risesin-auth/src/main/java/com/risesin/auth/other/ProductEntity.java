package com.risesin.auth.other;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "risesin", catalog = "")
public class ProductEntity {
    private Timestamp finProAddtime;
    private String finProApplicant;
    private String finProCode;
    private Double finProDebtrate;
    private Integer finProDelflag;
    private String finProDescription;
    private String finProGuarantor;
    private Timestamp finProLastmodify;
    private Integer finProLendingcycle;
    private String finProName;
    private BigDecimal finProMinquota;
    private String finProState;
    private Integer fkFinTypeId;
    private Integer fkSysUsrId;
    private int pkFinProId;
    private BigDecimal finProMaxquota;

    @Basic
    @Column(name = "fin_pro_addtime", nullable = true)
    public Timestamp getFinProAddtime() {
        return finProAddtime;
    }

    public void setFinProAddtime(Timestamp finProAddtime) {
        this.finProAddtime = finProAddtime;
    }

    @Basic
    @Column(name = "fin_pro_applicant", nullable = true, length = 64)
    public String getFinProApplicant() {
        return finProApplicant;
    }

    public void setFinProApplicant(String finProApplicant) {
        this.finProApplicant = finProApplicant;
    }

    @Basic
    @Column(name = "fin_pro_code", nullable = true, length = 64)
    public String getFinProCode() {
        return finProCode;
    }

    public void setFinProCode(String finProCode) {
        this.finProCode = finProCode;
    }

    @Basic
    @Column(name = "fin_pro_debtrate", nullable = true, precision = 2)
    public Double getFinProDebtrate() {
        return finProDebtrate;
    }

    public void setFinProDebtrate(Double finProDebtrate) {
        this.finProDebtrate = finProDebtrate;
    }

    @Basic
    @Column(name = "fin_pro_delflag", nullable = true)
    public Integer getFinProDelflag() {
        return finProDelflag;
    }

    public void setFinProDelflag(Integer finProDelflag) {
        this.finProDelflag = finProDelflag;
    }

    @Basic
    @Column(name = "fin_pro_description", nullable = true, length = 400)
    public String getFinProDescription() {
        return finProDescription;
    }

    public void setFinProDescription(String finProDescription) {
        this.finProDescription = finProDescription;
    }

    @Basic
    @Column(name = "fin_pro_guarantor", nullable = true, length = 64)
    public String getFinProGuarantor() {
        return finProGuarantor;
    }

    public void setFinProGuarantor(String finProGuarantor) {
        this.finProGuarantor = finProGuarantor;
    }

    @Basic
    @Column(name = "fin_pro_lastmodify", nullable = true)
    public Timestamp getFinProLastmodify() {
        return finProLastmodify;
    }

    public void setFinProLastmodify(Timestamp finProLastmodify) {
        this.finProLastmodify = finProLastmodify;
    }

    @Basic
    @Column(name = "fin_pro_lendingcycle", nullable = true)
    public Integer getFinProLendingcycle() {
        return finProLendingcycle;
    }

    public void setFinProLendingcycle(Integer finProLendingcycle) {
        this.finProLendingcycle = finProLendingcycle;
    }

    @Basic
    @Column(name = "fin_pro_name", nullable = true, length = 64)
    public String getFinProName() {
        return finProName;
    }

    public void setFinProName(String finProName) {
        this.finProName = finProName;
    }

    @Basic
    @Column(name = "fin_pro_minquota", nullable = true, precision = 2)
    public BigDecimal getFinProMinquota() {
        return finProMinquota;
    }

    public void setFinProMinquota(BigDecimal finProMinquota) {
        this.finProMinquota = finProMinquota;
    }

    @Basic
    @Column(name = "fin_pro_state", nullable = true, length = 64)
    public String getFinProState() {
        return finProState;
    }

    public void setFinProState(String finProState) {
        this.finProState = finProState;
    }

    @Basic
    @Column(name = "fk_fin_type_id", nullable = true)
    public Integer getFkFinTypeId() {
        return fkFinTypeId;
    }

    public void setFkFinTypeId(Integer fkFinTypeId) {
        this.fkFinTypeId = fkFinTypeId;
    }

    @Basic
    @Column(name = "fk_sys_usr_id", nullable = true)
    public Integer getFkSysUsrId() {
        return fkSysUsrId;
    }

    public void setFkSysUsrId(Integer fkSysUsrId) {
        this.fkSysUsrId = fkSysUsrId;
    }

    @Id
    @Column(name = "pk_fin_pro_id", nullable = false)
    public int getPkFinProId() {
        return pkFinProId;
    }

    public void setPkFinProId(int pkFinProId) {
        this.pkFinProId = pkFinProId;
    }

    @Basic
    @Column(name = "fin_pro_maxquota", nullable = true, precision = 2)
    public BigDecimal getFinProMaxquota() {
        return finProMaxquota;
    }

    public void setFinProMaxquota(BigDecimal finProMaxquota) {
        this.finProMaxquota = finProMaxquota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return pkFinProId == that.pkFinProId &&
                Objects.equals(finProAddtime, that.finProAddtime) &&
                Objects.equals(finProApplicant, that.finProApplicant) &&
                Objects.equals(finProCode, that.finProCode) &&
                Objects.equals(finProDebtrate, that.finProDebtrate) &&
                Objects.equals(finProDelflag, that.finProDelflag) &&
                Objects.equals(finProDescription, that.finProDescription) &&
                Objects.equals(finProGuarantor, that.finProGuarantor) &&
                Objects.equals(finProLastmodify, that.finProLastmodify) &&
                Objects.equals(finProLendingcycle, that.finProLendingcycle) &&
                Objects.equals(finProName, that.finProName) &&
                Objects.equals(finProMinquota, that.finProMinquota) &&
                Objects.equals(finProState, that.finProState) &&
                Objects.equals(fkFinTypeId, that.fkFinTypeId) &&
                Objects.equals(fkSysUsrId, that.fkSysUsrId) &&
                Objects.equals(finProMaxquota, that.finProMaxquota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finProAddtime, finProApplicant, finProCode, finProDebtrate, finProDelflag, finProDescription, finProGuarantor, finProLastmodify, finProLendingcycle, finProName, finProMinquota, finProState, fkFinTypeId, fkSysUsrId, pkFinProId, finProMaxquota);
    }
}
