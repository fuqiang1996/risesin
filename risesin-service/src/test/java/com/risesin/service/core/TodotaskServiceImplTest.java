package com.risesin.service.core;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.TodotaskServiceImpl;
import com.risesin.service_api.modules.core.entity.Todotask;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @AUTHOR Baby
 * @CREATE 2019/9/18
 * @DESCRIPTION 测试
 * @since 1.0.0
 */
public class TodotaskServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private TodotaskServiceImpl todotaskService;

    @Test
    public void findAll() {
        List<Todotask> all = todotaskService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        Todotask serviceById = todotaskService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        Todotask bean = new Todotask();
        bean.setAssignCode("2l");
        bean.setTaskCode("3l");
        bean.setActProjectId(3l);
        bean.setTaskName("nice");
        bean.setTaskState("3");
        todotaskService.add(bean);

        Assert.assertTrue("查询信息为空",todotaskService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        Todotask bean = new Todotask();
        bean.setAssignCode("2l");
        bean.setTaskCode("3l");
        bean.setActProjectId(3l);
        bean.setTaskName("aaa");
        bean.setTaskState("3");
        bean.setId(1l);
        todotaskService.update(bean);

        Todotask byId = todotaskService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getTaskName().equals("aaa"));

    }


    @Test
    public void deleteById() {
        todotaskService.deleteById(1L);
        List<Todotask> channelDefinitionList = todotaskService.findAll();
        channelDefinitionList.forEach((Todotask bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getId() == 1L);
        });
    }
}