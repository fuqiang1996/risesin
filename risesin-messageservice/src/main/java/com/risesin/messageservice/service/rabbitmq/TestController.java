package com.risesin.messageservice.service.rabbitmq;

import com.risesin.common.vo.resultVo.R;
import com.risesin.messageservice.service.rabbitmq.entity.TestUser;
import com.risesin.messageservice.service.rabbitmq.productor.RabbitSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @AUTHOR Baby
 * @CREATE 2019/9/30
 * @DESCRIPTION 测试接口
 * @since 1.0.0
 */
@RestController
public class TestController {

    @Autowired
    private RabbitSender rabbitSender;

    @RequestMapping("/api/msg/rabbit/send")
    public R<TestUser> send(){
        TestUser testUser = new TestUser();
        testUser.setAge(12).setName("Baby").setLocalDateTime(LocalDateTime.now());
        rabbitSender.send();
        return new R(testUser);
    }
}
