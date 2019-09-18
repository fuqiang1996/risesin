package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * SysUserRole的Dao接口
 *
 * @author honey
 */
public interface SysUserRoleDao extends JpaRepository<SysUserRole, Long>, JpaSpecificationExecutor<SysUserRole> {

}