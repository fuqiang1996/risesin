package com.risesin.service.pay;


import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.pay.serviceImpl.ProjectExpenseOrderServiceImpl;
import com.risesin.service_api.modules.pay.entity.ProjectExpenseOrder;
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
public class ProjectExpenseOrderServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ProjectExpenseOrderServiceImpl projectExpenseOrderService;

    @Test
    public void findAll() {
        List<ProjectExpenseOrder> all = projectExpenseOrderService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ProjectExpenseOrder serviceById = projectExpenseOrderService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        ProjectExpenseOrder bean = new ProjectExpenseOrder();
        bean.setCommodityName("2l");
        bean.setProOrderCode("3l");
        bean.setProjectId(0l);
        bean.setProOrderRemark("nice");
        bean.setProOrderStatus(1l);
        projectExpenseOrderService.add(bean);

        Assert.assertTrue("查询信息为空",projectExpenseOrderService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ProjectExpenseOrder bean = new ProjectExpenseOrder();
        bean.setCommodityName("2l");
        bean.setProOrderCode("3l");
        bean.setProjectId(0l);
        bean.setProOrderRemark("aaa");
        bean.setProOrderStatus(1l);
        bean.setId(1l);
        projectExpenseOrderService.update(bean);

        ProjectExpenseOrder byId = projectExpenseOrderService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getProOrderRemark().equals("aaa"));

    }


    @Test
    public void deleteById() {
        projectExpenseOrderService.deleteById(1L);
        List<ProjectExpenseOrder> channelDefinitionList = projectExpenseOrderService.findAll();
        channelDefinitionList.forEach((ProjectExpenseOrder bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getId() == 1L);
        });
    }
}