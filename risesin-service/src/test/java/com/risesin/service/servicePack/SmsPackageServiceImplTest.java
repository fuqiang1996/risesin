package com.risesin.service.servicePack;


import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.servicePack.SmsPackageServiceImpl;
import com.risesin.service_api.modules.servicePack.entity.SmsPackage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SmsPackageServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private SmsPackageServiceImpl smsPackageService;

    @Test
    public void findAll() {
        List<SmsPackage> all = smsPackageService.findAll();
        for (SmsPackage smsPackage : all) {
            System.out.println(smsPackage);
        }
    }

    @Test
    public void findById() {
        SmsPackage smsPackage = smsPackageService.findById(2L);
        System.out.println(smsPackage);
        Assert.assertNotNull(smsPackage);
    }

    @Test
    public void add() {
        SmsPackage smsPackage = new SmsPackage();
        smsPackage.setAddTime(new Date())
                .setPackCode("编号")
                .setPackCount(10L)
                .setDelFlag(0L)
                .setPackDesc("短信包描述")
                .setPackGrade("5")
                .setPackName("name")
                .setPackPrice(600.0)
                .setPackUserCustomer("customer")
                .setLastMidify(new Date());

        smsPackageService.add(smsPackage);
    }

    @Test
    public void update() {
        SmsPackage smsPackage = smsPackageService.findById(3L);
        smsPackage.setPackDesc("短信包描述update");
        smsPackageService.update(smsPackage);
        SmsPackage smsPackage2 = smsPackageService.findById(3L);
        System.out.println(smsPackage2);
        Assert.assertEquals(3L,smsPackage2.getId().longValue());
    }

    @Test
    public void deleteById() {

    }

}