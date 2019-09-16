package com.risesin.auth.other;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "financing_type", schema = "risesin", catalog = "")
public class FinancingTypeEntity {
    private String pkFinTypeId;
    private String finTypeName;
    private String finTypeParent;
    private Integer finTypeSeq;
    private Integer finTypeDelflag;
    private String finTypeUrl;
    private Date finTypeAddtime;
    private Date finTypeLastmodify;

    @Id
    @Column(name = "pk_fin_type_id", nullable = false, length = 64)
    public String getPkFinTypeId() {
        return pkFinTypeId;
    }

    public void setPkFinTypeId(String pkFinTypeId) {
        this.pkFinTypeId = pkFinTypeId;
    }

    @Basic
    @Column(name = "fin_type_name", nullable = true, length = 64)
    public String getFinTypeName() {
        return finTypeName;
    }

    public void setFinTypeName(String finTypeName) {
        this.finTypeName = finTypeName;
    }

    @Basic
    @Column(name = "fin_type_parent", nullable = true, length = 64)
    public String getFinTypeParent() {
        return finTypeParent;
    }

    public void setFinTypeParent(String finTypeParent) {
        this.finTypeParent = finTypeParent;
    }

    @Basic
    @Column(name = "fin_type_seq", nullable = true)
    public Integer getFinTypeSeq() {
        return finTypeSeq;
    }

    public void setFinTypeSeq(Integer finTypeSeq) {
        this.finTypeSeq = finTypeSeq;
    }

    @Basic
    @Column(name = "fin_type_delflag", nullable = true)
    public Integer getFinTypeDelflag() {
        return finTypeDelflag;
    }

    public void setFinTypeDelflag(Integer finTypeDelflag) {
        this.finTypeDelflag = finTypeDelflag;
    }

    @Basic
    @Column(name = "fin_type_url", nullable = true, length = 64)
    public String getFinTypeUrl() {
        return finTypeUrl;
    }

    public void setFinTypeUrl(String finTypeUrl) {
        this.finTypeUrl = finTypeUrl;
    }

    @Basic
    @Column(name = "fin_type_addtime", nullable = true)
    public Date getFinTypeAddtime() {
        return finTypeAddtime;
    }

    public void setFinTypeAddtime(Date finTypeAddtime) {
        this.finTypeAddtime = finTypeAddtime;
    }

    @Basic
    @Column(name = "fin_type_lastmodify", nullable = true)
    public Date getFinTypeLastmodify() {
        return finTypeLastmodify;
    }

    public void setFinTypeLastmodify(Date finTypeLastmodify) {
        this.finTypeLastmodify = finTypeLastmodify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinancingTypeEntity that = (FinancingTypeEntity) o;
        return Objects.equals(pkFinTypeId, that.pkFinTypeId) &&
                Objects.equals(finTypeName, that.finTypeName) &&
                Objects.equals(finTypeParent, that.finTypeParent) &&
                Objects.equals(finTypeSeq, that.finTypeSeq) &&
                Objects.equals(finTypeDelflag, that.finTypeDelflag) &&
                Objects.equals(finTypeUrl, that.finTypeUrl) &&
                Objects.equals(finTypeAddtime, that.finTypeAddtime) &&
                Objects.equals(finTypeLastmodify, that.finTypeLastmodify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkFinTypeId, finTypeName, finTypeParent, finTypeSeq, finTypeDelflag, finTypeUrl, finTypeAddtime, finTypeLastmodify);
    }
}
