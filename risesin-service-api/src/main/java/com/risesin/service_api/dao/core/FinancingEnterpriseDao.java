package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.FinancingEnterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* FinancingEnterprise的Dao接口
*
* @author honey
*
*/
public interface FinancingEnterpriseDao extends JpaRepository<FinancingEnterprise, Long>, JpaSpecificationExecutor<FinancingEnterprise> {
    @Override
    @Query("update FinancingEnterprise t set t.delFlag = -1 where t.id = :id")
    @Modifying
    void deleteById(@Param("id") Long id);
}