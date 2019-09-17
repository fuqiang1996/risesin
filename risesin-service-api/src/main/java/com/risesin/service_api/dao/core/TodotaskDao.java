package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.Todotask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* Todotask的Dao接口
*
* @author honey
*
*/
public interface TodotaskDao extends JpaRepository<Todotask, Long>, JpaSpecificationExecutor<Todotask> {

}