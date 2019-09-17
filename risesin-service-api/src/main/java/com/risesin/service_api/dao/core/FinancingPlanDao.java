package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.FinancingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* FinancingPlan的Dao接口
*
* @author honey
*
*/
public interface FinancingPlanDao extends JpaRepository<FinancingPlan, Long>, JpaSpecificationExecutor<FinancingPlan> {

}