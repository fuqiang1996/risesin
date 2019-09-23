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

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        List<ChannelDefinition> all = channelDefinitionService.findAll();
        all.forEach(System.out::println);
        System.out.println(all.get(0).getChaDefAddtime().format(dateTimeFormatter));
        System.out.println(all.get(1).getChaDefAddtime().format(dateTimeFormatter));
        LocalDateTime chaDefAddtime = all.get(1).getChaDefAddtime();
//        Instant instant = chaDefAddtime.atZone(ZoneId.systemDefault()).toInstant();
//        System.out.println(instant.toEpochMilli());

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
        channelDefinition.setChaDefAddtime(LocalDateTime.now());
        channelDefinition.setChaDefCode("123");
        channelDefinition.setChaDefName("测试2");

        channelDefinitionService.add(channelDefinition);
        Assert.assertTrue("查询信息为空",channelDefinitionService.findAll().size() >=1 );
    }

    @Test
    public void add_Instant(){
        ChannelDefinition channelDefinition = new ChannelDefinition();
        channelDefinition.setChaDefCode("123");
        channelDefinition.setChaDefName("测试");

        channelDefinitionService.add(channelDefinition);
        Assert.assertTrue("查询信息为空",channelDefinitionService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ChannelDefinition channelDefinition = new ChannelDefinition();
        channelDefinition.setChaDefAddtime(LocalDateTime.now());
        channelDefinition.setChaDefCode("123");
        channelDefinition.setChaDefName("短信");
        channelDefinition.setId(5L);
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