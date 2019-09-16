package com.risesin.auth.other;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "exclude_financing_type", schema = "risesin", catalog = "")
@IdClass(ExcludeFinancingTypeEntityPK.class)
public class ExcludeFinancingTypeEntity {
    private int pkFinPlaId;
    private int pkFinTypeId;

    @Id
    @Column(name = "pk_fin_pla_id", nullable = false)
    public int getPkFinPlaId() {
        return pkFinPlaId;
    }

    public void setPkFinPlaId(int pkFinPlaId) {
        this.pkFinPlaId = pkFinPlaId;
    }

    @Id
    @Column(name = "pk_fin_type_id", nullable = false)
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
        ExcludeFinancingTypeEntity that = (ExcludeFinancingTypeEntity) o;
        return pkFinPlaId == that.pkFinPlaId &&
                pkFinTypeId == that.pkFinTypeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkFinPlaId, pkFinTypeId);
    }
}
