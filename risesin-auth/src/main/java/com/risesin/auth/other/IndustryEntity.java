package com.risesin.auth.other;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "industry", schema = "risesin", catalog = "")
public class IndustryEntity {
    private String pkIndCode;
    private String indName;
    private String indDelflag;
    private String indParent;
    private Date indAddtime;
    private Date indLastmodify;

    @Id
    @Column(name = "pk_ind_code", nullable = false, length = 32)
    public String getPkIndCode() {
        return pkIndCode;
    }

    public void setPkIndCode(String pkIndCode) {
        this.pkIndCode = pkIndCode;
    }

    @Basic
    @Column(name = "ind_name", nullable = true, length = 32)
    public String getIndName() {
        return indName;
    }

    public void setIndName(String indName) {
        this.indName = indName;
    }

    @Basic
    @Column(name = "ind_delflag", nullable = true, length = 32)
    public String getIndDelflag() {
        return indDelflag;
    }

    public void setIndDelflag(String indDelflag) {
        this.indDelflag = indDelflag;
    }

    @Basic
    @Column(name = "ind_parent", nullable = true, length = 32)
    public String getIndParent() {
        return indParent;
    }

    public void setIndParent(String indParent) {
        this.indParent = indParent;
    }

    @Basic
    @Column(name = "ind_addtime", nullable = true)
    public Date getIndAddtime() {
        return indAddtime;
    }

    public void setIndAddtime(Date indAddtime) {
        this.indAddtime = indAddtime;
    }

    @Basic
    @Column(name = "ind_lastmodify", nullable = true)
    public Date getIndLastmodify() {
        return indLastmodify;
    }

    public void setIndLastmodify(Date indLastmodify) {
        this.indLastmodify = indLastmodify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndustryEntity that = (IndustryEntity) o;
        return Objects.equals(pkIndCode, that.pkIndCode) &&
                Objects.equals(indName, that.indName) &&
                Objects.equals(indDelflag, that.indDelflag) &&
                Objects.equals(indParent, that.indParent) &&
                Objects.equals(indAddtime, that.indAddtime) &&
                Objects.equals(indLastmodify, that.indLastmodify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkIndCode, indName, indDelflag, indParent, indAddtime, indLastmodify);
    }
}
