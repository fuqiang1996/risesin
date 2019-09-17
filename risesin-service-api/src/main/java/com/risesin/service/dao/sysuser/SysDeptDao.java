package com.risesin.service.dao.sysuser;
import java.util.List;

import com.risesin.service.modules.sysuser.SysDept;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysDept的Dao接口
*
* @author honey
*
*/
public interface SysDeptDao extends Repository<SysDept, Long>, JpaSpecificationExecutor<SysDept> {

}