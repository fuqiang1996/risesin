package com.risesin.service_api.dao.pay;

import com.risesin.service_api.modules.pay.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* Payment的Dao接口
*
* @author honey
*
*/
public interface PaymentDao extends JpaRepository<Payment, Long>, JpaSpecificationExecutor<Payment> {

}