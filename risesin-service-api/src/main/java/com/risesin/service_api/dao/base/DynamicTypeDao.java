package com.risesin.service_api.dao.base;

import com.risesin.service_api.modules.base.entity.DynamicType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* DynamicType的Dao接口
*
* @author honey
*
*/
public interface DynamicTypeDao extends JpaRepository<DynamicType, Long>, JpaSpecificationExecutor<DynamicType> {

}