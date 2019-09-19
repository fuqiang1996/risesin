package com.risesin.service.core;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.FintypeLinkChildcaseServiceImpl;
import com.risesin.service_api.modules.core.entity.FintypeLinkChildcase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @AUTHOR Baby
 * @CREATE 2019/9/18
 * @DESCRIPTION 测试
 * @since 1.0.0
 */
public class FintypeLinkChildcaseServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private FintypeLinkChildcaseServiceImpl fintypeLinkChildcaseService;

    @Test
    public void findAll() {
        List<FintypeLinkChildcase> all = fintypeLinkChildcaseService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        FintypeLinkChildcase serviceById = fintypeLinkChildcaseService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getFinLinCasId() == 1l);
    }

    @Test
    public void add() {
        FintypeLinkChildcase bean = new FintypeLinkChildcase();
        bean.setCaseId(1l);
        bean.setFinTypeId(2l);
        fintypeLinkChildcaseService.add(bean);

        Assert.assertTrue("查询信息为空",fintypeLinkChildcaseService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        FintypeLinkChildcase bean = new FintypeLinkChildcase();
        bean.setCaseId(1l);
        bean.setFinTypeId(2l);
        bean.setFinLinCasId(1l);
        fintypeLinkChildcaseService.update(bean);

        FintypeLinkChildcase byId = fintypeLinkChildcaseService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getFinLinCasId().equals(1l));

    }


    @Test
    public void deleteById() {
        fintypeLinkChildcaseService.deleteById(1L);
        List<FintypeLinkChildcase> channelDefinitionList = fintypeLinkChildcaseService.findAll();
        channelDefinitionList.forEach((FintypeLinkChildcase bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getFinLinCasId() == 1L);
        });
    }
}