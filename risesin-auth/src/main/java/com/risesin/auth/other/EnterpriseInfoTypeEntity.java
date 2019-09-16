package com.risesin.auth.other;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "enterprise_info_type", schema = "risesin", catalog = "")
public class EnterpriseInfoTypeEntity {
    private Timestamp finEntinfotypeAddtime;
    private String finEntinfotypeCode;
    private Integer finEntinfotypeDelflag;
    private Timestamp finEntinfotypeLastmodify;
    private String finEntinfotypeName;
    private int pkFinEntinfotypeId;

    @Basic
    @Column(name = "fin_entinfotype_addtime", nullable = true)
    public Timestamp getFinEntinfotypeAddtime() {
        return finEntinfotypeAddtime;
    }

    public void setFinEntinfotypeAddtime(Timestamp finEntinfotypeAddtime) {
        this.finEntinfotypeAddtime = finEntinfotypeAddtime;
    }

    @Basic
    @Column(name = "fin_entinfotype_code", nullable = true, length = 64)
    public String getFinEntinfotypeCode() {
        return finEntinfotypeCode;
    }

    public void setFinEntinfotypeCode(String finEntinfotypeCode) {
        this.finEntinfotypeCode = finEntinfotypeCode;
    }

    @Basic
    @Column(name = "fin_entinfotype_delflag", nullable = true)
    public Integer getFinEntinfotypeDelflag() {
        return finEntinfotypeDelflag;
    }

    public void setFinEntinfotypeDelflag(Integer finEntinfotypeDelflag) {
        this.finEntinfotypeDelflag = finEntinfotypeDelflag;
    }

    @Basic
    @Column(name = "fin_entinfotype_lastmodify", nullable = true)
    public Timestamp getFinEntinfotypeLastmodify() {
        return finEntinfotypeLastmodify;
    }

    public void setFinEntinfotypeLastmodify(Timestamp finEntinfotypeLastmodify) {
        this.finEntinfotypeLastmodify = finEntinfotypeLastmodify;
    }

    @Basic
    @Column(name = "fin_entinfotype_name", nullable = true, length = 64)
    public String getFinEntinfotypeName() {
        return finEntinfotypeName;
    }

    public void setFinEntinfotypeName(String finEntinfotypeName) {
        this.finEntinfotypeName = finEntinfotypeName;
    }

    @Id
    @Column(name = "pk_fin_entinfotype_id", nullable = false)
    public int getPkFinEntinfotypeId() {
        return pkFinEntinfotypeId;
    }

    public void setPkFinEntinfotypeId(int pkFinEntinfotypeId) {
        this.pkFinEntinfotypeId = pkFinEntinfotypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnterpriseInfoTypeEntity that = (EnterpriseInfoTypeEntity) o;
        return pkFinEntinfotypeId == that.pkFinEntinfotypeId &&
                Objects.equals(finEntinfotypeAddtime, that.finEntinfotypeAddtime) &&
                Objects.equals(finEntinfotypeCode, that.finEntinfotypeCode) &&
                Objects.equals(finEntinfotypeDelflag, that.finEntinfotypeDelflag) &&
                Objects.equals(finEntinfotypeLastmodify, that.finEntinfotypeLastmodify) &&
                Objects.equals(finEntinfotypeName, that.finEntinfotypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finEntinfotypeAddtime, finEntinfotypeCode, finEntinfotypeDelflag, finEntinfotypeLastmodify, finEntinfotypeName, pkFinEntinfotypeId);
    }
}
