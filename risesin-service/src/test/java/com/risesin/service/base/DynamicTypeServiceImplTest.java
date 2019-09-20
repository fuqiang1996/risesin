package com.risesin.service.base;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.base.serviceImpl.DynamicTypeServiceImpl;
import com.risesin.service_api.modules.base.entity.DynamicType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class DynamicTypeServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private DynamicTypeServiceImpl dynamicTypeService;

    private DynamicType type;

    @Before
    public void setUp() throws Exception {
        type = new DynamicType();
    }

    @Test
    public void findAll() {
        List<DynamicType> all = dynamicTypeService.findAll();
        Assert.assertNotNull(all);
    }

    @Test
    public void findSearch() {
    }

    @Test
    public void testFindSearch() {
    }

    @Test
    public void findById() {
        DynamicType byId = dynamicTypeService.findById(1L);
        Assert.assertNotNull(byId);
    }

    @Test
    public void add() {
        type.setDynTypeCode("code");
        type.setDynTypeId(1L);
        type.setDynTypeName("name");
        dynamicTypeService.add(type);
    }

    @Test
    public void update() {
        type.setDynTypeCode("code");
        type.setDynTypeId(1L);
        type.setDynTypeName("name");
        dynamicTypeService.update(type);
    }

    @Test
    public void deleteById() {
    }
}