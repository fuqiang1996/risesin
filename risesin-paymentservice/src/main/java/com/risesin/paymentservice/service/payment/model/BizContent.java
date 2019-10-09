package com.risesin.paymentservice.service.payment.model;

import lombok.Data;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/8
 * @DESCRIPTION 请求参数
 * @since 1.0.0
 */
@Data
public class BizContent {
    public String body = "";
    public String subject = "";
    public String out_trade_no = "";
    public String timeout_express = "";
    public String total_amount = "";
    public String seller_id = "";
    public String product_code = "";
}
