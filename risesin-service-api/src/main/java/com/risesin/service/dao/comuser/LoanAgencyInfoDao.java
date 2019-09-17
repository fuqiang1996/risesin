package com.risesin.service.dao.comuser;

import com.risesin.service.modules.comuser.entity.LoanAgencyInfo;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * LoanAgencyInfo的Dao接口
 *
 * @author honey
 */
public interface LoanAgencyInfoDao extends Repository<LoanAgencyInfo, Long>, JpaSpecificationExecutor<LoanAgencyInfo> {

}