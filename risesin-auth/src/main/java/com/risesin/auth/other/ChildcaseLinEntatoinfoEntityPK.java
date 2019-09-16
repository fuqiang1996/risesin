package com.risesin.auth.other;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ChildcaseLinEntatoinfoEntityPK implements Serializable {
    private int pkFinCasId;
    private int pkFinEntinfoId;

    @Column(name = "pk_fin_cas_id", nullable = false)
    @Id
    public int getPkFinCasId() {
        return pkFinCasId;
    }

    public void setPkFinCasId(int pkFinCasId) {
        this.pkFinCasId = pkFinCasId;
    }

    @Column(name = "pk_fin_entinfo_id", nullable = false)
    @Id
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
        ChildcaseLinEntatoinfoEntityPK that = (ChildcaseLinEntatoinfoEntityPK) o;
        return pkFinCasId == that.pkFinCasId &&
                pkFinEntinfoId == that.pkFinEntinfoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkFinCasId, pkFinEntinfoId);
    }
}
