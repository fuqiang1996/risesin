package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.CommonUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * CommonUserRole的Dao接口
 *
 * @author honey
 */
public interface CommonUserRoleDao extends JpaRepository<CommonUserRole, Long>, JpaSpecificationExecutor<CommonUserRole> {

}