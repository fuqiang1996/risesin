package com.risesin.paymentservice.service.alipayment.model;

import com.risesin.paymentservice.core.groups.QueryGroup;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/9
 * @DESCRIPTION 查询支付请求信息  BizContent
 * @since 1.0.0
 */
@Data
public class QueryPayRequest {
    @NotEmpty( message = "支付宝交易号不为空", groups = QueryGroup.class)
    private String trade_no ; // 支付宝交易号，和商户订单号不能同时为空
    private String query_options ; // 查询选项，商户通过上送该字段来定制查询返回信息 可为空
}
