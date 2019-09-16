package com.risesin.service.dao.sysuser;
import java.util.List;

import com.risesin.service.modules.sysuser.ExtSysUser;
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