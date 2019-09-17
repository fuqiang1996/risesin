package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ExtCommonUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ExtCommonUser的Dao接口
 *
 * @author honey
 */
public interface ExtCommonUserDao extends JpaRepository<ExtCommonUser, Long>, JpaSpecificationExecutor<ExtCommonUser> {

}