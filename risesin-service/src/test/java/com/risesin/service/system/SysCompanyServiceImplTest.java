package com.risesin.service.system;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.system.serviceImpl.SysCompanyServiceImpl;
import com.risesin.service_api.modules.system.entity.SysCompany;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
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
                .setArea("area")
                .setBusinessAddress("地址")
                .setDelFlag(0L)
                //.setLastModify(new Date())
                .setLoanAgenId(10L)
                .setOrderNum(10L);
        sysCompanyService.add(sysCompany);
    }

    @Test
    public void update() {
        SysCompany sysCompany = sysCompanyService.findById(1L);
        sysCompanyService.update(sysCompany.setArea("area update"));
        System.out.println(sysCompanyService.findById(1L));
    }
}