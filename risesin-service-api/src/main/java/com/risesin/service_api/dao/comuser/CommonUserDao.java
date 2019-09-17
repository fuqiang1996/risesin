package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.CommonUser;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * CommonUser的Dao接口
 *
 * @author honey
 */
public interface CommonUserDao extends Repository<CommonUser, Long>, JpaSpecificationExecutor<CommonUser> {

}