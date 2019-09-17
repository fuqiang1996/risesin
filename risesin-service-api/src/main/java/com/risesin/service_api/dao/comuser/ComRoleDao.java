package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ComRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ComRole的Dao接口
 *
 * @author honey
 */
public interface ComRoleDao extends JpaRepository<ComRole, Long>, JpaSpecificationExecutor<ComRole> {

}