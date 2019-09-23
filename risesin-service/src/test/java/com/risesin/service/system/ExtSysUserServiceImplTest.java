package com.risesin.service.system;


import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.system.serviceImpl.ExtSysUserServiceImpl;
import com.risesin.service_api.modules.system.entity.ExtSysUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ExtSysUserServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ExtSysUserServiceImpl extSysUserService;

    @Test
    public void findAll() {
        List<ExtSysUser> all = extSysUserService.findAll();
        for (ExtSysUser extSysUser : all) {
            System.out.println(extSysUser);
        }
    }

    @Test
    public void findById() {
        ExtSysUser extSysUser = extSysUserService.findById(1L);
        System.out.println(extSysUser);
        Assert.assertNotNull(extSysUser);
    }

    @Test
    public void add() {
        ExtSysUser extSysUser = new ExtSysUser();
        extSysUser.setUserId(123L)
                //.setAddTime(new Date())
                .setDelFlag(0L)
                .setUsername("haha");
        extSysUserService.add(extSysUser);
    }

    @Test
    public void update() {
        ExtSysUser extSysUser = extSysUserService.findById(1L);
        extSysUserService.update(extSysUser.setUsername("Update。。。"));
        System.out.println(extSysUserService.findById(1L));
    }
}