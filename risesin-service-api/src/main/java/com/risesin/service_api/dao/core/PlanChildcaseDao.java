package com.risesin.service_api.dao.core;

import com.risesin.service.modules.core.entity.PlanChildcase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/**
 * PlanChildcase数据访问接口
 * @author Darling
 *
 */
public interface PlanChildcaseDao extends JpaRepository<PlanChildcase,Integer>,JpaSpecificationExecutor<PlanChildcase>{
	
}
