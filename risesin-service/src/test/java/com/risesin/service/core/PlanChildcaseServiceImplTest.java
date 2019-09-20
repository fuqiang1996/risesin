package com.risesin.service.core;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.PlanChildcaseServiceImpl;
import com.risesin.service_api.modules.core.entity.PlanChildcase;
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
public class PlanChildcaseServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private PlanChildcaseServiceImpl planChildcaseService;

    @Test
    public void findAll() {
        List<PlanChildcase> all = planChildcaseService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        PlanChildcase serviceById = planChildcaseService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        PlanChildcase bean = new PlanChildcase();
        bean.setEntId(2l);
        bean.setPlanId(0l);
        bean.setRepId(2l);
        bean.setStockolderId(123l);
        planChildcaseService.add(bean);

        Assert.assertTrue("查询信息为空",planChildcaseService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        PlanChildcase bean = new PlanChildcase();
        bean.setEntId(3l);
        bean.setPlanId(0l);
        bean.setRepId(2l);
        bean.setStockolderId(123l);
        bean.setId(1l);
        planChildcaseService.update(bean);

        PlanChildcase byId = planChildcaseService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getEntId().equals(3l));

    }


    @Test
    public void deleteById() {
        planChildcaseService.deleteById(1L);
        List<PlanChildcase> channelDefinitionList = planChildcaseService.findAll();
        channelDefinitionList.forEach((PlanChildcase bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getRepId() == 1L);
        });
    }
}