package com.risesin.service.system;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.system.serviceImpl.SysPermissionRoleServiceImpl;
import com.risesin.service.modules.system.serviceImpl.SysPermissionServiceImpl;
import com.risesin.service_api.modules.system.entity.SysPermission;
import com.risesin.service_api.modules.system.entity.SysPermissionRole;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

import static org.junit.Assert.*;

public class SysPermissionServiceImplTest extends RisesinServiceApplicationTests {
    @Autowired
    private SysPermissionServiceImpl service;

    @Test
    public void findAll() {
        List<SysPermission> all = service.findAll();
        for (SysPermission sysPermission : all) {
            System.out.println(sysPermission);
        }
    }

    @Test
    public void findById() {
        SysPermission permission = service.findById(1L);
        System.out.println(permission);
        Assert.assertNotNull(permission);
    }

    @Test
    public void add() {
        SysPermission permission = new SysPermission();
        permission.setPerName("权限名称")
                .setPerOrderNum(10L)
                .setPerRemark("描述与备注")
                .setPerPerms("权限标识")
                .setPerUrl("url");
        service.add(permission);
    }

    @Test
    public void update() {
        SysPermission permission = service.findById(1L);
        permission.setPerUrl("url +++++");
        service.update(permission);
    }

    @Test
    public void deleteById() {
        service.deleteById(1L);
    }
}