package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* SysPermission的Dao接口
*
* @author honey
*
*/
public interface SysPermissionDao extends JpaRepository<SysPermission, Long>, JpaSpecificationExecutor<SysPermission> {

    @Override
    @Modifying
    @Query("update SysPermission p set p.delFlag = -1 where p.id = :id")
    void deleteById(@Param("id") Long id);
}