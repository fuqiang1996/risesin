package com.risesin.service_api.dao.actionPlan;

import com.risesin.service_api.modules.actionPlan.entity.ActPlanFinPro;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ActPlanFinPro的Dao接口
 *
 * @author honey
 */
public interface ActPlanFinProDao extends Repository<ActPlanFinPro, Long>, JpaSpecificationExecutor<ActPlanFinPro> {

}