package com.risesin.service.dao.sysuser;

import com.risesin.service.modules.system.entity.SysUser;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysUser的Dao接口
*
* @author honey
*
*/
public interface SysUserDao extends Repository<SysUser, Long>, JpaSpecificationExecutor<SysUser> {

}