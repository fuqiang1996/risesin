package com.risesin.auth.aritl;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sharing", schema = "risesin", catalog = "")
public class SharingEntity {
    private int pkId;
    private Integer fkArtId;
    private Integer shaCount;
    private Integer shaDelFlag;
    private Integer shaHits;
    private Integer shaIsedit;
    private String shaLink;
    private String shaMethod;
    private String shaStopsharing;
    private Timestamp shaAddtime;
    private Timestamp shaLastmodify;

    @Id
    @Column(name = "pk_id", nullable = false)
    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    @Basic
    @Column(name = "fk_art_id", nullable = true)
    public Integer getFkArtId() {
        return fkArtId;
    }

    public void setFkArtId(Integer fkArtId) {
        this.fkArtId = fkArtId;
    }

    @Basic
    @Column(name = "sha_count", nullable = true)
    public Integer getShaCount() {
        return shaCount;
    }

    public void setShaCount(Integer shaCount) {
        this.shaCount = shaCount;
    }

    @Basic
    @Column(name = "sha_del_flag", nullable = true)
    public Integer getShaDelFlag() {
        return shaDelFlag;
    }

    public void setShaDelFlag(Integer shaDelFlag) {
        this.shaDelFlag = shaDelFlag;
    }

    @Basic
    @Column(name = "sha_hits", nullable = true)
    public Integer getShaHits() {
        return shaHits;
    }

    public void setShaHits(Integer shaHits) {
        this.shaHits = shaHits;
    }

    @Basic
    @Column(name = "sha_isedit", nullable = true)
    public Integer getShaIsedit() {
        return shaIsedit;
    }

    public void setShaIsedit(Integer shaIsedit) {
        this.shaIsedit = shaIsedit;
    }

    @Basic
    @Column(name = "sha_link", nullable = true, length = 50)
    public String getShaLink() {
        return shaLink;
    }

    public void setShaLink(String shaLink) {
        this.shaLink = shaLink;
    }

    @Basic
    @Column(name = "sha_method", nullable = true, length = 50)
    public String getShaMethod() {
        return shaMethod;
    }

    public void setShaMethod(String shaMethod) {
        this.shaMethod = shaMethod;
    }

    @Basic
    @Column(name = "sha_stopsharing", nullable = true, length = 50)
    public String getShaStopsharing() {
        return shaStopsharing;
    }

    public void setShaStopsharing(String shaStopsharing) {
        this.shaStopsharing = shaStopsharing;
    }

    @Basic
    @Column(name = "sha_addtime", nullable = true)
    public Timestamp getShaAddtime() {
        return shaAddtime;
    }

    public void setShaAddtime(Timestamp shaAddtime) {
        this.shaAddtime = shaAddtime;
    }

    @Basic
    @Column(name = "sha_lastmodify", nullable = true)
    public Timestamp getShaLastmodify() {
        return shaLastmodify;
    }

    public void setShaLastmodify(Timestamp shaLastmodify) {
        this.shaLastmodify = shaLastmodify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SharingEntity that = (SharingEntity) o;
        return pkId == that.pkId &&
                Objects.equals(fkArtId, that.fkArtId) &&
                Objects.equals(shaCount, that.shaCount) &&
                Objects.equals(shaDelFlag, that.shaDelFlag) &&
                Objects.equals(shaHits, that.shaHits) &&
                Objects.equals(shaIsedit, that.shaIsedit) &&
                Objects.equals(shaLink, that.shaLink) &&
                Objects.equals(shaMethod, that.shaMethod) &&
                Objects.equals(shaStopsharing, that.shaStopsharing) &&
                Objects.equals(shaAddtime, that.shaAddtime) &&
                Objects.equals(shaLastmodify, that.shaLastmodify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkId, fkArtId, shaCount, shaDelFlag, shaHits, shaIsedit, shaLink, shaMethod, shaStopsharing, shaAddtime, shaLastmodify);
    }
}
