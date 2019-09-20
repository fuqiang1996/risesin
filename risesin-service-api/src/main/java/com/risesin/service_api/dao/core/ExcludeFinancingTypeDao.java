package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.ExcludeFinancingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* ExcludeFinancingType的Dao接口
*
* @author honey
*
*/
public interface ExcludeFinancingTypeDao extends JpaRepository<ExcludeFinancingType, Long>, JpaSpecificationExecutor<ExcludeFinancingType>  {

}