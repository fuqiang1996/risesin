package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.Todotask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* Todotask的Dao接口
*
* @author honey
*
*/
public interface TodotaskDao extends JpaRepository<Todotask, Long>, JpaSpecificationExecutor<Todotask> {
    @Override
    @Query("update Todotask t set t.delFlag = -1 where t.id = :id")
    @Modifying
    void deleteById(@Param("id") Long id);
}