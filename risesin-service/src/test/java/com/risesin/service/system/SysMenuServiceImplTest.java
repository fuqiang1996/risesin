package com.risesin.service.system;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.system.serviceImpl.SysMenuServiceImpl;
import com.risesin.service_api.modules.system.entity.SysMenu;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class SysMenuServiceImplTest extends RisesinServiceApplicationTests {
    @Autowired
    private SysMenuServiceImpl sysMenuService;


    @Test
    public void findAll() {
        List<SysMenu> all = sysMenuService.findAll();
        for (SysMenu sysMenu : all) {
            System.out.println(sysMenu);
        }
    }

    @Test
    public void findById() {
        SysMenu sysMenu = sysMenuService.findById(1L);
        System.out.println(sysMenu);
    }

    @Test
    public void add() {
        SysMenu sysMenu = new SysMenu();
        sysMenu.setAddTime(new Date())
                .setDelFlag(0L)
                .setMenuIcon("icon")
                .setMenuIsOpen(0L)
                .setMenuUrl("url");
        sysMenuService.add(sysMenu);
    }

    @Test
    public void update() {
        SysMenu sysMenu = sysMenuService.findById(1L);
        sysMenuService.update(sysMenu.setMenuIcon("icon update"));

    }
}