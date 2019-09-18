package com.risesin.service.commonuser;


import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.commonuser.serviceImpl.ChannelDefinitionServiceImpl;
import com.risesin.service_api.modules.comuser.entity.ChannelDefinition;
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
public class ChannelDefinitionServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ChannelDefinitionServiceImpl channelDefinitionService;

    @Test
    public void findAll() {
        List<ChannelDefinition> all = channelDefinitionService.findAll();
        Assert.assertTrue("查找所有信息",all.size() >=0 );
    }

    @Test
    public void findSearch() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void add() {
    }

    @Test
    public void update() {
    }

    @Test
    public void testAdd() {
    }

    @Test
    public void testUpdate() {
    }

    @Test
    public void deleteById() {
    }
}