package com.risesin.service_api.dao.pay;

import com.risesin.service.modules.pay.entity.ProjectExpenseOrder;
import com.risesin.service.modules.pay.entity.ServiceExpenseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ProjectExpenseOrder数据访问接口
 * @author Darling
 *
 */
public interface ServiceExpenseOrderDao extends JpaRepository<ServiceExpenseOrder,Long>,JpaSpecificationExecutor<ProjectExpenseOrder>{
	
}
