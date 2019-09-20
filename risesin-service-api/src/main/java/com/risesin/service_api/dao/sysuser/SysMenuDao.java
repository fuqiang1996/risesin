package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* SysMenu的Dao接口
*
* @author honey
*
*/
public interface SysMenuDao extends JpaRepository<SysMenu, Long>, JpaSpecificationExecutor<SysMenu> {

    @Override
    @Modifying
    @Query("update SysMenu m set m.delFlag = -1 where m.id = :id")
    void deleteById(@Param("id") Long id);

}