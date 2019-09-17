package com.risesin.service.dao.sysuser;

import com.risesin.service.modules.system.entity.SysMenu;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysMenu的Dao接口
*
* @author honey
*
*/
public interface SysMenuDao extends Repository<SysMenu, Long>, JpaSpecificationExecutor<SysMenu> {

}