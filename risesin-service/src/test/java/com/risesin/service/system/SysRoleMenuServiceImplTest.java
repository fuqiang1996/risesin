package com.risesin.service.system;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.system.serviceImpl.SysRoleMenuServiceImpl;
import com.risesin.service_api.modules.system.entity.SysRoleMenu;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class SysRoleMenuServiceImplTest extends RisesinServiceApplicationTests {
    @Autowired
    private SysRoleMenuServiceImpl service;

    @Test
    public void findAll() {
        List<SysRoleMenu> all = service.findAll();
        for (SysRoleMenu sysRoleMenu : all) {
            System.out.println(sysRoleMenu);
        }
    }

    @Test
    public void findById() {
        SysRoleMenu roleMenu = service.findById(1L);
        System.out.println(roleMenu);
    }

    @Test
    public void add() {
        SysRoleMenu sysRoleMenu = new SysRoleMenu();
        service.add(sysRoleMenu.setFkRoleId(2L).setFkMenuId(2L));
    }

    @Test
    public void update() {
        SysRoleMenu roleMenu = service.findById(1L);
        roleMenu.setFkMenuId(2L);
        service.update(roleMenu);
    }

    @Test
    public void deleteById() {
    }
}