package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysLog;
import com.risesin.service_api.modules.system.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

/**
 * SysLog的Dao接口
 *
 * @author honey
 */
public interface SysLogDao extends JpaRepository<SysLog, Long>, JpaSpecificationExecutor<SysLog> {

}