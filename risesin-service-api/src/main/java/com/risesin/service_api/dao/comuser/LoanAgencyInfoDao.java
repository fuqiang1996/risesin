package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.LoanAgencyInfo;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * LoanAgencyInfo的Dao接口
 *
 * @author honey
 */
public interface LoanAgencyInfoDao extends Repository<LoanAgencyInfo, Long>, JpaSpecificationExecutor<LoanAgencyInfo> {

}