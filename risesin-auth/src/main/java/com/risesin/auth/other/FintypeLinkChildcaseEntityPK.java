package com.risesin.auth.other;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class FintypeLinkChildcaseEntityPK implements Serializable {
    private int pkFinTypeId;
    private int pkFinCasId;

    @Column(name = "pk_fin_type_id", nullable = false)
    @Id
    public int getPkFinTypeId() {
        return pkFinTypeId;
    }

    public void setPkFinTypeId(int pkFinTypeId) {
        this.pkFinTypeId = pkFinTypeId;
    }

    @Column(name = "pk_fin_cas_id", nullable = false)
    @Id
    public int getPkFinCasId() {
        return pkFinCasId;
    }

    public void setPkFinCasId(int pkFinCasId) {
        this.pkFinCasId = pkFinCasId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FintypeLinkChildcaseEntityPK that = (FintypeLinkChildcaseEntityPK) o;
        return pkFinTypeId == that.pkFinTypeId &&
                pkFinCasId == that.pkFinCasId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkFinTypeId, pkFinCasId);
    }
}
