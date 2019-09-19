package com.risesin.service.servicePack;


import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.servicePack.SmsPackageServiceImpl;
import com.risesin.service_api.modules.servicePack.entity.SmsPackage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SmsPackageServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private SmsPackageServiceImpl smsPackageService;

    @Test
    public void findAll() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void add() {
        SmsPackage smsPackage = new SmsPackage();
        smsPackage.setPackAddtime(new Date())
                .setPackCode("编号")
                .setPackCount(10L)
                .setPackDelflag(0L)
                .setPackDesc("短信包描述")
                .setPackGrade("5")
                .setPackName("name")
                .setPackPrice(600.0)
                .setPackUserCustomer("customer");

        smsPackageService.add(smsPackage);
    }

    @Test
    public void update() {
    }

    @Test
    public void deleteById() {

    }

}