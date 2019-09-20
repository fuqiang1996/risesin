package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.LegalRepresentative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* LegalRepresentative的Dao接口
*
* @author honey
*
*/
public interface LegalRepresentativeDao extends JpaRepository<LegalRepresentative, Long>, JpaSpecificationExecutor<LegalRepresentative> {
    @Override
    @Query("update LegalRepresentative t set t.delFlag = -1 where t.id = :id")
    @Modifying
    void deleteById(@Param("id") Long id);
}