package com.risesin.service.pay;


import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.pay.serviceImpl.ServiceExpenseOrderServiceImpl;
import com.risesin.service_api.modules.pay.entity.ServiceExpenseOrder;
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
public class ServiceExpenseOrderServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ServiceExpenseOrderServiceImpl serviceExpenseOrderService;

    @Test
    public void findAll() {
        List<ServiceExpenseOrder> all = serviceExpenseOrderService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ServiceExpenseOrder serviceById = serviceExpenseOrderService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getSerOrderId() == 1l);
    }

    @Test
    public void add() {
        ServiceExpenseOrder bean = new ServiceExpenseOrder();
        bean.setCommodityName("2l");
        bean.setCommodityUrl("3l");
        bean.setCommodityNum(0l);
        bean.setSerOrderCode("nice");
        bean.setSerOrderStatus(1l);
        serviceExpenseOrderService.add(bean);

        Assert.assertTrue("查询信息为空",serviceExpenseOrderService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ServiceExpenseOrder bean = new ServiceExpenseOrder();
        bean.setCommodityName("2l");
        bean.setCommodityUrl("3l");
        bean.setCommodityNum(0l);
        bean.setSerOrderCode("aaa");
        bean.setSerOrderStatus(1l);
        bean.setSerOrderId(1l);
        serviceExpenseOrderService.update(bean);

        ServiceExpenseOrder byId = serviceExpenseOrderService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getSerOrderCode().equals("aaa"));

    }


    @Test
    public void deleteById() {
        serviceExpenseOrderService.deleteById(1L);
        List<ServiceExpenseOrder> channelDefinitionList = serviceExpenseOrderService.findAll();
        channelDefinitionList.forEach((ServiceExpenseOrder bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getSerOrderId() == 1L);
        });
    }
}