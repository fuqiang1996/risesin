package com.risesin.service.dao.sysuser;
import java.util.List;

import com.risesin.service.modules.sysuser.SysMenu;
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