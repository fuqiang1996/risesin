package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ComPermission;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ComPermission的Dao接口
 *
 * @author honey
 */
public interface ComPermissionDao extends Repository<ComPermission, Long>, JpaSpecificationExecutor<ComPermission> {

}