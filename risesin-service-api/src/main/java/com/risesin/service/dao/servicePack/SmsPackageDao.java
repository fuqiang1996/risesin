package com.risesin.service.dao.servicePack;

import java.util.List;

import com.risesin.service.modules.servicePack.entity.SmsPackage;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * SmsPackage的Dao接口
 *
 * @author honey
 */
public interface SmsPackageDao extends Repository<SmsPackage, Long>, JpaSpecificationExecutor<SmsPackage> {

}