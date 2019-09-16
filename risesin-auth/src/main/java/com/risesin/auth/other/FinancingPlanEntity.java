package com.risesin.auth.other;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "financing_plan", schema = "risesin", catalog = "")
public class FinancingPlanEntity {
    private Timestamp finPlaAddtime;
    private String finPlaApplicant;
    private String finPlaApplicantemail;
    private String finPlaApplicanttel;
    private String finPlaCode;
    private Integer finPlaDelflag;
    private BigDecimal finPlaDemandquota;
    private Timestamp finPlaExpecttime;
    private String finPlaGuaranteemode;
    private Timestamp finPlaLastmodify;
    private Double finPlaMaxrate;
    private Double finPlaMinrete;
    private String finPlaPayment;
    private String finPlaUseness;
    private Integer fkComUsrid;
    private int pkFinPlaId;
    private String finPlaStatus;
    private String finPlaStage;

    @Basic
    @Column(name = "fin_pla_addtime", nullable = true)
    public Timestamp getFinPlaAddtime() {
        return finPlaAddtime;
    }

    public void setFinPlaAddtime(Timestamp finPlaAddtime) {
        this.finPlaAddtime = finPlaAddtime;
    }

    @Basic
    @Column(name = "fin_pla_applicant", nullable = true, length = 64)
    public String getFinPlaApplicant() {
        return finPlaApplicant;
    }

    public void setFinPlaApplicant(String finPlaApplicant) {
        this.finPlaApplicant = finPlaApplicant;
    }

    @Basic
    @Column(name = "fin_pla_applicantemail", nullable = true, length = 64)
    public String getFinPlaApplicantemail() {
        return finPlaApplicantemail;
    }

    public void setFinPlaApplicantemail(String finPlaApplicantemail) {
        this.finPlaApplicantemail = finPlaApplicantemail;
    }

    @Basic
    @Column(name = "fin_pla_applicanttel", nullable = true, length = 64)
    public String getFinPlaApplicanttel() {
        return finPlaApplicanttel;
    }

    public void setFinPlaApplicanttel(String finPlaApplicanttel) {
        this.finPlaApplicanttel = finPlaApplicanttel;
    }

    @Basic
    @Column(name = "fin_pla_code", nullable = true, length = 64)
    public String getFinPlaCode() {
        return finPlaCode;
    }

    public void setFinPlaCode(String finPlaCode) {
        this.finPlaCode = finPlaCode;
    }

    @Basic
    @Column(name = "fin_pla_delflag", nullable = true)
    public Integer getFinPlaDelflag() {
        return finPlaDelflag;
    }

    public void setFinPlaDelflag(Integer finPlaDelflag) {
        this.finPlaDelflag = finPlaDelflag;
    }

    @Basic
    @Column(name = "fin_pla_demandquota", nullable = true, precision = 2)
    public BigDecimal getFinPlaDemandquota() {
        return finPlaDemandquota;
    }

    public void setFinPlaDemandquota(BigDecimal finPlaDemandquota) {
        this.finPlaDemandquota = finPlaDemandquota;
    }

    @Basic
    @Column(name = "fin_pla_expecttime", nullable = true)
    public Timestamp getFinPlaExpecttime() {
        return finPlaExpecttime;
    }

    public void setFinPlaExpecttime(Timestamp finPlaExpecttime) {
        this.finPlaExpecttime = finPlaExpecttime;
    }

    @Basic
    @Column(name = "fin_pla_guaranteemode", nullable = true, length = 64)
    public String getFinPlaGuaranteemode() {
        return finPlaGuaranteemode;
    }

    public void setFinPlaGuaranteemode(String finPlaGuaranteemode) {
        this.finPlaGuaranteemode = finPlaGuaranteemode;
    }

    @Basic
    @Column(name = "fin_pla_lastmodify", nullable = true)
    public Timestamp getFinPlaLastmodify() {
        return finPlaLastmodify;
    }

    public void setFinPlaLastmodify(Timestamp finPlaLastmodify) {
        this.finPlaLastmodify = finPlaLastmodify;
    }

