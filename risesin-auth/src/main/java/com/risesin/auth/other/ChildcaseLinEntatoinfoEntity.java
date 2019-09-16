package com.risesin.auth.other;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "childcase_lin_entatoinfo", schema = "risesin", catalog = "")
@IdClass(ChildcaseLinEntatoinfoEntityPK.class)
public class ChildcaseLinEntatoinfoEntity {
    private int pkFinCasId;
    private int pkFinEntinfoId;

    @Id
    @Column(name = "pk_fin_cas_id", nullable = false)
    public int getPkFinCasId() {
        return pkFinCasId;
    }

    public void setPkFinCasId(int pkFinCasId) {
        this.pkFinCasId = pkFinCasId;
    }

    @Id
    @Column(name = "pk_fin_entinfo_id", nullable = false)
    public int getPkFinEntinfoId() {
        return pkFinEntinfoId;
    }

    public void setPkFinEntinfoId(int pkFinEntinfoId) {
        this.pkFinEntinfoId = pkFinEntinfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildcaseLinEntatoinfoEntity that = (ChildcaseLinEntatoinfoEntity) o;
        return pkFinCasId == that.pkFinCasId &&
                pkFinEntinfoId == that.pkFinEntinfoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkFinCasId, pkFinEntinfoId);
    }
}
