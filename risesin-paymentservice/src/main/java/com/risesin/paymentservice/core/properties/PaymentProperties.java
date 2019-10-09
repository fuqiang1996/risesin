package com.risesin.paymentservice.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/8
 * @DESCRIPTION 配置信息
 * @since 1.0.0
 */
@Component
@Data
//@ConfigurationProperties("risesin-properties.payment")
public class PaymentProperties {
    private String publicKey;
    private String privateKey;
    private String aliPublicKey;
    private String appid;
    private String signType;
}
