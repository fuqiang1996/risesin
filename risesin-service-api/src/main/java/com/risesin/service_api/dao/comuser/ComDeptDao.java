package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ComDept;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ComDept的Dao接口
 *
 * @author honey
 */
public interface ComDeptDao extends Repository<ComDept, Long>, JpaSpecificationExecutor<ComDept> {

}