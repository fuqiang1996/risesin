package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.TasLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysTasLog的Dao接口
*
* @author honey
*
*/
public interface TasLogDao extends JpaRepository<TasLog, Long>, JpaSpecificationExecutor<TasLog> {

}