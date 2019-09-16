package com.risesin.auth.other;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product_auth", schema = "risesin", catalog = "")
public class ProductAuthEntity {
    private Timestamp finProAutAddtime;
    private String finProAutCode;
    private Integer finProAutDelflag;
    private Timestamp finProAutLastmodify;
    private Double finProAuthRate;
    private String finProAuthState;
    private Integer fkFinProId;
    private Integer fkSysUsrId;
    private int pkFinProAutId;

    @Basic
    @Column(name = "fin_pro_aut_addtime", nullable = true)
    public Timestamp getFinProAutAddtime() {
        return finProAutAddtime;
    }

    public void setFinProAutAddtime(Timestamp finProAutAddtime) {
        this.finProAutAddtime = finProAutAddtime;
    }

    @Basic
    @Column(name = "fin_pro_aut_code", nullable = true, length = 64)
    public String getFinProAutCode() {
        return finProAutCode;
    }

    public void setFinProAutCode(String finProAutCode) {
        this.finProAutCode = finProAutCode;
    }

    @Basic
    @Column(name = "fin_pro_aut_delflag", nullable = true)
    public Integer getFinProAutDelflag() {
        return finProAutDelflag;
    }

    public void setFinProAutDelflag(Integer finProAutDelflag) {
        this.finProAutDelflag = finProAutDelflag;
    }

    @Basic
    @Column(name = "fin_pro_aut_lastmodify", nullable = true)
    public Timestamp getFinProAutLastmodify() {
        return finProAutLastmodify;
    }

    public void setFinProAutLastmodify(Timestamp finProAutLastmodify) {
        this.finProAutLastmodify = finProAutLastmodify;
    }

    @Basic
    @Column(name = "fin_pro_auth_rate", nullable = true, precision = 2)
    public Double getFinProAuthRate() {
        return finProAuthRate;
    }

    public void setFinProAuthRate(Double finProAuthRate) {
        this.finProAuthRate = finProAuthRate;
    }

    @Basic
    @Column(name = "fin_pro_auth_state", nullable = true, length = 64)
    public String getFinProAuthState() {
        return finProAuthState;
    }

    public void setFinProAuthState(String finProAuthState) {
        this.finProAuthState = finProAuthState;
    }

    @Basic
    @Column(name = "fk_fin_pro_id", nullable = true)
    public Integer getFkFinProId() {
        return fkFinProId;
    }

    public void setFkFinProId(Integer fkFinProId) {
        this.fkFinProId = fkFinProId;
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
    @Column(name = "pk_fin_pro_aut_id", nullable = false)
    public int getPkFinProAutId() {
        return pkFinProAutId;
    }

    public void setPkFinProAutId(int pkFinProAutId) {
        this.pkFinProAutId = pkFinProAutId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductAuthEntity that = (ProductAuthEntity) o;
        return pkFinProAutId == that.pkFinProAutId &&
                Objects.equals(finProAutAddtime, that.finProAutAddtime) &&
                Objects.equals(finProAutCode, that.finProAutCode) &&
                Objects.equals(finProAutDelflag, that.finProAutDelflag) &&
                Objects.equals(finProAutLastmodify, that.finProAutLastmodify) &&
                Objects.equals(finProAuthRate, that.finProAuthRate) &&
                Objects.equals(finProAuthState, that.finProAuthState) &&
                Objects.equals(fkFinProId, that.fkFinProId) &&
                Objects.equals(fkSysUsrId, that.fkSysUsrId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finProAutAddtime, finProAutCode, finProAutDelflag, finProAutLastmodify, finProAuthRate, finProAuthState, fkFinProId, fkSysUsrId, pkFinProAutId);
    }
}
