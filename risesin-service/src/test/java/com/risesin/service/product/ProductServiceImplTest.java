package com.risesin.service.product;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.product.serviceImpl.ProductServiceImpl;
import com.risesin.service_api.modules.product.entity.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;


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
        Product product = productService.findById(13L);
        //Product product2 = productService.findById(8L);
//        Assert.assertNotNull(product);
//        Assert.assertEquals("success",new Double(3.5),product.getProDebtrate());
        //product.getAddTime()
        System.out.println(product);
    }

    @Test
    public void add() {
        Product product = new Product();
        //product.setAddTime(new Date());
        System.out.println(LocalDateTime.now());
        product.setProApplicant("申请人");
        product.setProCode("编号");
        product.setProDebtrate(3.5);
        product.setDelFlag(0L);
        product.setProDescription("产品描述");
        product.setProGuarantor("担保人");
        product.setLastModify(new Date());
        product.setProLendingCycle(12L);
        product.setProName("产品名称");
        product.setProMinquota(new BigDecimal(1000.2));
        product.setProMaxquota(new BigDecimal(2010041.02));
        product.setProState("待审核");
        product.setFinTypeId(10L);//融资类型id
        product.setSysUserId(100L);
        System.out.println(product);
        //product.setSysUserId(12L).setFinTypeId(13L);
        //productService.add(product);
        //productService.add(product);
    }

    @Test
    public void update() {
        /*Product product = new Product();
        product.setId(8L);
        product.setAddTime(new Date());
        product.setProApplicant("申请人3333");
        product.setProCode("编号");
        product.setProDebtrate(3.5);
        //product.setDelFlag(0L);
        product.setProDescription("产品描述");
        product.setProGuarantor("担保人");
        product.setLastModify(new Date());
        product.setProLendingCycle(12L);
        product.setProName("产品名称");
        product.setProMinquota(10000.0);
        product.setProMaxquota(1000000.0);
        product.setProState("待审核");
        product.setFinTypeId(10L);//融资类型id
        product.setSysUserId(100L);
        System.out.println(product);*/
        //productService.update(new Product().setProductId(7L).setProGuarantor("haha"));
        Product product = productService.findById(8L);
        productService.update(product.setDelFlag(0L));
    }

    @Test
    public void deleteById() {
        productService.deleteById(8L);
    }
}