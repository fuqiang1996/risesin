package com.risesin.service_api.dao.base;

import com.risesin.service_api.modules.base.entity.Industry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* Industry的Dao接口
*
* @author honey
*
*/
public interface IndustryDao extends JpaRepository<Industry, Long>, JpaSpecificationExecutor<Industry> {

}