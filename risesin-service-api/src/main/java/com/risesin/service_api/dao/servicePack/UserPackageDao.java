package com.risesin.service_api.dao.servicePack;

import com.risesin.service_api.modules.servicePack.entity.UserPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * UserPackage的Dao接口
 *
 * @author honey
 */
public interface UserPackageDao extends JpaRepository<UserPackage, Long>, JpaSpecificationExecutor<UserPackage> {

    @Override
    @Modifying
    @Query("update UserPackage u set u.delFlag = -1 where u.id = :id")
    void deleteById(@Param("id") Long id);
}