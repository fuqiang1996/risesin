package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * SysUser的Dao接口
 *
 * @author honey
 */
public interface SysUserDao extends JpaRepository<SysUser, Long>, JpaSpecificationExecutor<SysUser> {

    @Override
    @Modifying
    @Query("update SysUser u set u.delFlag = -1 where u.id = :id")
    void deleteById(@Param("id") Long id);
}