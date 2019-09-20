package com.risesin.service_api.dao.pay;

import com.risesin.service_api.modules.pay.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* Payment的Dao接口
*
* @author honey
*
*/
public interface PaymentDao extends JpaRepository<Payment, Long>, JpaSpecificationExecutor<Payment> {
    @Override
    @Query("update Payment t set t.delFlag = -1 where t.id = :id")
    @Modifying
    void deleteById(@Param("id") Long id);
}