package com.risesin.service_api.dao.entuser;

import com.risesin.service_api.modules.entuser.entity.EnterpriseUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * EnterpriseUser的Dao接口
 *
 * @author honey
 */
public interface EnterpriseUserDao extends JpaRepository<EnterpriseUser, Long>, JpaSpecificationExecutor<EnterpriseUser> {

}