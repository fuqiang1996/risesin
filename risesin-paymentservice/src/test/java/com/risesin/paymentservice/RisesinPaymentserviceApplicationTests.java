package com.risesin.paymentservice;

import com.risesin.paymentservice.service.payment.model.BizContent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RisesinPaymentserviceApplicationTests {

    private int i =2;
    private String str = "aa";
    private Integer i1 = 2;


    @Test
    public void contextLoads() {
        method(i);
        method(i1);
        method(str);
        System.out.println(i);
        System.out.println(i1);
        System.out.println(str);
    }

    public void method(int i){
        i = 555;
    }
    public void method(Integer i){
        i = 666;
    }
    public void method(String i){
        i = "sdf";
    }
}
