package com.risesin.service.dict;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.TodotaskServiceImpl;
import com.risesin.service.modules.dict.RisesinDictServiceImpl;
import com.risesin.service_api.modules.core.entity.Todotask;
import com.risesin.service_api.modules.dict.RisesinDict;
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
public class RisesinDictServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private RisesinDictServiceImpl risesinDictService;

    @Test
    public void findAll() {
        List<RisesinDict> all = risesinDictService.findAll();
        Assert.assertTrue("查询信息为空", all.size() >= 0);
    }

    @Test
    public void findById() {
        RisesinDict serviceById = risesinDictService.findById(21L);
        Assert.assertTrue("根据id查询实体为空", serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        RisesinDict bean = new RisesinDict();
//        bean.setAssignCode("2l");
        bean.setCode("sex");
        bean.setDictValue("性别");
        bean.setDictKey(-1L);
//        bean.setActProjectId(3l);
//        bean.setTaskName("nice");
//        bean.setTaskState("3");
        risesinDictService.add(bean);

        Assert.assertTrue("查询信息为空", risesinDictService.findAll().size() >= 1);
    }

    @Test
    public void update() {
        RisesinDict bean = risesinDictService.findById(21L);
        if (bean != null) {
            bean.setCode("sex2");
            bean.setDictValue("性别2");
            bean.setDictKey(-1L);
        }
        risesinDictService.update(bean);
    }


    @Test
    public void deleteById() {
        risesinDictService.deleteById(21L);
//        List<RisesinDict> channelDefinitionList = risesinDictService.findAll();
//        channelDefinitionList.forEach((RisesinDict bean) -> {
//            Assert.assertTrue("根据ID删除失败", bean.getId() == 1L);
//        });
    }
}