package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.CommonUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * CommonUser的Dao接口
 *
 * @author honey
 */
public interface CommonUserDao extends JpaRepository<CommonUser, Long>, JpaSpecificationExecutor<CommonUser> {

}