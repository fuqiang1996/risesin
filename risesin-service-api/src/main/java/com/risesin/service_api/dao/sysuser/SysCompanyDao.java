package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysCompany;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysCompany的Dao接口
*
* @author honey
*
*/
public interface SysCompanyDao extends Repository<SysCompany, Long>, JpaSpecificationExecutor<SysCompany> {

}