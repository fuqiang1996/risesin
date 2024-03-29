package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ComLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ComLog的Dao接口
 *
 * @author honey
 */
public interface ComLogDao extends JpaRepository<ComLog, Long>, JpaSpecificationExecutor<ComLog> {

}