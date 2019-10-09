package com.risesin.paymentservice.service.alipayment.model;

import lombok.Data;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/9
 * @DESCRIPTION 基础请求支付信息
 * @since 1.0.0
 */
@Data
public class BasePayRequest {
    private String out_trade_no; // 商户订单号,订单支付时传入的商户订单号,和支付宝交易号不能同时为空。
}
