package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysPermission的Dao接口
*
* @author honey
*
*/
public interface SysPermissionDao extends JpaRepository<SysPermission, Long>, JpaSpecificationExecutor<SysPermission> {

}