package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.ExtSysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * ExtSysUser的Dao接口
 *
 * @author honey
 */
public interface ExtSysUserDao extends JpaRepository<ExtSysUser, Long>, JpaSpecificationExecutor<ExtSysUser> {

    @Override
    @Modifying
    @Query("update ExtSysUser u set u.delFlag = -1 where u.id = :id")
    void deleteById(@Param("id") Long id);
}