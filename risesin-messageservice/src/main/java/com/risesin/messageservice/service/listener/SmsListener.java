package com.risesin.messageservice.service.listener;

import com.risesin.messageservice.core.SmsUtil;
import com.risesin.messageservice.service.properties.SmsProperties;
import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @AUTHOR Darling
 * @CREATE 2019-10-08
 * @DESCRIPTION 短息监听类
 * @since 1.0.0
 */

@Component
@RabbitListener(queues = "sms")
public class SmsListener {
    @Autowired
    private SmsProperties smsProperties;

    /**
     * 发送验证码
     * @param mobile
     */
    @RabbitHandler
    public void sendSmsCode(String mobile){
        System.out.println("mobile:" + mobile);
        if (StringUtils.isBlank(mobile) || mobile.length() != 11 || !mobile.startsWith("1")) {
            System.out.println(mobile + "电话号码有误，不符合规范...");
        }
        boolean isSuccess = SmsUtil.sendSms(smsProperties, mobile);
        System.out.println("发送成功？:" + isSuccess);
    }


}
