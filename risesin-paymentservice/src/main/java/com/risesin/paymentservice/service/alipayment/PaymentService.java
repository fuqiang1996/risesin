package com.risesin.paymentservice.service.alipayment;

import com.risesin.paymentservice.service.alipayment.model.PayRequest;
import com.risesin.paymentservice.service.alipayment.model.PayResponse;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/8
 * @DESCRIPTION 支付服务接口
 * @since 1.0.0
 */
public interface PaymentService {

    /**
     * 支付
     * @return
     */
    PayResponse pay(PayRequest payRequest);
}
