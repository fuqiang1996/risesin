package com.risesin.auth.other;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ExcludeFinancingTypeEntityPK implements Serializable {
    private int pkFinPlaId;
    private int pkFinTypeId;

    @Column(name = "pk_fin_pla_id", nullable = false)
    @Id
    public int getPkFinPlaId() {
        return pkFinPlaId;
    }

    public void setPkFinPlaId(int pkFinPlaId) {
        this.pkFinPlaId = pkFinPlaId;
    }

    @Column(name = "pk_fin_type_id", nullable = false)
    @Id
    public int getPkFinTypeId() {
        return pkFinTypeId;
    }

    public void setPkFinTypeId(int pkFinTypeId) {
        this.pkFinTypeId = pkFinTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExcludeFinancingTypeEntityPK that = (ExcludeFinancingTypeEntityPK) o;
        return pkFinPlaId == that.pkFinPlaId &&
                pkFinTypeId == that.pkFinTypeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkFinPlaId, pkFinTypeId);
    }
}
