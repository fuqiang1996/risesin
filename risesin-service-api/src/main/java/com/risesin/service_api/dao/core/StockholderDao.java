package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.Stockholder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* Stockholder的Dao接口
*
* @author honey
*
*/
public interface StockholderDao extends JpaRepository<Stockholder, Long>, JpaSpecificationExecutor<Stockholder> {

}