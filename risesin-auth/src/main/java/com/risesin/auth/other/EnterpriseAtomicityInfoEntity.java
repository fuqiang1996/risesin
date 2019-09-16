package com.risesin.auth.other;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "enterprise_atomicity_info", schema = "risesin", catalog = "")
public class EnterpriseAtomicityInfoEntity {
    private Timestamp finEntinfoAddtime;
    private String finEntinfoCode;
    private Integer finEntinfoDelflag;
    private String finEntinfoDescription;
    private Timestamp finEntinfoLastmodify;
    private String finEntinfoName;
    private Integer fkFinEntinfotypeId;
    private int pkFinEntinfoId;

    @Basic
    @Column(name = "fin_entinfo_addtime", nullable = true)
    public Timestamp getFinEntinfoAddtime() {
        return finEntinfoAddtime;
    }

    public void setFinEntinfoAddtime(Timestamp finEntinfoAddtime) {
        this.finEntinfoAddtime = finEntinfoAddtime;
    }

    @Basic
    @Column(name = "fin_entinfo_code", nullable = true, length = 64)
    public String getFinEntinfoCode() {
        return finEntinfoCode;
    }

    public void setFinEntinfoCode(String finEntinfoCode) {
        this.finEntinfoCode = finEntinfoCode;
    }

    @Basic
    @Column(name = "fin_entinfo_delflag", nullable = true)
    public Integer getFinEntinfoDelflag() {
        return finEntinfoDelflag;
    }

    public void setFinEntinfoDelflag(Integer finEntinfoDelflag) {
        this.finEntinfoDelflag = finEntinfoDelflag;
    }

    @Basic
    @Column(name = "fin_entinfo_description", nullable = true, length = 255)
    public String getFinEntinfoDescription() {
        return finEntinfoDescription;
    }

    public void setFinEntinfoDescription(String finEntinfoDescription) {
        this.finEntinfoDescription = finEntinfoDescription;
    }

    @Basic
    @Column(name = "fin_entinfo_lastmodify", nullable = true)
    public Timestamp getFinEntinfoLastmodify() {
        return finEntinfoLastmodify;
    }

    public void setFinEntinfoLastmodify(Timestamp finEntinfoLastmodify) {
        this.finEntinfoLastmodify = finEntinfoLastmodify;
    }

    @Basic
    @Column(name = "fin_entinfo_name", nullable = true, length = 64)
    public String getFinEntinfoName() {
        return finEntinfoName;
    }

    public void setFinEntinfoName(String finEntinfoName) {
        this.finEntinfoName = finEntinfoName;
    }

    @Basic
    @Column(name = "fk_fin_entinfotype_id", nullable = true)
    public Integer getFkFinEntinfotypeId() {
        return fkFinEntinfotypeId;
    }

    public void setFkFinEntinfotypeId(Integer fkFinEntinfotypeId) {
        this.fkFinEntinfotypeId = fkFinEntinfotypeId;
    }

    @Id
    @Column(name = "pk_fin_entinfo_id", nullable = false)
    public int getPkFinEntinfoId() {
        return pkFinEntinfoId;
    }

    public void setPkFinEntinfoId(int pkFinEntinfoId) {
        this.pkFinEntinfoId = pkFinEntinfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnterpriseAtomicityInfoEntity that = (EnterpriseAtomicityInfoEntity) o;
        return pkFinEntinfoId == that.pkFinEntinfoId &&
                Objects.equals(finEntinfoAddtime, that.finEntinfoAddtime) &&
                Objects.equals(finEntinfoCode, that.finEntinfoCode) &&
                Objects.equals(finEntinfoDelflag, that.finEntinfoDelflag) &&
                Objects.equals(finEntinfoDescription, that.finEntinfoDescription) &&
                Objects.equals(finEntinfoLastmodify, that.finEntinfoLastmodify) &&
                Objects.equals(finEntinfoName, that.finEntinfoName) &&
                Objects.equals(fkFinEntinfotypeId, that.fkFinEntinfotypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finEntinfoAddtime, finEntinfoCode, finEntinfoDelflag, finEntinfoDescription, finEntinfoLastmodify, finEntinfoName, fkFinEntinfotypeId, pkFinEntinfoId);
    }
}
