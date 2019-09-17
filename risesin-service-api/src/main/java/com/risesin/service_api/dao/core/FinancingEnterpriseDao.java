package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.FinancingEnterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* FinancingEnterprise的Dao接口
*
* @author honey
*
*/
public interface FinancingEnterpriseDao extends JpaRepository<FinancingEnterprise, Long>, JpaSpecificationExecutor<FinancingEnterprise> {

}