package com.risesin.service.servicePack;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.servicePack.UserPackageServiceImpl;
import com.risesin.service_api.modules.servicePack.entity.UserPackage;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserPackageServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private UserPackageServiceImpl userPackageService;

    @Test
    public void findAll() {
        List<UserPackage> all = userPackageService.findAll();
        for (UserPackage userPackage : all) {
            System.out.println(userPackage);
        }
    }

    @Test
    public void findById() {
        UserPackage userPackage = userPackageService.findById(1L);
        System.out.println(userPackage);
        Assert.assertNotNull(userPackage);
    }

    @Test
    public void add() {
        UserPackage userPackage = new UserPackage();
        userPackage//.setAddTime(new Date())
                .setCode("code")
                .setCount(123L)
                .setDelFlag(0L)
                .setImg("url")
                .setKeywords("关键字")
                //.setLastModify(new Date())
                .setOrdernum(10L)
                .setPackageDesc("描述")
                .setPackName("名字")
                .setPackPv(20L)
                .setUserPackCount(123L)
                .setPrice(200L);
        userPackageService.add(userPackage);
    }

    @Test
    public void update() {
    }
}