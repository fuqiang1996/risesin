package com.risesin.service.dao.comuser;

import com.risesin.service.modules.comuser.entity.ComBranchCompany;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* ComBranchCompany的Dao接口
*
* @author honey
*
*/
public interface ComBranchCompanyDao extends Repository<ComBranchCompany, Long>, JpaSpecificationExecutor<ComBranchCompany> {

}