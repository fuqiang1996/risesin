package com.risesin.auth.sysuser;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sys_role_menu", schema = "risesin", catalog = "")
public class SysRoleMenuEntity {
    private int pkId;
    private Integer fkRoleId;
    private Integer fkMenuId;

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
    @Column(name = "fk_menu_id", nullable = true)
    public Integer getFkMenuId() {
        return fkMenuId;
    }

    public void setFkMenuId(Integer fkMenuId) {
        this.fkMenuId = fkMenuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRoleMenuEntity that = (SysRoleMenuEntity) o;
        return pkId == that.pkId &&
                Objects.equals(fkRoleId, that.fkRoleId) &&
                Objects.equals(fkMenuId, that.fkMenuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkId, fkRoleId, fkMenuId);
    }
}
