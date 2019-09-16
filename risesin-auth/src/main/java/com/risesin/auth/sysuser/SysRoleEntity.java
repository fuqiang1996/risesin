package com.risesin.auth.sysuser;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_role", schema = "risesin", catalog = "")
public class SysRoleEntity {
    private int pkRoleId;
    private String roleName;
    private String roleSign;
    private Timestamp roleAddtime;
    private Timestamp roleLastmodified;
    private Integer fkUserIdCreate;
    private String roleOrderNum;
    private Integer roleDelflag;

    @Id
    @Column(name = "pk_role_id", nullable = false)
    public int getPkRoleId() {
        return pkRoleId;
    }

    public void setPkRoleId(int pkRoleId) {
        this.pkRoleId = pkRoleId;
    }

    @Basic
    @Column(name = "role_name", nullable = true, length = 50)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "role_sign", nullable = true, length = 50)
    public String getRoleSign() {
        return roleSign;
    }

    public void setRoleSign(String roleSign) {
        this.roleSign = roleSign;
    }

    @Basic
    @Column(name = "role_addtime", nullable = true)
    public Timestamp getRoleAddtime() {
        return roleAddtime;
    }

    public void setRoleAddtime(Timestamp roleAddtime) {
        this.roleAddtime = roleAddtime;
    }

    @Basic
    @Column(name = "role_lastmodified", nullable = true)
    public Timestamp getRoleLastmodified() {
        return roleLastmodified;
    }

    public void setRoleLastmodified(Timestamp roleLastmodified) {
        this.roleLastmodified = roleLastmodified;
    }

    @Basic
    @Column(name = "fk_user_id_create", nullable = true)
    public Integer getFkUserIdCreate() {
        return fkUserIdCreate;
    }

    public void setFkUserIdCreate(Integer fkUserIdCreate) {
        this.fkUserIdCreate = fkUserIdCreate;
    }

    @Basic
    @Column(name = "role_order_num", nullable = true, length = 50)
    public String getRoleOrderNum() {
        return roleOrderNum;
    }

    public void setRoleOrderNum(String roleOrderNum) {
        this.roleOrderNum = roleOrderNum;
    }

    @Basic
    @Column(name = "role_delflag", nullable = true)
    public Integer getRoleDelflag() {
        return roleDelflag;
    }

    public void setRoleDelflag(Integer roleDelflag) {
        this.roleDelflag = roleDelflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRoleEntity that = (SysRoleEntity) o;
        return pkRoleId == that.pkRoleId &&
                Objects.equals(roleName, that.roleName) &&
                Objects.equals(roleSign, that.roleSign) &&
                Objects.equals(roleAddtime, that.roleAddtime) &&
                Objects.equals(roleLastmodified, that.roleLastmodified) &&
                Objects.equals(fkUserIdCreate, that.fkUserIdCreate) &&
                Objects.equals(roleOrderNum, that.roleOrderNum) &&
                Objects.equals(roleDelflag, that.roleDelflag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkRoleId, roleName, roleSign, roleAddtime, roleLastmodified, fkUserIdCreate, roleOrderNum, roleDelflag);
    }
}
