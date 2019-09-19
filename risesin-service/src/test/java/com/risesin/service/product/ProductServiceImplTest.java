package com.risesin.service.product;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.product.serviceImpl.ProductServiceImpl;
import com.risesin.service_api.modules.product.entity.Product;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class ProductServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findAll() {
        List<Product> all = productService.findAll();
        for (Product product : all) {
            System.out.println(product);
        }

    }

    @Test
    public void findById() {
        Product product = productService.findById(8L);
        Assert.assertNotNull(product);
        Assert.assertEquals("success",new Double(3.5),product.getProDebtrate());
        System.out.println(product);
    }

    @Test
    public void add() {
        Product product = new Product();

        product.setAddtime(new Date());
        product.setProApplicant("申请人");
        product.setProCode("编号");
        product.setProDebtrate(3.5);
        product.setDelflag(0L);
        product.setProDescription("产品描述");
        product.setProGuarantor("担保人");
        product.setLastmodify(new Date());
        product.setProLendingCycle(12L);
        product.setProName("产品名称");
        product.setProMinquota(10000.0);
        product.setProMaxquota(1000000.0);
        product.setProState("待审核");
        product.setFinTypeId(10L);//融资类型id
        product.setSysUserId(100L);
        System.out.println(product);
        //product.setSysUserId(12L).setFinTypeId(13L);
        productService.add(product);
    }

    @Test
    public void update() {
        //productService.update(new Product().setProductId(7L).setProGuarantor("haha"));
    }

    @Test
    public void deleteById() {
        productService.deleteById(1L);
    }
}