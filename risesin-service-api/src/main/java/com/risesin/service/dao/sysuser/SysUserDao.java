package com.risesin.service.dao.sysuser;
import java.util.List;

import com.risesin.service.modules.sysuser.SysUser;
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