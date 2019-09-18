package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ComRoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* ComRoleMenu的Dao接口
*
* @author honey
*
*/
public interface ComRoleMenuDao extends JpaRepository<ComRoleMenu, Long>, JpaSpecificationExecutor<ComRoleMenu>  {

}