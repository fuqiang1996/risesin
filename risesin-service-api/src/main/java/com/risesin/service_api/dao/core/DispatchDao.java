package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.Dispatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Dispatch数据访问接口
 * @author Darling
 *
 */
public interface DispatchDao extends JpaRepository<Dispatch,Long>,JpaSpecificationExecutor<Dispatch>{
	
}
