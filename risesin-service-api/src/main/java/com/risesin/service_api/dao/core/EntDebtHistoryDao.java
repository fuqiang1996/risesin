package com.risesin.service_api.dao.core;

import com.risesin.service.modules.core.entity.EntDebtHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * debtHistory数据访问接口
 * @author Darling
 *
 */
public interface EntDebtHistoryDao extends JpaRepository<EntDebtHistory,Integer>,JpaSpecificationExecutor<EntDebtHistory>{
	
}
