package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysPermissionRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysPermissionRole的Dao接口
*
* @author honey
*
*/
public interface SysPermissionRoleDao extends JpaRepository<SysPermissionRole, Long>, JpaSpecificationExecutor<SysPermissionRole>  {

}