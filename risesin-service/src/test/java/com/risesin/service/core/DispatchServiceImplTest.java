package com.risesin.service.core;


import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.DispatchServiceImpl;
import com.risesin.service_api.modules.core.entity.Dispatch;
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
public class DispatchServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private DispatchServiceImpl dispatchService;

    @Test
    public void findAll() {
        List<Dispatch> all = dispatchService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        Dispatch serviceById = dispatchService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        Dispatch bean = new Dispatch();
        bean.setCommonUserId(2l);
        bean.setDispatchCode("asdf");
        bean.setDispatchDesc("aaaa");
        bean.setDelFlag(0l);
        dispatchService.add(bean);

        Assert.assertTrue("查询信息为空",dispatchService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        Dispatch bean = new Dispatch();
        bean.setCommonUserId(2l);
        bean.setDispatchCode("asdf");
        bean.setDispatchDesc("bbbb");
        bean.setDelFlag(0l);
        bean.setId(1l);
        dispatchService.update(bean);

        Dispatch byId = dispatchService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getDispatchDesc().equals("bbbb"));

    }


    @Test
    public void deleteById() {
        dispatchService.deleteById(1L);
        List<Dispatch> channelDefinitionList = dispatchService.findAll();
        channelDefinitionList.forEach((Dispatch bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getId() == 1L);
        });
    }
}