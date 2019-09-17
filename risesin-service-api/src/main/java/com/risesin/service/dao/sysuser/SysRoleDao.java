package com.risesin.service.dao.sysuser;

import com.risesin.service.modules.system.entity.SysRole;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysRole的Dao接口
*
* @author honey
*
*/
public interface SysRoleDao extends Repository<SysRole, Long>, JpaSpecificationExecutor<SysRole> {

}