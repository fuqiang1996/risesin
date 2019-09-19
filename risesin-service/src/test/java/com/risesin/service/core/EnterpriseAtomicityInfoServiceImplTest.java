package com.risesin.service.core;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.EnterpriseAtomicityInfoServiceImpl;
import com.risesin.service_api.modules.core.entity.EnterpriseAtomicityInfo;
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
public class EnterpriseAtomicityInfoServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private EnterpriseAtomicityInfoServiceImpl enterpriseAtomicityInfoService;

    @Test
    public void findAll() {
        List<EnterpriseAtomicityInfo> all = enterpriseAtomicityInfoService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        EnterpriseAtomicityInfo serviceById = enterpriseAtomicityInfoService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getAtoInfoId() == 1l);
    }

    @Test
    public void add() {
        EnterpriseAtomicityInfo bean = new EnterpriseAtomicityInfo();
        bean.setAtoInfoCode("2");
        bean.setAtoInfoDescription("123l");
        bean.setDelflag(0l);
        bean.setInfoTypeId(3l);
        enterpriseAtomicityInfoService.add(bean);

        Assert.assertTrue("查询信息为空",enterpriseAtomicityInfoService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        EnterpriseAtomicityInfo bean = new EnterpriseAtomicityInfo();
        bean.setAtoInfoCode("3");
        bean.setAtoInfoDescription("123l");
        bean.setDelflag(0l);
        bean.setInfoTypeId(3l);
        bean.setAtoInfoId(1l);
        enterpriseAtomicityInfoService.update(bean);

        EnterpriseAtomicityInfo byId = enterpriseAtomicityInfoService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getAtoInfoCode().equals("3"));

    }


    @Test
    public void deleteById() {
        enterpriseAtomicityInfoService.deleteById(1L);
        List<EnterpriseAtomicityInfo> channelDefinitionList = enterpriseAtomicityInfoService.findAll();
        channelDefinitionList.forEach((EnterpriseAtomicityInfo bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getAtoInfoId() == 1L);
        });
    }
}