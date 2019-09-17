package com.risesin.service_api.dao.base;

import com.risesin.service_api.modules.base.entity.FinancingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* FinancingType的Dao接口
*
* @author honey
*
*/
public interface FinancingTypeDao extends JpaRepository<FinancingType, Long>, JpaSpecificationExecutor<FinancingType> {

}