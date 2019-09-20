package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.EnterpriseAtomicityInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * EnterpriseAtomicityInfo数据访问接口
 * @author Darling
 *
 */
public interface EnterpriseAtomicityInfoDao extends JpaRepository<EnterpriseAtomicityInfo,Long>,JpaSpecificationExecutor<EnterpriseAtomicityInfo>{
    @Override
    @Query("update EnterpriseAtomicityInfo c set c.delFlag = -1 where c.id = :id")
    @Modifying
    void deleteById(@Param("id") Long id);
}