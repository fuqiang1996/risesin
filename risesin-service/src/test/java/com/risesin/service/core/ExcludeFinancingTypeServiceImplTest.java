package com.risesin.service.core;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.ExcludeFinancingTypeServiceImpl;
import com.risesin.service_api.modules.core.entity.ExcludeFinancingType;
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
public class ExcludeFinancingTypeServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ExcludeFinancingTypeServiceImpl excludeFinancingTypeService;

    @Test
    public void findAll() {
        List<ExcludeFinancingType> all = excludeFinancingTypeService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ExcludeFinancingType serviceById = excludeFinancingTypeService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getExcludeId() == 1l);
    }

    @Test
    public void add() {
        ExcludeFinancingType bean = new ExcludeFinancingType();
        bean.setFinPlanId(3l);
        bean.setFinTypeId(1l);
        excludeFinancingTypeService.add(bean);

        Assert.assertTrue("查询信息为空",excludeFinancingTypeService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ExcludeFinancingType bean = new ExcludeFinancingType();
        bean.setFinPlanId(1l);
        bean.setFinTypeId(1l);
        bean.setExcludeId(1l);
        excludeFinancingTypeService.update(bean);

        ExcludeFinancingType byId = excludeFinancingTypeService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getFinPlanId().equals(1l));

    }


    @Test
    public void deleteById() {
        excludeFinancingTypeService.deleteById(1L);
        List<ExcludeFinancingType> channelDefinitionList = excludeFinancingTypeService.findAll();
        channelDefinitionList.forEach((ExcludeFinancingType bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getExcludeId() == 1L);
        });
    }
}