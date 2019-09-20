package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* SysCompany的Dao接口
*
* @author honey
*
*/
public interface SysCompanyDao extends JpaRepository<SysCompany, Long>, JpaSpecificationExecutor<SysCompany> {

    @Override
    @Modifying
    @Query("update SysCompany c set c.delFlag = -1 where c.id = :id")
    void deleteById(@Param("id") Long id);
}