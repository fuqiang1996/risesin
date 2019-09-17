package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * SysDept的Dao接口
 *
 * @author honey
 */
public interface SysDeptDao extends JpaRepository<SysDept, Long>, JpaSpecificationExecutor<SysDept> {

}