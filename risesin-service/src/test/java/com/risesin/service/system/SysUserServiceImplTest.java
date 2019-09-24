package com.risesin.service.system;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.system.serviceImpl.SysUserServiceImpl;
import com.risesin.service_api.modules.system.entity.SysUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class SysUserServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private SysUserServiceImpl services;

    @Test
    public void findAll() {
        List<SysUser> all = services.findAll();
        all.forEach(System.out::println);
    }

    @Test
    public void findById() {
        SysUser sysUser = services.findById(1L);
        System.out.println(sysUser);
        Assert.assertNotNull(sysUser);
    }

    @Test
    public void add() {
        SysUser sysUser = new SysUser();
        sysUser.setCity("city")
                .setAccount("username")
                .setDeptId(10L)
                .setMailbox("asdf@qq.com");

        services.add(sysUser);
    }

    @Test
    public void update() {
        SysUser sysUser = services.findById(1L);
        sysUser.setCity("city update");
        services.update(sysUser);
    }

    @Test
    public void deleteById() {
        services.deleteById(1L);
    }
}