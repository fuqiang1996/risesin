package com.risesin.service.product;


import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.product.serviceImpl.ProductAuthService;
import com.risesin.service_api.modules.product.entity.ProductAuth;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductAuthServiceTest extends RisesinServiceApplicationTests {

    @Autowired
    private ProductAuthService productAuthService;

    @Test
    public void findAll() {
        List<ProductAuth> all = productAuthService.findAll();
        for (ProductAuth productAuth : all) {
            System.out.println(productAuth);
        }
    }

    @Test
    public void findById() {
        ProductAuth productAuth = productAuthService.findById(1L);
        Assert.assertNotNull(productAuth);
        System.out.println(productAuth);
    }

    @Test
    public void add() {
        ProductAuth productAuth = new ProductAuth();
        productAuth//.setAddTime(new Date())
                .setDelFlag(0L)
                //.setLastmodify(new Date())
                .setProAuthCode("编号")
                .setProAuthRate(3.5)
                .setProAuthState("待审核")
                .setProductId(8L)
                .setSysUserId(10L);
                //.setProAuthId(1L);
        System.out.println(productAuth);
        productAuthService.add(productAuth);

    }

    @Test
    public void update() {
        ProductAuth productAuth = productAuthService.findById(1L);
        productAuth.setProAuthState("审核通过");
        productAuthService.update(productAuth);
        System.out.println(productAuthService.findById(1L));
    }

    @Test
    public void deleteById() {
        productAuthService.deleteById(3L);
    }
}