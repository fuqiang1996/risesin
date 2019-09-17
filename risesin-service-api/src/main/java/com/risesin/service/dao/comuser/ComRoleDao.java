package com.risesin.service.dao.comuser;

import com.risesin.service.modules.system.ComRole;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* ComRole的Dao接口
*
* @author honey
*
*/
public interface ComRoleDao extends Repository<ComRole, Long> implements JpaSpecificationExecutor<ComRole>  {

}