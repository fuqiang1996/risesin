package com.risesin.service.commonuser;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.commonuser.serviceImpl.ComLogServiceImpl;
import com.risesin.service_api.modules.comuser.entity.ComLog;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class ComLogServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ComLogServiceImpl comLogService;

    @Test
    public void findAll() {
        List<ComLog> all = comLogService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ComLog serviceById = comLogService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        ComLog comLog = new ComLog();
        comLog.setAddTime(new Date());
        comLog.setIp("123");
        comLog.setMethod("save");
        comLog.setOperation("bbb");
        comLog.setUsername("bbbb");

        comLogService.add(comLog);
        Assert.assertTrue("查询信息为空",comLogService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ComLog comLog = new ComLog();
        comLog.setAddTime(new Date());
        comLog.setIp("123");
        comLog.setMethod("save");
        comLog.setOperation("bbb");
        comLog.setUsername("aaaa");
        comLog.setId(1l);

        comLogService.update(comLog);

        ComLog byId = comLogService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getUsername().equals("aaaa"));

    }


    @Test
    public void deleteById() {
        comLogService.deleteById(1L);
        List<ComLog> channelDefinitionList = comLogService.findAll();
        channelDefinitionList.forEach((ComLog comLog)->{
            Assert.assertTrue("根据ID删除失败",comLog.getId() == 1L);
        });
    }
}