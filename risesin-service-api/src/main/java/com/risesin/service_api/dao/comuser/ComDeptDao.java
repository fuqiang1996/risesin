package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ComDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ComDept的Dao接口
 *
 * @author honey
 */
public interface ComDeptDao extends JpaRepository<ComDept, Long>, JpaSpecificationExecutor<ComDept> {

}