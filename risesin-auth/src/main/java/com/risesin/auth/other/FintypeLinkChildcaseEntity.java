package com.risesin.auth.other;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "fintype_link_childcase", schema = "risesin", catalog = "")
@IdClass(FintypeLinkChildcaseEntityPK.class)
public class FintypeLinkChildcaseEntity {
    private int pkFinTypeId;
    private int pkFinCasId;

    @Id
    @Column(name = "pk_fin_type_id", nullable = false)
    public int getPkFinTypeId() {
        return pkFinTypeId;
    }

    public void setPkFinTypeId(int pkFinTypeId) {
        this.pkFinTypeId = pkFinTypeId;
    }

    @Id
    @Column(name = "pk_fin_cas_id", nullable = false)
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
        FintypeLinkChildcaseEntity that = (FintypeLinkChildcaseEntity) o;
        return pkFinTypeId == that.pkFinTypeId &&
                pkFinCasId == that.pkFinCasId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkFinTypeId, pkFinCasId);
    }
}
