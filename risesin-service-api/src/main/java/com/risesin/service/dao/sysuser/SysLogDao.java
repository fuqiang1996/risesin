package com.risesin.service.dao.sysuser;
import java.util.List;

import com.risesin.service.modules.sysuser.SysLog;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysLog的Dao接口
*
* @author honey
*
*/
public interface SysLogDao extends Repository<SysLog, Long>, JpaSpecificationExecutor<SysLog> {

}