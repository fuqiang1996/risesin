package com.risesin.paymentservice.core.constant;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/9
 * @DESCRIPTION ali业务错误码
 * @since 1.0.0
 */
public enum TradeStatus {

    TRADE_CLOSED("TRADE_CLOSED"),  // 交易关闭
    TRADE_FINISHED("TRADE_FINISHED"), // 交易完结
    TRADE_SUCCESS("TRADE_SUCCESS"), // 支付成功
    WAIT_BUYER_PAY("WAIT_BUYER_PAY"); // 支付创建

    TradeStatus(String status){
        this.status = status;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
