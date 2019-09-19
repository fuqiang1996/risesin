package com.risesin.service.core;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.TasLogServiceImpl;
import com.risesin.service_api.modules.core.entity.TasLog;
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
public class TasLogServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private TasLogServiceImpl tasLogService;

    @Test
    public void findAll() {
        List<TasLog> all = tasLogService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        TasLog serviceById = tasLogService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getTaskLogId() == 1l);
    }

    @Test
    public void add() {
        TasLog bean = new TasLog();
        bean.setTaskLogCode("2l");
        bean.setTaskLogOperation("3l");
        bean.setTodoTaskId(3l);
        tasLogService.add(bean);

        Assert.assertTrue("查询信息为空",tasLogService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        TasLog bean = new TasLog();
        bean.setTaskLogCode("aaa");
        bean.setTaskLogOperation("3l");
        bean.setTodoTaskId(3l);
        bean.setTaskLogId(1l);
        tasLogService.update(bean);

        TasLog byId = tasLogService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getTaskLogCode().equals("aaa"));

    }


    @Test
    public void deleteById() {
        tasLogService.deleteById(1L);
        List<TasLog> channelDefinitionList = tasLogService.findAll();
        channelDefinitionList.forEach((TasLog bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getTaskLogId() == 1L);
        });
    }
}