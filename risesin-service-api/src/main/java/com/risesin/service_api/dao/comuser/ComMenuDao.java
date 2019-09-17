package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ComMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ComMenu的Dao接口
 *
 * @author honey
 */
public interface ComMenuDao extends JpaRepository<ComMenu, Long>, JpaSpecificationExecutor<ComMenu> {

}