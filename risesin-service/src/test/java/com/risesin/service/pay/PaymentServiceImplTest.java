package com.risesin.service.pay;


import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.pay.serviceImpl.PaymentServiceImpl;
import com.risesin.service_api.modules.pay.entity.Payment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PaymentServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private PaymentServiceImpl paymentService;

    @Test
    public void findAll() {
        List<Payment> all = paymentService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        Payment serviceById = paymentService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        Payment bean = new Payment();
        bean.setPayCode("2l");
        bean.setPayMethod("3l");
        bean.setOrderId(0l);
        bean.setPayMethod("nice");
        paymentService.add(bean);

        Assert.assertTrue("查询信息为空",paymentService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        Payment bean = new Payment();
        bean.setPayCode("2l");
        bean.setPayMethod("3l");
        bean.setOrderId(0l);
        bean.setPayMethod("aaa");
        bean.setId(1l);
        paymentService.update(bean);

        Payment byId = paymentService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getPayMethod().equals("aaa"));

    }


    @Test
    public void deleteById() {
        paymentService.deleteById(1L);
        List<Payment> channelDefinitionList = paymentService.findAll();
        channelDefinitionList.forEach((Payment bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getId() == 1L);
        });
    }
}