    @Basic
    @Column(name = "fin_pla_maxrate", nullable = true, precision = 2)
    public Double getFinPlaMaxrate() {
        return finPlaMaxrate;
    }

    public void setFinPlaMaxrate(Double finPlaMaxrate) {
        this.finPlaMaxrate = finPlaMaxrate;
    }

    @Basic
    @Column(name = "fin_pla_minrete", nullable = true, precision = 2)
    public Double getFinPlaMinrete() {
        return finPlaMinrete;
    }

    public void setFinPlaMinrete(Double finPlaMinrete) {
        this.finPlaMinrete = finPlaMinrete;
    }

    @Basic
    @Column(name = "fin_pla_payment", nullable = true, length = 64)
    public String getFinPlaPayment() {
        return finPlaPayment;
    }

    public void setFinPlaPayment(String finPlaPayment) {
        this.finPlaPayment = finPlaPayment;
    }

    @Basic
    @Column(name = "fin_pla_useness", nullable = true, length = 64)
    public String getFinPlaUseness() {
        return finPlaUseness;
    }

    public void setFinPlaUseness(String finPlaUseness) {
        this.finPlaUseness = finPlaUseness;
    }

    @Basic
    @Column(name = "fk_com_usrid", nullable = true)
    public Integer getFkComUsrid() {
        return fkComUsrid;
    }

    public void setFkComUsrid(Integer fkComUsrid) {
        this.fkComUsrid = fkComUsrid;
    }

    @Id
    @Column(name = "pk_fin_pla_id", nullable = false)
    public int getPkFinPlaId() {
        return pkFinPlaId;
    }

    public void setPkFinPlaId(int pkFinPlaId) {
        this.pkFinPlaId = pkFinPlaId;
    }

    @Basic
    @Column(name = "fin_pla_status", nullable = true, length = 64)
    public String getFinPlaStatus() {
        return finPlaStatus;
    }

    public void setFinPlaStatus(String finPlaStatus) {
        this.finPlaStatus = finPlaStatus;
    }

    @Basic
    @Column(name = "fin_pla_stage", nullable = true, length = 64)
    public String getFinPlaStage() {
        return finPlaStage;
    }

    public void setFinPlaStage(String finPlaStage) {
        this.finPlaStage = finPlaStage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinancingPlanEntity that = (FinancingPlanEntity) o;
        return pkFinPlaId == that.pkFinPlaId &&
                Objects.equals(finPlaAddtime, that.finPlaAddtime) &&
                Objects.equals(finPlaApplicant, that.finPlaApplicant) &&
                Objects.equals(finPlaApplicantemail, that.finPlaApplicantemail) &&
                Objects.equals(finPlaApplicanttel, that.finPlaApplicanttel) &&
                Objects.equals(finPlaCode, that.finPlaCode) &&
                Objects.equals(finPlaDelflag, that.finPlaDelflag) &&
                Objects.equals(finPlaDemandquota, that.finPlaDemandquota) &&
                Objects.equals(finPlaExpecttime, that.finPlaExpecttime) &&
                Objects.equals(finPlaGuaranteemode, that.finPlaGuaranteemode) &&
                Objects.equals(finPlaLastmodify, that.finPlaLastmodify) &&
                Objects.equals(finPlaMaxrate, that.finPlaMaxrate) &&
                Objects.equals(finPlaMinrete, that.finPlaMinrete) &&
                Objects.equals(finPlaPayment, that.finPlaPayment) &&
                Objects.equals(finPlaUseness, that.finPlaUseness) &&
                Objects.equals(fkComUsrid, that.fkComUsrid) &&
                Objects.equals(finPlaStatus, that.finPlaStatus) &&
                Objects.equals(finPlaStage, that.finPlaStage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finPlaAddtime, finPlaApplicant, finPlaApplicantemail, finPlaApplicanttel, finPlaCode, finPlaDelflag, finPlaDemandquota, finPlaExpecttime, finPlaGuaranteemode, finPlaLastmodify, finPlaMaxrate, finPlaMinrete, finPlaPayment, finPlaUseness, fkComUsrid, pkFinPlaId, finPlaStatus, finPlaStage);
    }
}
