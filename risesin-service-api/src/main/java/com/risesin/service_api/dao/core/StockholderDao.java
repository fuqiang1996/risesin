package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.Stockholder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* Stockholder的Dao接口
*
* @author honey
*
*/
public interface StockholderDao extends JpaRepository<Stockholder, Long>, JpaSpecificationExecutor<Stockholder> {
    @Override
    @Query("update Stockholder t set t.delFlag = -1 where t.id = :id")
    @Modifying
    void deleteById(@Param("id") Long id);
}