package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ComBranchCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* ComBranchCompany的Dao接口
*
* @author honey
*
*/
public interface ComBranchCompanyDao extends JpaRepository<ComBranchCompany, Long>, JpaSpecificationExecutor<ComBranchCompany> {
    @Override
    @Query("update ComBranchCompany c set c.delFlag = -1 where c.id = :id")
    @Modifying
    void deleteById(@Param("id") Long id);
}