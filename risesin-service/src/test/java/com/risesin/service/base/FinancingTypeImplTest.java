package com.risesin.service.base;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.base.serviceImpl.ExpensesTypeServiceImpl;
import com.risesin.service.modules.base.serviceImpl.FinancingTypeServiceImpl;
import com.risesin.service_api.modules.base.entity.ExpensesType;
import com.risesin.service_api.modules.base.entity.FinancingType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FinancingTypeImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private FinancingTypeServiceImpl financingTypeService;

    private FinancingType financingType;

    @Before
    public void setUp() {
        financingType = new FinancingType();
    }

    @Test
    public void findAll() {
        List<FinancingType> all = financingTypeService.findAll();
        Assert.assertNotNull(all);
    }

    @Test
    public void findById() {
        FinancingType byId = financingTypeService.findById(1L);
        Assert.assertNotNull(byId);
    }

    @Test
    public void add() {
        financingType.setFinTypeName("typeName");
        financingType.setFinTypeUrl("url");
        financingTypeService.add(financingType);
    }

    @Test
    public void update() {
        financingType.setFinTypeName("typeName2");
        financingType.setFinTypeUrl("url2");
        financingType.setId(1L);
        financingTypeService.add(financingType);
    }

    @Test
    public void deleteById() {
        financingTypeService.deleteById(1L);
    }
}