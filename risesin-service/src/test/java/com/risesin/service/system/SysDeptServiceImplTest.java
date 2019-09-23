package com.risesin.service.system;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.system.serviceImpl.SysDeptServiceImpl;
import com.risesin.service_api.modules.system.entity.SysDept;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class SysDeptServiceImplTest extends RisesinServiceApplicationTests {
    @Autowired
    private SysDeptServiceImpl sysDeptService;

    @Test
    public void findAll() {
        List<SysDept> all = sysDeptService.findAll();
        for (SysDept sysDept : all) {
            System.out.println(sysDept);
        }
    }

    @Test
    public void findById() {
        SysDept sysDept = sysDeptService.findById(1L);
        System.out.println(sysDept);
        Assert.assertNotNull(sysDept);
    }

    @Test
    public void add() {
        SysDept sysDept = new SysDept();
        sysDept//.setAddTime(new Date())
                .setBranId(10L)
                .setDeptName("部门")
                //.setLastModify(new Date())
                .setParentId(100L);
        sysDeptService.add(sysDept);
    }

    @Test
    public void update() {
        SysDept sysDept = sysDeptService.findById(1L);
        sysDeptService.update(sysDept.setDeptName("部门update"));
    }
}