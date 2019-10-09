package com.risesin.paymentservice.service.alipayment.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import com.risesin.common.utils.fastJson.JsonUtils;
import com.risesin.paymentservice.core.properties.PaymentProperties;
import com.risesin.paymentservice.core.utils.AlipayClientUtil;
import com.risesin.paymentservice.service.alipayment.PaymentService;
import com.risesin.paymentservice.service.alipayment.model.PayRequest;
import com.risesin.paymentservice.service.alipayment.model.PayResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/8
 * @DESCRIPTION 支付服务
 * @since 1.0.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    // 支付宝服务器主动通知商户服务器里指定的页面http/https路径。
    private static final String ALI_PAY_NOTIFY_URL = "http://localhost:9010/api/service/payment/notify";
    // 支付宝服务器返回路径
    private static final String ALI_PAY_RETURN_URL = "http://localhost:9010/api/service/payment/return"; //
    private static final String ALI_PAY_VERSION = "1.0"; // 调用的接口版本，固定为：1.0


    @Autowired
    private PaymentProperties paymentProperties;

    @Override
    public PayResponse pay(PayRequest payRequest) {
        if(Objects.isNull(payRequest)){
            // TODO 抛出异常
        }
        AlipayClient alipayClient = AlipayClientUtil.getAlipayClient();
        AlipayTradePagePayRequest alipayTradePagePayRequest = getAlipayTradePagePayRequest(payRequest);
        try {
            AlipayTradePagePayResponse response = alipayClient.pageExecute(alipayTradePagePayRequest);
            if(response.isSuccess()){
                System.out.println("调用成功");
            } else {
                System.out.println("调用失败");
            }
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取支付request
     * @return
     */
    public AlipayTradePagePayRequest getAlipayTradePagePayRequest(PayRequest payRequest){
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        request.setApiVersion(ALI_PAY_VERSION);
        request.setNotifyUrl(ALI_PAY_NOTIFY_URL);
        request.setReturnUrl(ALI_PAY_RETURN_URL);
        request.setBizContent(JsonUtils.convertObjectToJSON(payRequest));
        return request;
    }
}
