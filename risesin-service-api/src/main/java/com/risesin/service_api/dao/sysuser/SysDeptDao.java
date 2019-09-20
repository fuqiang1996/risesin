package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * SysDept的Dao接口
 *
 * @author honey
 */
public interface SysDeptDao extends JpaRepository<SysDept, Long>, JpaSpecificationExecutor<SysDept> {

    @Override
    @Modifying
    @Query("update SysDept d set d.delFlag = -1 where d.id = :id")
    void deleteById(@Param("id") Long id);
}