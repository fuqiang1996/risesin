package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;

/**
 * SysRole的Dao接口
 *
 * @author honey
 */
public interface SysRoleDao extends JpaRepository<SysRole, Long>, JpaSpecificationExecutor<SysRole> {

    @Override
    @Modifying
    @Query("update SysRole r set r.delFlag = -1 where r.id = :id")
    void deleteById(@Param("id") Long id);
}