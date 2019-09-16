package com.risesin.auth.actionPlan;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "template", schema = "risesin", catalog = "")
public class TemplateEntity {
    private int pkTemId;
    private Integer fkLoanAgenId;
    private String temBackcoverUrl;
    private String temEnd;
    private String temStart;
    private String temMainAnalysis;
    private Timestamp temAddtime;
    private String temProduct;
    private Integer temDelFlag;
    private Timestamp temLastmodify;

    @Id
    @Column(name = "pk_tem_id", nullable = false)
    public int getPkTemId() {
        return pkTemId;
    }

    public void setPkTemId(int pkTemId) {
        this.pkTemId = pkTemId;
    }

    @Basic
    @Column(name = "fk_loan_agen_id", nullable = true)
    public Integer getFkLoanAgenId() {
        return fkLoanAgenId;
    }

    public void setFkLoanAgenId(Integer fkLoanAgenId) {
        this.fkLoanAgenId = fkLoanAgenId;
    }

    @Basic
    @Column(name = "tem_backcover_url", nullable = true, length = 50)
    public String getTemBackcoverUrl() {
        return temBackcoverUrl;
    }

    public void setTemBackcoverUrl(String temBackcoverUrl) {
        this.temBackcoverUrl = temBackcoverUrl;
    }

    @Basic
    @Column(name = "tem_end", nullable = true, length = 50)
    public String getTemEnd() {
        return temEnd;
    }

    public void setTemEnd(String temEnd) {
        this.temEnd = temEnd;
    }

    @Basic
    @Column(name = "tem_start", nullable = true, length = 50)
    public String getTemStart() {
        return temStart;
    }

    public void setTemStart(String temStart) {
        this.temStart = temStart;
    }

    @Basic
    @Column(name = "tem_main_analysis", nullable = true, length = 50)
    public String getTemMainAnalysis() {
        return temMainAnalysis;
    }

    public void setTemMainAnalysis(String temMainAnalysis) {
        this.temMainAnalysis = temMainAnalysis;
    }

    @Basic
    @Column(name = "tem_addtime", nullable = true)
    public Timestamp getTemAddtime() {
        return temAddtime;
    }

    public void setTemAddtime(Timestamp temAddtime) {
        this.temAddtime = temAddtime;
    }

    @Basic
    @Column(name = "tem_product", nullable = true, length = 50)
    public String getTemProduct() {
        return temProduct;
    }

    public void setTemProduct(String temProduct) {
        this.temProduct = temProduct;
    }

    @Basic
    @Column(name = "tem_del_flag", nullable = true)
    public Integer getTemDelFlag() {
        return temDelFlag;
    }

    public void setTemDelFlag(Integer temDelFlag) {
        this.temDelFlag = temDelFlag;
    }

    @Basic
    @Column(name = "tem_lastmodify", nullable = true)
    public Timestamp getTemLastmodify() {
        return temLastmodify;
    }

    public void setTemLastmodify(Timestamp temLastmodify) {
        this.temLastmodify = temLastmodify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemplateEntity that = (TemplateEntity) o;
        return pkTemId == that.pkTemId &&
                Objects.equals(fkLoanAgenId, that.fkLoanAgenId) &&
                Objects.equals(temBackcoverUrl, that.temBackcoverUrl) &&
                Objects.equals(temEnd, that.temEnd) &&
                Objects.equals(temStart, that.temStart) &&
                Objects.equals(temMainAnalysis, that.temMainAnalysis) &&
                Objects.equals(temAddtime, that.temAddtime) &&
                Objects.equals(temProduct, that.temProduct) &&
                Objects.equals(temDelFlag, that.temDelFlag) &&
                Objects.equals(temLastmodify, that.temLastmodify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkTemId, fkLoanAgenId, temBackcoverUrl, temEnd, temStart, temMainAnalysis, temAddtime, temProduct, temDelFlag, temLastmodify);
    }
}
