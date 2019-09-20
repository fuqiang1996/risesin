package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.Dispatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Dispatch数据访问接口
 * @author Darling
 *
 */
public interface DispatchDao extends JpaRepository<Dispatch,Long>,JpaSpecificationExecutor<Dispatch>{
    @Override
    @Query("update Dispatch d set d.delFlag = -1 where d.id = :id")
    @Modifying
    void deleteById(@Param("id") Long id);
}
