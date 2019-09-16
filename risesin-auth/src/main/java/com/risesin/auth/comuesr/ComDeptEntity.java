package com.risesin.auth.comuesr;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "com_dept", schema = "risesin", catalog = "")
public class ComDeptEntity {
    private int pkDeptId;
    private String deptName;
    private String deptParentId;
    private Integer deptOrderNum;
    private Integer deptDelFlag;
    private String fkDeptBranId;
    private Timestamp deptAddtime;
    private Timestamp deptLastmodify;

    @Id
    @Column(name = "pk_dept_id", nullable = false)
    public int getPkDeptId() {
        return pkDeptId;
    }

    public void setPkDeptId(int pkDeptId) {
        this.pkDeptId = pkDeptId;
    }

    @Basic
    @Column(name = "dept_name", nullable = true, length = 50)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "dept_parent_id", nullable = true, length = 50)
    public String getDeptParentId() {
        return deptParentId;
    }

    public void setDeptParentId(String deptParentId) {
        this.deptParentId = deptParentId;
    }

    @Basic
    @Column(name = "dept_order_num", nullable = true)
    public Integer getDeptOrderNum() {
        return deptOrderNum;
    }

    public void setDeptOrderNum(Integer deptOrderNum) {
        this.deptOrderNum = deptOrderNum;
    }

    @Basic
    @Column(name = "dept_del_flag", nullable = true)
    public Integer getDeptDelFlag() {
        return deptDelFlag;
    }

    public void setDeptDelFlag(Integer deptDelFlag) {
        this.deptDelFlag = deptDelFlag;
    }

    @Basic
    @Column(name = "fk_dept_bran_id", nullable = true, length = 50)
    public String getFkDeptBranId() {
        return fkDeptBranId;
    }

    public void setFkDeptBranId(String fkDeptBranId) {
        this.fkDeptBranId = fkDeptBranId;
    }

    @Basic
    @Column(name = "dept_addtime", nullable = true)
    public Timestamp getDeptAddtime() {
        return deptAddtime;
    }

    public void setDeptAddtime(Timestamp deptAddtime) {
        this.deptAddtime = deptAddtime;
    }

    @Basic
    @Column(name = "dept_lastmodify", nullable = true)
    public Timestamp getDeptLastmodify() {
        return deptLastmodify;
    }

    public void setDeptLastmodify(Timestamp deptLastmodify) {
        this.deptLastmodify = deptLastmodify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComDeptEntity that = (ComDeptEntity) o;
        return pkDeptId == that.pkDeptId &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(deptParentId, that.deptParentId) &&
                Objects.equals(deptOrderNum, that.deptOrderNum) &&
                Objects.equals(deptDelFlag, that.deptDelFlag) &&
                Objects.equals(fkDeptBranId, that.fkDeptBranId) &&
                Objects.equals(deptAddtime, that.deptAddtime) &&
                Objects.equals(deptLastmodify, that.deptLastmodify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkDeptId, deptName, deptParentId, deptOrderNum, deptDelFlag, fkDeptBranId, deptAddtime, deptLastmodify);
    }
}
