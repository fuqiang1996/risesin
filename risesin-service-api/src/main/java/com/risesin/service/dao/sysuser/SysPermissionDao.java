package com.risesin.service.dao.sysuser;
import java.util.List;

import com.risesin.service.modules.sysuser.SysPermission;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysPermission的Dao接口
*
* @author honey
*
*/
public interface SysPermissionDao extends Repository<SysPermission, Long>, JpaSpecificationExecutor<SysPermission> {

}