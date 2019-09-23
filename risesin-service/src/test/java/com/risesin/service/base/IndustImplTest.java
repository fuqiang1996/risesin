package com.risesin.service.base;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.base.serviceImpl.FinancingTypeServiceImpl;
import com.risesin.service.modules.base.serviceImpl.IndustryServiceImpl;
import com.risesin.service_api.modules.base.entity.FinancingType;
import com.risesin.service_api.modules.base.entity.Industry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IndustImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private IndustryServiceImpl industryService;

    private Industry industry;

    @Before
    public void setUp() {
        industry = new Industry();
    }

    @Test
    public void findAll() {
        List<Industry> all = industryService.findAll();
        Assert.assertNotNull(all);
    }

    @Test
    public void findById() {
        Industry byId = industryService.findById(1L);
        Assert.assertNotNull(byId);
    }

    @Test
    public void add() {
        industry.setIndustryCode("code");
        industry.setIndustryPid(2L);
        industryService.add(industry);
    }

    @Test
    public void update() {
        industry.setIndustryCode("2222");
        industry.setIndustryPid(1L);
        industry.setId(1L);
        industryService.add(industry);
    }

    @Test
    public void deleteById() {
        industryService.deleteById(1L);
    }
}