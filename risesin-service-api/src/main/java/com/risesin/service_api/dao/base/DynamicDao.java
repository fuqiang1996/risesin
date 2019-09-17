package com.risesin.service_api.dao.base;

import com.risesin.service_api.modules.base.entity.Dynamic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Dynamic数据访问接口
 * @author Darling
 *
 */
public interface DynamicDao extends JpaRepository<Dynamic,Long>,JpaSpecificationExecutor<Dynamic>{
	
}
