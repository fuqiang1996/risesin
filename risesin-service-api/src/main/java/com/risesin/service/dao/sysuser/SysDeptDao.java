package com.risesin.service.dao.sysuser;

import com.risesin.service.modules.system.entity.SysDept;
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