package com.risesin.paymentservice.service.alipayment.model;

import lombok.Data;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/9
 * @DESCRIPTION 支付请求信息 BizContent
 * @since 1.0.0
 */
@Data
public class PayRequest extends BasePayRequest{
    // 支付时字段
    private String body = ""; // 订单描述
    private String subject = "";  // 订单标题
    private String timeout_express = ""; // 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
    private String total_amount = ""; // 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
    private String product_code = ""; // 销售产品码，与支付宝签约的产品码名称。注：目前仅支持FAST_INSTANT_TRADE_PAY
    private String store_id = ""; // 商户门店号
}
