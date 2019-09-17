package com.risesin.service.dao.servicePack;

import java.util.List;

import com.risesin.service.modules.servicePack.entity.UserPackage;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * UserPackage的Dao接口
 *
 * @author honey
 */
public interface UserPackageDao extends Repository<UserPackage, Long>, JpaSpecificationExecutor<UserPackage> {

}