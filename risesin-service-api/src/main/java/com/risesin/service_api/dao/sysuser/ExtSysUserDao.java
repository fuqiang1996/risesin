package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.ExtSysUser;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* ExtSysUser的Dao接口
*
* @author honey
*
*/
public interface ExtSysUserDao extends Repository<ExtSysUser, Long>, JpaSpecificationExecutor<ExtSysUser> {

}