package com.risesin.service.system;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.system.serviceImpl.SysUserRoleServiceImpl;
import com.risesin.service_api.modules.system.entity.SysUserRole;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class SysUserRoleServiceImplTest extends RisesinServiceApplicationTests {
    @Autowired
    private SysUserRoleServiceImpl service;

    @Test
    public void findAll() {
        List<SysUserRole> all = service.findAll();
        for (SysUserRole userRole : all) {
            System.out.println(userRole);
        }
    }

    @Test
    public void findById() {
        SysUserRole userRole = service.findById(1L);
        System.out.println(userRole);
        Assert.assertNotNull(userRole);
    }

    @Test
    public void add() {
        SysUserRole userRole = new SysUserRole();
        service.add(userRole.setCommonUserId(1L).setRoleId(1L));
    }

    @Test
    public void update() {
        SysUserRole userRole = service.findById(1L);
        userRole.setCommonUserId(2L);
        service.update(userRole);
    }

}