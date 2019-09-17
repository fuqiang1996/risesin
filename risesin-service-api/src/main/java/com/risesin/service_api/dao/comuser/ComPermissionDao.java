package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ComPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ComPermission的Dao接口
 *
 * @author honey
 */
public interface ComPermissionDao extends JpaRepository<ComPermission, Long>, JpaSpecificationExecutor<ComPermission> {

}