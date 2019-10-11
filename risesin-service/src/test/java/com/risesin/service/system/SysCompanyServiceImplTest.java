package com.risesin.service.system;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.system.serviceImpl.SysCompanyServiceImpl;
import com.risesin.service_api.modules.system.entity.SysCompany;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

import static org.junit.Assert.*;

public class SysCompanyServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private SysCompanyServiceImpl sysCompanyService;

    @Test
    public void findAll() {
        List<SysCompany> all = sysCompanyService.findAll();
        for (SysCompany sysCompany : all) {
            System.out.println(sysCompany);
        }
    }

    @Test
    public void findById() {
        SysCompany sysCompany = sysCompanyService.findById(1L);
        System.out.println(sysCompany);
        Assert.assertNotNull(sysCompany);
    }

    @Test
    public void add() {
        SysCompany sysCompany = new SysCompany();
        sysCompany//.setAddTime(new Date())
                .setArea("area");
                //.setLastModify(new Date())
        sysCompanyService.add(sysCompany);
    }

    @Test
    public void update() {
        SysCompany sysCompany = sysCompanyService.findById(1L);
        System.out.println(sysCompanyService.findById(1L));
    }
}