package com.risesin.service_api.dao.servicePack;

import com.risesin.service_api.modules.servicePack.entity.UserPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * UserPackage的Dao接口
 *
 * @author honey
 */
public interface UserPackageDao extends JpaRepository<UserPackage, Long>, JpaSpecificationExecutor<UserPackage> {

}