package com.risesin.messageservice.sms;

import com.risesin.messageservice.MessageServiceApplicationTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @AUTHOR Darling
 * @CREATE 2019-10-08
 * @DESCRIPTION 短信测试类
 * @since 1.0.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SmsTest extends MessageServiceApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void sendSmsCode(){
        //试用记得给我打钱（4毛5/次）
        rabbitTemplate.convertAndSend("sms","1752131501");
    }
}
