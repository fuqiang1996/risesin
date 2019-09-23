package com.risesin.service.base;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.base.serviceImpl.DynamicServiceImpl;
import com.risesin.service_api.modules.base.entity.Dynamic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

import static org.junit.Assert.*;

public class DynamicServiceImplTest extends RisesinServiceApplicationTests {


    @Autowired
    private DynamicServiceImpl dynamicService;
    private Dynamic dynamic;


    @Before
    public void setUp() throws Exception {
        dynamic = new Dynamic();
    }

    @Test
    public void findAll() {
        List<Dynamic> all = dynamicService.findAll();
        Assert.assertNotNull(all);
    }

    @Test
    public void findById() {
        Dynamic byId = dynamicService.findById(1L);
        Assert.assertNotNull(byId);
    }

    @Test
    public void add() {
        dynamic.setCommonUserId(1L);
        dynamic.setDynamicContent("测试");
        dynamicService.add(dynamic);
    }

    @Test
    public void update() {
        dynamic.setCommonUserId(1L);
        dynamic.setDynamicContent("测试222");
        dynamicService.add(dynamic);
    }

    @Test
    public void deleteById() {
        dynamicService.deleteById(1L);
    }
}