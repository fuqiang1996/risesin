package com.risesin.service.dao.comuser;

import com.risesin.service.modules.comuser.entity.ExtCommonUser;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ExtCommonUser的Dao接口
 *
 * @author honey
 */
public interface ExtCommonUserDao extends Repository<ExtCommonUser, Long>, JpaSpecificationExecutor<ExtCommonUser> {

}