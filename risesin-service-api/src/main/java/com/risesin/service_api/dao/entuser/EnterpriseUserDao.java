package com.risesin.service_api.dao.entuser;

import com.risesin.service_api.modules.entuser.entity.EnterpriseUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * EnterpriseUser的Dao接口
 *
 * @author honey
 */
public interface EnterpriseUserDao extends JpaRepository<EnterpriseUser, Long>, JpaSpecificationExecutor<EnterpriseUser> {

    @Override
    @Query("update EnterpriseUser t set t.delFlag = -1 where t.id = :id")
    @Modifying
    void deleteById(@Param("id") Long id);
}