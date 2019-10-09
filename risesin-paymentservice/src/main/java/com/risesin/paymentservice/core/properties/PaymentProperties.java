package com.risesin.paymentservice.core.properties;

import com.risesin.common.utils.date.LocalDateTimeUtils;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/8
 * @DESCRIPTION 配置信息
 * @since 1.0.0
 */
@Component
@Data
@RefreshScope
@ConfigurationProperties("risesin-properties.payment")
public class PaymentProperties {
    private String publicKey;
    private String privateKey;
    private String aliPublicKey; // ali 公钥
    private String appid; // Appid
    private String sign; // 商户签名
    private String signType; // 类型
    private String url; // 请求URL
    private String version = "1.0"; // 调用的接口版本，固定为：1.0
    private String timestamp; // 发送请求的时间，格式"yyyy-MM-dd HH:mm:ss"
    private String notify_url; // 支付宝服务器主动通知商户服务器里指定的页面http/https路径

    public String getTimestamp() {
        String currentDateTimeStr = LocalDateTimeUtils.getCurrentDateTimeStr();
        return currentDateTimeStr;
    }

    public void setTimestamp(String timestamp) {
        String currentDateTimeStr = LocalDateTimeUtils.getCurrentDateTimeStr();
        this.timestamp = currentDateTimeStr;
    }
}
