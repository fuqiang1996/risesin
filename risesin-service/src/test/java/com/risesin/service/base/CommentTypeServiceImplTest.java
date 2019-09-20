package com.risesin.service.base;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.base.serviceImpl.CommentTypeServiceImpl;
import com.risesin.service_api.modules.base.entity.CommentType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.crypto.Data;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class CommentTypeServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private CommentTypeServiceImpl commentTypeService;

    private CommentType commentType;

    @Before
    public void setUp() throws Exception {
        commentType = new CommentType();
    }

    @Test
    public void findAll() {
        List<CommentType> all = commentTypeService.findAll();
        Assert.assertNotNull(all);
    }

    @Test
    public void findSearch() {
    }

    @Test
    public void testFindSearch() {
    }

    @Test
    public void findById() {
        CommentType byId = commentTypeService.findById(1L);
        Assert.assertNotNull(byId);

    }

    @Test
    public void add() {
        commentType.setId(1L);
        commentType.setComtTypeName("类型名称");
        commentType.setDelFlag(10);
        commentType.setAddTime(new Date());
        commentTypeService.add(commentType);
    }

    @Test
    public void update() {
        commentType.setId(1L);
        commentType.setComtTypeName("类型名称2");
        commentType.setDelFlag(10);
        commentType.setAddTime(new Date());
        commentTypeService.update(commentType);
    }

    @Test
    public void deleteById() {
        commentTypeService.deleteById(1L);
    }
}