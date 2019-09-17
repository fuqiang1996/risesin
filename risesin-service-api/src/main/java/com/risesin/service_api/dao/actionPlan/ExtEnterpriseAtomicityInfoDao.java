package com.risesin.service_api.dao.actionPlan;

import com.risesin.service_api.modules.actionPlan.entity.ExtEnterpriseAtomicityInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ExtEnterpriseAtomicityInfo的Dao接口
 *
 * @author honey
 */
public interface ExtEnterpriseAtomicityInfoDao extends JpaRepository<ExtEnterpriseAtomicityInfo, Long>, JpaSpecificationExecutor<ExtEnterpriseAtomicityInfo> {

}