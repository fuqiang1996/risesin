package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.LoanAgencyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * LoanAgencyInfo的Dao接口
 *
 * @author honey
 */
public interface LoanAgencyInfoDao extends JpaRepository<LoanAgencyInfo, Long>, JpaSpecificationExecutor<LoanAgencyInfo> {

}