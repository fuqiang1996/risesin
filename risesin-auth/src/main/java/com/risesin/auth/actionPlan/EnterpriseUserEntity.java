package com.risesin.auth.actionPlan;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "enterprise_user", schema = "risesin", catalog = "")
public class EnterpriseUserEntity {
    private int pkEntUserId;
    private String entPhone;
    private String entUsername;
    private String entPassword;
    private String entOpenId;
    private Integer entDelflag;
    private Timestamp entAddtime;
    private Timestamp entLastmodify;
    private String entCreateUser;
    private String entUpdateUser;
    private String entAccount;
    private String entCompanyname;

    @Id
    @Column(name = "pk_ent_user_id", nullable = false)
    public int getPkEntUserId() {
        return pkEntUserId;
    }

    public void setPkEntUserId(int pkEntUserId) {
        this.pkEntUserId = pkEntUserId;
    }

    @Basic
    @Column(name = "ent_phone", nullable = true, length = 50)
    public String getEntPhone() {
        return entPhone;
    }

    public void setEntPhone(String entPhone) {
        this.entPhone = entPhone;
    }

    @Basic
    @Column(name = "ent_username", nullable = true, length = 50)
    public String getEntUsername() {
        return entUsername;
    }

    public void setEntUsername(String entUsername) {
        this.entUsername = entUsername;
    }

    @Basic
    @Column(name = "ent_password", nullable = true, length = 50)
    public String getEntPassword() {
        return entPassword;
    }

    public void setEntPassword(String entPassword) {
        this.entPassword = entPassword;
    }

    @Basic
    @Column(name = "ent_open_id", nullable = true, length = 50)
    public String getEntOpenId() {
        return entOpenId;
    }

    public void setEntOpenId(String entOpenId) {
        this.entOpenId = entOpenId;
    }

    @Basic
    @Column(name = "ent_delflag", nullable = true)
    public Integer getEntDelflag() {
        return entDelflag;
    }

    public void setEntDelflag(Integer entDelflag) {
        this.entDelflag = entDelflag;
    }

    @Basic
    @Column(name = "ent_addtime", nullable = true)
    public Timestamp getEntAddtime() {
        return entAddtime;
    }

    public void setEntAddtime(Timestamp entAddtime) {
        this.entAddtime = entAddtime;
    }

    @Basic
    @Column(name = "ent_lastmodify", nullable = true)
    public Timestamp getEntLastmodify() {
        return entLastmodify;
    }

    public void setEntLastmodify(Timestamp entLastmodify) {
        this.entLastmodify = entLastmodify;
    }

    @Basic
    @Column(name = "ent_create_user", nullable = true, length = 50)
    public String getEntCreateUser() {
        return entCreateUser;
    }

    public void setEntCreateUser(String entCreateUser) {
        this.entCreateUser = entCreateUser;
    }

    @Basic
    @Column(name = "ent_update_user", nullable = true, length = 50)
    public String getEntUpdateUser() {
        return entUpdateUser;
    }

    public void setEntUpdateUser(String entUpdateUser) {
        this.entUpdateUser = entUpdateUser;
    }

    @Basic
    @Column(name = "ent_account", nullable = true, length = 50)
    public String getEntAccount() {
        return entAccount;
    }

    public void setEntAccount(String entAccount) {
        this.entAccount = entAccount;
    }

    @Basic
    @Column(name = "ent_companyname", nullable = true, length = 50)
    public String getEntCompanyname() {
        return entCompanyname;
    }

    public void setEntCompanyname(String entCompanyname) {
        this.entCompanyname = entCompanyname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnterpriseUserEntity that = (EnterpriseUserEntity) o;
        return pkEntUserId == that.pkEntUserId &&
                Objects.equals(entPhone, that.entPhone) &&
                Objects.equals(entUsername, that.entUsername) &&
                Objects.equals(entPassword, that.entPassword) &&
                Objects.equals(entOpenId, that.entOpenId) &&
                Objects.equals(entDelflag, that.entDelflag) &&
                Objects.equals(entAddtime, that.entAddtime) &&
                Objects.equals(entLastmodify, that.entLastmodify) &&
                Objects.equals(entCreateUser, that.entCreateUser) &&
                Objects.equals(entUpdateUser, that.entUpdateUser) &&
                Objects.equals(entAccount, that.entAccount) &&
                Objects.equals(entCompanyname, that.entCompanyname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkEntUserId, entPhone, entUsername, entPassword, entOpenId, entDelflag, entAddtime, entLastmodify, entCreateUser, entUpdateUser, entAccount, entCompanyname);
    }
}
