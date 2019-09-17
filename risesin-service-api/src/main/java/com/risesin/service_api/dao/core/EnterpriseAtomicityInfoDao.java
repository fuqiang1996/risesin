package com.risesin.service_api.dao.core;

import com.risesin.service.modules.core.entity.EnterpriseAtomicityInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/**
 * EnterpriseAtomicityInfo数据访问接口
 * @author Darling
 *
 */
public interface EnterpriseAtomicityInfoDao extends JpaRepository<EnterpriseAtomicityInfo,Long>,JpaSpecificationExecutor<EnterpriseAtomicityInfo>{
	
}