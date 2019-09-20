package com.risesin.service_api.dao.servicePack;

import com.risesin.service_api.modules.servicePack.entity.SmsPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * SmsPackage的Dao接口
 *
 * @author honey
 */
public interface SmsPackageDao extends JpaRepository<SmsPackage, Long>, JpaSpecificationExecutor<SmsPackage> {

    @Override
    @Modifying
    @Query("update SmsPackage s set s.delFlag = -1 where s.id = :id")
    void deleteById(@Param("id") Long id);
}