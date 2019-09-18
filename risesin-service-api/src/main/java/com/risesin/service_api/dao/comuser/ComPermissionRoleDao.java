package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ComPermissionRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ComPermissionRole的Dao接口
 *
 * @author honey
 */
public interface ComPermissionRoleDao extends JpaRepository<ComPermissionRole, Long>, JpaSpecificationExecutor<ComPermissionRole> {

}