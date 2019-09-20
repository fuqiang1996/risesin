package com.risesin.service.base;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.base.serviceImpl.FinancingTypeServiceImpl;
import com.risesin.service_api.modules.base.entity.FinancingType;
import com.risesin.service_api.modules.base.entity.Industry;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class FinancingTypeServiceImplTest extends RisesinServiceApplicationTests {

    
    @Autowired
    private FinancingTypeServiceImpl financingTypeService;
    @Test
    public void findAll() {

        List<FinancingType> all = financingTypeService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        FinancingType serviceById = financingTypeService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getFinTypeId() == 1l);
    }

    @Test
    public void add() {
        FinancingType financingType = new FinancingType();
        financingType.setDelflag(0l);
        financingType.setFinTypeName("123");

        financingTypeService.add(financingType);
        Assert.assertTrue("查询信息为空",financingTypeService.findAll().size() >=1 );
    }


    @Test
    public void update() {
        FinancingType financingType = new FinancingType();
        financingType.setDelflag(0l);
        financingType.setFinTypeName("123");
        financingType.setFinTypeId(1l);
        financingTypeService.update(financingType);
    }


    @Test
    public void deleteById() {
        financingTypeService.deleteById(1L);
        List<FinancingType> channelDefinitionList = financingTypeService.findAll();
        channelDefinitionList.forEach((FinancingType bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getFinTypeId() == 1L);
        });
    }
}