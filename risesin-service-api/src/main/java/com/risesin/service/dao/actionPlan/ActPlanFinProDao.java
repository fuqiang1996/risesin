package com.risesin.service.dao.actionPlan;

import java.util.List;

import com.risesin.service.modules.actionPlan.entity.ActPlanFinPro;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ActPlanFinPro的Dao接口
 *
 * @author honey
 */
public interface ActPlanFinProDao extends Repository<ActPlanFinPro, Long>, JpaSpecificationExecutor<ActPlanFinPro> {

}