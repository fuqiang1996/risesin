package com.risesin.paymentservice.service.alipayment.impl;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.risesin.paymentservice.core.utils.AlipayClientUtil;
import com.risesin.paymentservice.service.alipayment.PaymentService;
import com.risesin.paymentservice.service.alipayment.model.PayRequest;
import com.risesin.paymentservice.service.alipayment.model.PayResponse;
import org.springframework.stereotype.Service;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/8
 * @DESCRIPTION 支付服务
 * @since 1.0.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    private static final String ALI_PAY_METHOD = "alipay.trade.page.pay";
    private static final String ALI_PAY_QUERY_METHOD = "alipay.trade.query";

    @Override
    public PayResponse pay(PayRequest payRequest) {
        AlipayClient alipayClient = AlipayClientUtil.getAlipayClient();


        return null;
    }

    public AlipayTradePagePayRequest getAlipayTradePagePayRequest(){
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        return request;
    }
}
