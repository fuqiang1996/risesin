package com.risesin.auth.comuesr;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "channel_definition", schema = "risesin", catalog = "")
public class ChannelDefinitionEntity {
    private int pkChaDefId;
    private String chaDefName;
    private String chaDefCode;
    private Timestamp chaDefAddtime;

    @Id
    @Column(name = "pk_cha_def_id", nullable = false)
    public int getPkChaDefId() {
        return pkChaDefId;
    }

    public void setPkChaDefId(int pkChaDefId) {
        this.pkChaDefId = pkChaDefId;
    }

    @Basic
    @Column(name = "cha_def_name", nullable = true, length = 50)
    public String getChaDefName() {
        return chaDefName;
    }

    public void setChaDefName(String chaDefName) {
        this.chaDefName = chaDefName;
    }

    @Basic
    @Column(name = "cha_def_code", nullable = true, length = 50)
    public String getChaDefCode() {
        return chaDefCode;
    }

    public void setChaDefCode(String chaDefCode) {
        this.chaDefCode = chaDefCode;
    }

    @Basic
    @Column(name = "cha_def_addtime", nullable = true)
    public Timestamp getChaDefAddtime() {
        return chaDefAddtime;
    }

    public void setChaDefAddtime(Timestamp chaDefAddtime) {
        this.chaDefAddtime = chaDefAddtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChannelDefinitionEntity that = (ChannelDefinitionEntity) o;
        return pkChaDefId == that.pkChaDefId &&
                Objects.equals(chaDefName, that.chaDefName) &&
                Objects.equals(chaDefCode, that.chaDefCode) &&
                Objects.equals(chaDefAddtime, that.chaDefAddtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkChaDefId, chaDefName, chaDefCode, chaDefAddtime);
    }
}
