package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* SysCompany的Dao接口
*
* @author honey
*
*/
public interface SysCompanyDao extends JpaRepository<SysCompany, Long>, JpaSpecificationExecutor<SysCompany> {

}