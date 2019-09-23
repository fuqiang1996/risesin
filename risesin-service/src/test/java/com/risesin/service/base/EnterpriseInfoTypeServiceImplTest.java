package com.risesin.service.base;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.base.serviceImpl.EnterpriseInfoTypeServiceImpl;
import com.risesin.service_api.modules.base.entity.EnterpriseInfoType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class EnterpriseInfoTypeServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private EnterpriseInfoTypeServiceImpl enterpriseInfoTypeService;

    private EnterpriseInfoType enterpriseInfoType;

    @Before
    public void setUp() throws Exception {
        enterpriseInfoType = new EnterpriseInfoType();
    }

    @Test
    public void findAll() {
        List<EnterpriseInfoType> all = enterpriseInfoTypeService.findAll();
        Assert.assertNotNull(all);
    }

    @Test
    public void findById() {
        EnterpriseInfoType byId = enterpriseInfoTypeService.findById(2L);
//        System.out.println(byId);
//        Assert.assertNotNull(byId);
    }

    @Test
    public void add() {
        enterpriseInfoType.setAddTime(new Date());
        enterpriseInfoType.setInfoTypeCode("code");
//        enterpriseInfoType.setId(1L);
        enterpriseInfoType.setInfoTypeName("infoName");
        enterpriseInfoTypeService.add(enterpriseInfoType);
    }

    @Test
    public void update() {
        enterpriseInfoType.setAddTime(new Date());
        enterpriseInfoType.setInfoTypeCode("code2222223333333333");
        enterpriseInfoType.setId(2L);
        enterpriseInfoType.setInfoTypeName("infoName");
        enterpriseInfoTypeService.add(enterpriseInfoType);
    }

    @Test
    public void deleteById() {
        enterpriseInfoTypeService.deleteById(1L);
    }
}