package com.risesin.auth.sysuser;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sys_permission_role", schema = "risesin", catalog = "")
public class SysPermissionRoleEntity {
    private int pkId;
    private Integer fkRoleId;
    private Integer fkPermissionId;

    @Id
    @Column(name = "pk_id", nullable = false)
    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    @Basic
    @Column(name = "fk_role_id", nullable = true)
    public Integer getFkRoleId() {
        return fkRoleId;
    }

    public void setFkRoleId(Integer fkRoleId) {
        this.fkRoleId = fkRoleId;
    }

    @Basic
    @Column(name = "fk_permission_id", nullable = true)
    public Integer getFkPermissionId() {
        return fkPermissionId;
    }

    public void setFkPermissionId(Integer fkPermissionId) {
        this.fkPermissionId = fkPermissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysPermissionRoleEntity that = (SysPermissionRoleEntity) o;
        return pkId == that.pkId &&
                Objects.equals(fkRoleId, that.fkRoleId) &&
                Objects.equals(fkPermissionId, that.fkPermissionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkId, fkRoleId, fkPermissionId);
    }
}
