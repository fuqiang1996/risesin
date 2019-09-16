package com.risesin.auth.aritl;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "business_track", schema = "risesin", catalog = "")
public class BusinessTrackEntity {
    private int pkId;
    private Integer fkArtId;
    private Integer busTraUserid;
    private String busTraTempuserIp;
    private String busTraLink;
    private String busTraAction;
    private Timestamp busDepartureTime;
    private Timestamp busAccesstime;
    private Integer busDelflag;

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
    @Column(name = "bus_tra_userid", nullable = true)
    public Integer getBusTraUserid() {
        return busTraUserid;
    }

    public void setBusTraUserid(Integer busTraUserid) {
        this.busTraUserid = busTraUserid;
    }

    @Basic
    @Column(name = "bus_tra_tempuser_ip", nullable = true, length = 50)
    public String getBusTraTempuserIp() {
        return busTraTempuserIp;
    }

    public void setBusTraTempuserIp(String busTraTempuserIp) {
        this.busTraTempuserIp = busTraTempuserIp;
    }

    @Basic
    @Column(name = "bus_tra_link", nullable = true, length = 50)
    public String getBusTraLink() {
        return busTraLink;
    }

    public void setBusTraLink(String busTraLink) {
        this.busTraLink = busTraLink;
    }

    @Basic
    @Column(name = "bus_tra_action", nullable = true, length = 50)
    public String getBusTraAction() {
        return busTraAction;
    }

    public void setBusTraAction(String busTraAction) {
        this.busTraAction = busTraAction;
    }

    @Basic
    @Column(name = "bus_departure_time", nullable = true)
    public Timestamp getBusDepartureTime() {
        return busDepartureTime;
    }

    public void setBusDepartureTime(Timestamp busDepartureTime) {
        this.busDepartureTime = busDepartureTime;
    }

    @Basic
    @Column(name = "bus_accesstime", nullable = true)
    public Timestamp getBusAccesstime() {
        return busAccesstime;
    }

    public void setBusAccesstime(Timestamp busAccesstime) {
        this.busAccesstime = busAccesstime;
    }

    @Basic
    @Column(name = "bus_delflag", nullable = true)
    public Integer getBusDelflag() {
        return busDelflag;
    }

    public void setBusDelflag(Integer busDelflag) {
        this.busDelflag = busDelflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessTrackEntity that = (BusinessTrackEntity) o;
        return pkId == that.pkId &&
                Objects.equals(fkArtId, that.fkArtId) &&
                Objects.equals(busTraUserid, that.busTraUserid) &&
                Objects.equals(busTraTempuserIp, that.busTraTempuserIp) &&
                Objects.equals(busTraLink, that.busTraLink) &&
                Objects.equals(busTraAction, that.busTraAction) &&
                Objects.equals(busDepartureTime, that.busDepartureTime) &&
                Objects.equals(busAccesstime, that.busAccesstime) &&
                Objects.equals(busDelflag, that.busDelflag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkId, fkArtId, busTraUserid, busTraTempuserIp, busTraLink, busTraAction, busDepartureTime, busAccesstime, busDelflag);
    }
}
