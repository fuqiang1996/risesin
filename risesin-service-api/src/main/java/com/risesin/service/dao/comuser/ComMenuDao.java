package com.risesin.service.dao.comuser;

import com.risesin.service.modules.comuser.entity.ComMenu;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ComMenu的Dao接口
 *
 * @author honey
 */
public interface ComMenuDao extends Repository<ComMenu, Long>, JpaSpecificationExecutor<ComMenu> {

}