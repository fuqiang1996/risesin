package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysMenu的Dao接口
*
* @author honey
*
*/
public interface SysMenuDao extends JpaRepository<SysMenu, Long>, JpaSpecificationExecutor<SysMenu> {

}