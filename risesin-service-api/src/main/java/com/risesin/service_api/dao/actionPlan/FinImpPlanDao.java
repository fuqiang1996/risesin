package com.risesin.service_api.dao.actionPlan;

import com.risesin.service_api.modules.actionPlan.entity.FinImpPlan;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * FinImpPlan的Dao接口
 *
 * @author honey
 */
public interface FinImpPlanDao extends Repository<FinImpPlan, Long>, JpaSpecificationExecutor<FinImpPlan> {

}