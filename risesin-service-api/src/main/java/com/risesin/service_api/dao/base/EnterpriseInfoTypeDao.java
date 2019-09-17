package com.risesin.service_api.dao.base;

import com.risesin.service_api.modules.base.entity.EnterpriseInfoType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* EnterpriseInfoType的Dao接口
*
* @author honey
*
*/
public interface EnterpriseInfoTypeDao extends JpaRepository<EnterpriseInfoType, Long>, JpaSpecificationExecutor<EnterpriseInfoType> {

}