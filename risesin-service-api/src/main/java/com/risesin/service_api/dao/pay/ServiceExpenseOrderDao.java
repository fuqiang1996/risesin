package com.risesin.service_api.dao.pay;

import com.risesin.service_api.modules.pay.entity.ServiceExpenseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * ProjectExpenseOrder数据访问接口
 * @author Darling
 *
 */
public interface ServiceExpenseOrderDao extends JpaRepository<ServiceExpenseOrder,Long>,JpaSpecificationExecutor<ServiceExpenseOrder>{
    @Override
    @Query("update ServiceExpenseOrder t set t.delFlag = -1 where t.id = :id")
    @Modifying
    void deleteById(@Param("id") Long id);
}
