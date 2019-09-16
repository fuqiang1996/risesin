package com.risesin.auth.comuesr;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "common_user_role", schema = "risesin", catalog = "")
public class CommonUserRoleEntity {
    private int pkId;
    private Integer fkCommonUserId;
    private Integer fkRoleId;

    @Id
    @Column(name = "pk_id", nullable = false)
    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    @Basic
    @Column(name = "fk_common_user_id", nullable = true)
    public Integer getFkCommonUserId() {
        return fkCommonUserId;
    }

    public void setFkCommonUserId(Integer fkCommonUserId) {
        this.fkCommonUserId = fkCommonUserId;
    }

    @Basic
    @Column(name = "fk_role_id", nullable = true)
    public Integer getFkRoleId() {
        return fkRoleId;
    }

    public void setFkRoleId(Integer fkRoleId) {
        this.fkRoleId = fkRoleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonUserRoleEntity that = (CommonUserRoleEntity) o;
        return pkId == that.pkId &&
                Objects.equals(fkCommonUserId, that.fkCommonUserId) &&
                Objects.equals(fkRoleId, that.fkRoleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkId, fkCommonUserId, fkRoleId);
    }
}
