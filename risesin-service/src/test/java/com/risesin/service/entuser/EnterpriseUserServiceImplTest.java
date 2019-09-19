package com.risesin.service.entuser;


import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.entuser.serviceImpl.EnterpriseUserServiceImpl;
import com.risesin.service_api.modules.entuser.entity.EnterpriseUser;
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
public class EnterpriseUserServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private EnterpriseUserServiceImpl enterpriseUserService;

    @Test
    public void findAll() {
        List<EnterpriseUser> all = enterpriseUserService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        EnterpriseUser serviceById = enterpriseUserService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        EnterpriseUser bean = new EnterpriseUser();
        bean.setAccount("2l");
        bean.setCompanyName("3l");
        bean.setDelFlag(0l);
        bean.setOpenId("nice");
        bean.setUpdateUser("3");
        enterpriseUserService.add(bean);

        Assert.assertTrue("查询信息为空",enterpriseUserService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        EnterpriseUser bean = new EnterpriseUser();
        bean.setAccount("2l");
        bean.setCompanyName("3l");
        bean.setDelFlag(0l);
        bean.setOpenId("aaa");
        bean.setUpdateUser("3");
        bean.setId(1l);
        enterpriseUserService.update(bean);

        EnterpriseUser byId = enterpriseUserService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getOpenId().equals("aaa"));

    }


    @Test
    public void deleteById() {
        enterpriseUserService.deleteById(1L);
        List<EnterpriseUser> channelDefinitionList = enterpriseUserService.findAll();
        channelDefinitionList.forEach((EnterpriseUser bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getId() == 1L);
        });
    }
}