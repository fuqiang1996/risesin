package com.risesin.service.commonuser;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.commonuser.serviceImpl.ComDeptServiceImpl;
import com.risesin.service_api.modules.comuser.entity.ComDept;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class ComDeptServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ComDeptServiceImpl comDeptService;

    @Test
    public void findAll() {
        List<ComDept> all = comDeptService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ComDept serviceById = comDeptService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        ComDept comDept = new ComDept();
        comDept.setAddTime(new Date());
        comDept.setBranId("12");
        comDept.setDelFlag(1l);
        comDept.setDeptName("bbbb");
        comDept.setOrderNum(2l);
        comDept.setParentId("1");
        comDeptService.add(comDept);
        Assert.assertTrue("查询信息为空",comDeptService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ComDept comDept = new ComDept();
        comDept.setAddTime(new Date());
        comDept.setBranId("12");
        comDept.setDelFlag(1l);
        comDept.setDeptName("aaaa");
        comDept.setOrderNum(2l);
        comDept.setParentId("1");
        comDept.setId(1l);

        comDeptService.update(comDept);

        ComDept byId = comDeptService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getDeptName().equals("aaaa"));

    }


    @Test
    public void deleteById() {
        comDeptService.deleteById(1L);
        List<ComDept> channelDefinitionList = comDeptService.findAll();
        channelDefinitionList.forEach((ComDept comDept)->{
            Assert.assertTrue("根据ID删除失败",comDept.getId() == 1L);
        });
    }
}