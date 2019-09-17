package com.risesin.service.dao.comuser;

import com.risesin.service.modules.comuser.entity.ComPermission;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ComPermission的Dao接口
 *
 * @author honey
 */
public interface ComPermissionDao extends Repository<ComPermission, Long>, JpaSpecificationExecutor<ComPermission> {

}