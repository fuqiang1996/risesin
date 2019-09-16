package com.risesin.auth.other;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "dynamic", schema = "risesin", catalog = "")
public class DynamicEntity {
    private Timestamp dynAddtime;
    private String dynContent;
    private Integer fkComUserid;
    private int pkDynId;

    @Basic
    @Column(name = "dyn_addtime", nullable = true)
    public Timestamp getDynAddtime() {
        return dynAddtime;
    }

    public void setDynAddtime(Timestamp dynAddtime) {
        this.dynAddtime = dynAddtime;
    }

    @Basic
    @Column(name = "dyn_content", nullable = true, length = 255)
    public String getDynContent() {
        return dynContent;
    }

    public void setDynContent(String dynContent) {
        this.dynContent = dynContent;
    }

    @Basic
    @Column(name = "fk_com_userid", nullable = true)
    public Integer getFkComUserid() {
        return fkComUserid;
    }

    public void setFkComUserid(Integer fkComUserid) {
        this.fkComUserid = fkComUserid;
    }

    @Id
    @Column(name = "pk_dyn_id", nullable = false)
    public int getPkDynId() {
        return pkDynId;
    }

    public void setPkDynId(int pkDynId) {
        this.pkDynId = pkDynId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicEntity that = (DynamicEntity) o;
        return pkDynId == that.pkDynId &&
                Objects.equals(dynAddtime, that.dynAddtime) &&
                Objects.equals(dynContent, that.dynContent) &&
                Objects.equals(fkComUserid, that.fkComUserid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dynAddtime, dynContent, fkComUserid, pkDynId);
    }
}
