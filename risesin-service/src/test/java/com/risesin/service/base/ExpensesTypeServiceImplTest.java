package com.risesin.service.base;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.base.serviceImpl.ExpensesTypeServiceImpl;
import com.risesin.service_api.modules.base.entity.ExpensesType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ExpensesTypeServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ExpensesTypeServiceImpl expensesTypeService;

    private ExpensesType expensesType;

    @Before
    public void setUp() {
        expensesType = new ExpensesType();
    }

    @Test
    public void findAll() {
        List<ExpensesType> all = expensesTypeService.findAll();
        Assert.assertNotNull(all);
    }

    @Test
    public void findById() {
        ExpensesType byId = expensesTypeService.findById(1L);
        Assert.assertNotNull(byId);
    }

    @Test
    public void add() {
        expensesType.setExpTypeCode("code");
        expensesType.setExpTypeName("name");
        expensesTypeService.add(expensesType);
    }

    @Test
    public void update() {
        expensesType.setExpTypeCode("code2");
        expensesType.setExpTypeName("name2");
        expensesType.setId(1L);
        expensesTypeService.add(expensesType);
    }

    @Test
    public void deleteById() {
        expensesTypeService.deleteById(1L);
    }
}