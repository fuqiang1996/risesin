package com.risesin.auth.actionPlan;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ext_enterprise_atomicity_info", schema = "risesin", catalog = "")
public class ExtEnterpriseAtomicityInfoEntity {
    private int pkId;
    private Integer fkExtFinEntinfoId;
    private String extFileName;
    private String extFileType;
    private String extFileUrl;
    private Timestamp extAddtime;
    private Integer extDelFlag;
    private String extRemark;
    private Timestamp extLastmodified;

    @Id
    @Column(name = "pk_id", nullable = false)
    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    @Basic
    @Column(name = "fk_ext_fin_entinfo_id", nullable = true)
    public Integer getFkExtFinEntinfoId() {
        return fkExtFinEntinfoId;
    }

    public void setFkExtFinEntinfoId(Integer fkExtFinEntinfoId) {
        this.fkExtFinEntinfoId = fkExtFinEntinfoId;
    }

    @Basic
    @Column(name = "ext_file_name", nullable = true, length = 50)
    public String getExtFileName() {
        return extFileName;
    }

    public void setExtFileName(String extFileName) {
        this.extFileName = extFileName;
    }

    @Basic
    @Column(name = "ext_file_type", nullable = true, length = 50)
    public String getExtFileType() {
        return extFileType;
    }

    public void setExtFileType(String extFileType) {
        this.extFileType = extFileType;
    }

    @Basic
    @Column(name = "ext_file_url", nullable = true, length = 50)
    public String getExtFileUrl() {
        return extFileUrl;
    }

    public void setExtFileUrl(String extFileUrl) {
        this.extFileUrl = extFileUrl;
    }

    @Basic
    @Column(name = "ext_addtime", nullable = true)
    public Timestamp getExtAddtime() {
        return extAddtime;
    }

    public void setExtAddtime(Timestamp extAddtime) {
        this.extAddtime = extAddtime;
    }

    @Basic
    @Column(name = "ext_del_flag", nullable = true)
    public Integer getExtDelFlag() {
        return extDelFlag;
    }

    public void setExtDelFlag(Integer extDelFlag) {
        this.extDelFlag = extDelFlag;
    }

    @Basic
    @Column(name = "ext_remark", nullable = true, length = 255)
    public String getExtRemark() {
        return extRemark;
    }

    public void setExtRemark(String extRemark) {
        this.extRemark = extRemark;
    }

    @Basic
    @Column(name = "ext_lastmodified", nullable = true)
    public Timestamp getExtLastmodified() {
        return extLastmodified;
    }

    public void setExtLastmodified(Timestamp extLastmodified) {
        this.extLastmodified = extLastmodified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtEnterpriseAtomicityInfoEntity that = (ExtEnterpriseAtomicityInfoEntity) o;
        return pkId == that.pkId &&
                Objects.equals(fkExtFinEntinfoId, that.fkExtFinEntinfoId) &&
                Objects.equals(extFileName, that.extFileName) &&
                Objects.equals(extFileType, that.extFileType) &&
                Objects.equals(extFileUrl, that.extFileUrl) &&
                Objects.equals(extAddtime, that.extAddtime) &&
                Objects.equals(extDelFlag, that.extDelFlag) &&
                Objects.equals(extRemark, that.extRemark) &&
                Objects.equals(extLastmodified, that.extLastmodified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkId, fkExtFinEntinfoId, extFileName, extFileType, extFileUrl, extAddtime, extDelFlag, extRemark, extLastmodified);
    }
}
