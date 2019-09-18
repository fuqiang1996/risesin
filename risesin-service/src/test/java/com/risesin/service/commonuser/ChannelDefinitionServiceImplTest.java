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

import java.util.Date;
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
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ChannelDefinition serviceById = channelDefinitionService.findById(3L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 3l);
    }

    @Test
    public void add() {
        ChannelDefinition channelDefinition = new ChannelDefinition();
        channelDefinition.setChaDefAddtime(new Date());
        channelDefinition.setChaDefCode("123");
        channelDefinition.setChaDefName("中汇");

        channelDefinitionService.add(channelDefinition);
        Assert.assertTrue("查询信息为空",channelDefinitionService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ChannelDefinition channelDefinition = new ChannelDefinition();
        channelDefinition.setChaDefAddtime(new Date());
        channelDefinition.setChaDefCode("123");
        channelDefinition.setChaDefName("短信");
        channelDefinition.setId(1L);
        channelDefinitionService.update(channelDefinition);
    }


    @Test
    public void deleteById() {
        channelDefinitionService.deleteById(3L);
        List<ChannelDefinition> channelDefinitionList = channelDefinitionService.findAll();
        channelDefinitionList.forEach((ChannelDefinition channelDefinition)->{
            Assert.assertTrue("根据ID删除失败",channelDefinition.getId() == 3L);
        });
    }
}