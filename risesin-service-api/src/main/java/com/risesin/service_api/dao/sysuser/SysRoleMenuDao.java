package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysRoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysRoleMenu的Dao接口
*
* @author honey
*
*/
public interface SysRoleMenuDao extends JpaRepository<SysRoleMenu, Long>, JpaSpecificationExecutor<SysRoleMenu>  {

}