package com.risesin.auth.sysuser;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_tas_log", schema = "risesin", catalog = "")
public class SysTasLogEntity {
    private Integer fkFinTasId;
    private int pkTasLogId;
    private Timestamp tasLogAddtime;
    private String tasLogCode;
    private Timestamp tasLogLastmodify;
    private String tasLogOperation;

    @Basic
    @Column(name = "fk_fin_tas_id", nullable = true)
    public Integer getFkFinTasId() {
        return fkFinTasId;
    }

    public void setFkFinTasId(Integer fkFinTasId) {
        this.fkFinTasId = fkFinTasId;
    }

    @Id
    @Column(name = "pk_tas_log_id", nullable = false)
    public int getPkTasLogId() {
        return pkTasLogId;
    }

    public void setPkTasLogId(int pkTasLogId) {
        this.pkTasLogId = pkTasLogId;
    }

    @Basic
    @Column(name = "tas_log_addtime", nullable = true)
    public Timestamp getTasLogAddtime() {
        return tasLogAddtime;
    }

    public void setTasLogAddtime(Timestamp tasLogAddtime) {
        this.tasLogAddtime = tasLogAddtime;
    }

    @Basic
    @Column(name = "tas_log_code", nullable = true, length = 64)
    public String getTasLogCode() {
        return tasLogCode;
    }

    public void setTasLogCode(String tasLogCode) {
        this.tasLogCode = tasLogCode;
    }

    @Basic
    @Column(name = "tas_log_lastmodify", nullable = true)
    public Timestamp getTasLogLastmodify() {
        return tasLogLastmodify;
    }

    public void setTasLogLastmodify(Timestamp tasLogLastmodify) {
        this.tasLogLastmodify = tasLogLastmodify;
    }

    @Basic
    @Column(name = "tas_log_operation", nullable = true, length = 64)
    public String getTasLogOperation() {
        return tasLogOperation;
    }

    public void setTasLogOperation(String tasLogOperation) {
        this.tasLogOperation = tasLogOperation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysTasLogEntity that = (SysTasLogEntity) o;
        return pkTasLogId == that.pkTasLogId &&
                Objects.equals(fkFinTasId, that.fkFinTasId) &&
                Objects.equals(tasLogAddtime, that.tasLogAddtime) &&
                Objects.equals(tasLogCode, that.tasLogCode) &&
                Objects.equals(tasLogLastmodify, that.tasLogLastmodify) &&
                Objects.equals(tasLogOperation, that.tasLogOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fkFinTasId, pkTasLogId, tasLogAddtime, tasLogCode, tasLogLastmodify, tasLogOperation);
    }
}
