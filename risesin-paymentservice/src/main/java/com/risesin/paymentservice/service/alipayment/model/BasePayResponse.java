package com.risesin.paymentservice.service.alipayment.model;

import lombok.Data;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/9
 * @DESCRIPTION 基础返回信息
 * @since 1.0.0
 */
@Data
public class BasePayResponse {
    // 公共响应
    private String code; // 网关返回码
    private String msg; // 网关返回码描述
    private String sign; // 签名
    private String sub_code; // 业务返回码
    private String sub_msg; // 业务返回码描述

    private String trade_no; // 支付宝交易号
    private String out_trade_no; // 商户订单号
    private String total_amount; // 交易金额
}
