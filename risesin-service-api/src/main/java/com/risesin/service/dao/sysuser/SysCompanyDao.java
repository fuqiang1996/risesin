package com.risesin.service.dao.sysuser;
import java.util.List;

import com.risesin.service.modules.sysuser.SysCompany;
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