package com.risesin.auth.comuesr;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "com_log", schema = "risesin", catalog = "")
public class ComLogEntity {
    private int pkLogId;
    private Integer fkLogUserId;
    private String logUsername;
    private String logOperation;
    private Integer logTime;
    private String logMethod;
    private String logParams;
    private String logIp;
    private Timestamp logAddtime;

    @Id
    @Column(name = "pk_log_id", nullable = false)
    public int getPkLogId() {
        return pkLogId;
    }

    public void setPkLogId(int pkLogId) {
        this.pkLogId = pkLogId;
    }

    @Basic
    @Column(name = "fk_log_user_id", nullable = true)
    public Integer getFkLogUserId() {
        return fkLogUserId;
    }

    public void setFkLogUserId(Integer fkLogUserId) {
        this.fkLogUserId = fkLogUserId;
    }

    @Basic
    @Column(name = "log_username", nullable = true, length = 50)
    public String getLogUsername() {
        return logUsername;
    }

    public void setLogUsername(String logUsername) {
        this.logUsername = logUsername;
    }

    @Basic
    @Column(name = "log_operation", nullable = true, length = 50)
    public String getLogOperation() {
        return logOperation;
    }

    public void setLogOperation(String logOperation) {
        this.logOperation = logOperation;
    }

    @Basic
    @Column(name = "log_time", nullable = true)
    public Integer getLogTime() {
        return logTime;
    }

    public void setLogTime(Integer logTime) {
        this.logTime = logTime;
    }

    @Basic
    @Column(name = "log_method", nullable = true, length = 200)
    public String getLogMethod() {
        return logMethod;
    }

    public void setLogMethod(String logMethod) {
        this.logMethod = logMethod;
    }

    @Basic
    @Column(name = "log_params", nullable = true, length = 5000)
    public String getLogParams() {
        return logParams;
    }

    public void setLogParams(String logParams) {
        this.logParams = logParams;
    }

    @Basic
    @Column(name = "log_ip", nullable = true, length = 64)
    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }

    @Basic
    @Column(name = "log_addtime", nullable = true)
    public Timestamp getLogAddtime() {
        return logAddtime;
    }

    public void setLogAddtime(Timestamp logAddtime) {
        this.logAddtime = logAddtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComLogEntity that = (ComLogEntity) o;
        return pkLogId == that.pkLogId &&
                Objects.equals(fkLogUserId, that.fkLogUserId) &&
                Objects.equals(logUsername, that.logUsername) &&
                Objects.equals(logOperation, that.logOperation) &&
                Objects.equals(logTime, that.logTime) &&
                Objects.equals(logMethod, that.logMethod) &&
                Objects.equals(logParams, that.logParams) &&
                Objects.equals(logIp, that.logIp) &&
                Objects.equals(logAddtime, that.logAddtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkLogId, fkLogUserId, logUsername, logOperation, logTime, logMethod, logParams, logIp, logAddtime);
    }
}
