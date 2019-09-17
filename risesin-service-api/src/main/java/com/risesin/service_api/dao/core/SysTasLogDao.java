package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.SysTasLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysTasLog的Dao接口
*
* @author honey
*
*/
public interface SysTasLogDao extends JpaRepository<SysTasLog, Long>, JpaSpecificationExecutor<SysTasLog> {

}