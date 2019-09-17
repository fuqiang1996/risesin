package com.risesin.service.dao.comuser;

import com.risesin.service.modules.comuser.entity.ComLog;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ComLog的Dao接口
 *
 * @author honey
 */
public interface ComLogDao extends Repository<ComLog, Long>, JpaSpecificationExecutor<ComLog> {

}