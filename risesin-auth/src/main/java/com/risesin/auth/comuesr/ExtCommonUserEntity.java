package com.risesin.auth.comuesr;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ext_common_user", schema = "risesin", catalog = "")
public class ExtCommonUserEntity {
    private int pkExtId;
    private Integer fkComUserId;
    private Integer fkChaDefId;
    private String extShareLink;
    private Integer extDelflag;
    private String extComUsername;
    private Timestamp extComUserAddtime;
    private String extChaDefName;

    @Id
    @Column(name = "pk_ext_id", nullable = false)
    public int getPkExtId() {
        return pkExtId;
    }

    public void setPkExtId(int pkExtId) {
        this.pkExtId = pkExtId;
    }

    @Basic
    @Column(name = "fk_com_user_id", nullable = true)
    public Integer getFkComUserId() {
        return fkComUserId;
    }

    public void setFkComUserId(Integer fkComUserId) {
        this.fkComUserId = fkComUserId;
    }

    @Basic
    @Column(name = "fk_cha_def_id", nullable = true)
    public Integer getFkChaDefId() {
        return fkChaDefId;
    }

    public void setFkChaDefId(Integer fkChaDefId) {
        this.fkChaDefId = fkChaDefId;
    }

    @Basic
    @Column(name = "ext_share_link", nullable = true, length = 50)
    public String getExtShareLink() {
        return extShareLink;
    }

    public void setExtShareLink(String extShareLink) {
        this.extShareLink = extShareLink;
    }

    @Basic
    @Column(name = "ext_delflag", nullable = true)
    public Integer getExtDelflag() {
        return extDelflag;
    }

    public void setExtDelflag(Integer extDelflag) {
        this.extDelflag = extDelflag;
    }

    @Basic
    @Column(name = "ext_com_username", nullable = true, length = 50)
    public String getExtComUsername() {
        return extComUsername;
    }

    public void setExtComUsername(String extComUsername) {
        this.extComUsername = extComUsername;
    }

    @Basic
    @Column(name = "ext_com_user_addtime", nullable = true)
    public Timestamp getExtComUserAddtime() {
        return extComUserAddtime;
    }

    public void setExtComUserAddtime(Timestamp extComUserAddtime) {
        this.extComUserAddtime = extComUserAddtime;
    }

    @Basic
    @Column(name = "ext_cha_def_name", nullable = true, length = 50)
    public String getExtChaDefName() {
        return extChaDefName;
    }

    public void setExtChaDefName(String extChaDefName) {
        this.extChaDefName = extChaDefName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtCommonUserEntity that = (ExtCommonUserEntity) o;
        return pkExtId == that.pkExtId &&
                Objects.equals(fkComUserId, that.fkComUserId) &&
                Objects.equals(fkChaDefId, that.fkChaDefId) &&
                Objects.equals(extShareLink, that.extShareLink) &&
                Objects.equals(extDelflag, that.extDelflag) &&
                Objects.equals(extComUsername, that.extComUsername) &&
                Objects.equals(extComUserAddtime, that.extComUserAddtime) &&
                Objects.equals(extChaDefName, that.extChaDefName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkExtId, fkComUserId, fkChaDefId, extShareLink, extDelflag, extComUsername, extComUserAddtime, extChaDefName);
    }
}
