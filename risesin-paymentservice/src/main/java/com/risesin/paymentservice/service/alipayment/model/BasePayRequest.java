package com.risesin.paymentservice.service.alipayment.model;

import com.risesin.paymentservice.core.groups.PayGroup;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/9
 * @DESCRIPTION 基础请求支付信息
 * @since 1.0.0
 */
@Data
public class BasePayRequest {
    @NotNull(message = "商户订单号不能为空" , groups = PayGroup.class)
    private String out_trade_no; // 商户订单号,订单支付时传入的商户订单号,和支付宝交易号不能同时为空。
}
