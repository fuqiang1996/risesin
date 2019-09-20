package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ComMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * ComMenu的Dao接口
 *
 * @author honey
 */
public interface ComMenuDao extends JpaRepository<ComMenu, Long>, JpaSpecificationExecutor<ComMenu> {

    @Override
    @Query("update ComMenu c set c.delFlag = -1 where c.id = :id")
    @Modifying
    void deleteById(@Param("id") Long id);
}