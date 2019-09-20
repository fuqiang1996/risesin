package com.risesin.service.system;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.system.serviceImpl.SysPermissionRoleServiceImpl;
import com.risesin.service_api.modules.system.entity.SysPermissionRole;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class SysPermissionRoleServiceImplTest extends RisesinServiceApplicationTests {
    @Autowired
    private SysPermissionRoleServiceImpl service;

    @Test
    public void findAll() {
        List<SysPermissionRole> all = service.findAll();
        for (SysPermissionRole sysPermissionRole : all) {
            System.out.println(sysPermissionRole);
        }
    }

    @Test
    public void findById() {
        SysPermissionRole sysPermissionRole = service.findById(1L);
        System.out.println(sysPermissionRole);
    }

    @Test
    public void add() {
        service.add(new SysPermissionRole().setFkRoleId(10L).setFkPermissionId(20L));
    }

    @Test
    public void update() {
        SysPermissionRole sysPermissionRole = service.findById(1L);
        sysPermissionRole.setFkRoleId(15L);
        service.update(sysPermissionRole);
    }

    @Test
    public void deleteById() {
    }
}