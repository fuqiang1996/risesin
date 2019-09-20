package com.risesin.service.system;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.system.serviceImpl.SysRoleServiceImpl;
import com.risesin.service_api.modules.system.entity.SysRole;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class SysRoleServiceImplTest extends RisesinServiceApplicationTests {
    @Autowired
    private SysRoleServiceImpl sysRoleService;

    @Test
    public void findAll() {
        List<SysRole> all = sysRoleService.findAll();
        for (SysRole role : all) {
            System.out.println(role);
        }
    }

    @Test
    public void findById() {
        SysRole role = sysRoleService.findById(1L);
        System.out.println(role);
    }

    @Test
    public void add() {
        SysRole role = new SysRole();
        role.setFkUserIdCreate(1L)
                .setRoleName("admin")
                .setRoleSign("role sign")
                .setRoleOrderNum("2");
        sysRoleService.add(role);
    }

    @Test
    public void update() {
        SysRole role = sysRoleService.findById(1L);
        role.setRoleSign("role sign ++++");
        sysRoleService.update(role);
    }

    @Test
    public void deleteById() {
        sysRoleService.deleteById(1L);
    }
}