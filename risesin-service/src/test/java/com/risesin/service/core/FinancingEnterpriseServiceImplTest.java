package com.risesin.service.core;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.FinancingEnterpriseServiceImpl;
import com.risesin.service_api.modules.core.entity.FinancingEnterprise;
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
public class FinancingEnterpriseServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private FinancingEnterpriseServiceImpl financingEnterpriseService;

    @Test
    public void findAll() {
        List<FinancingEnterprise> all = financingEnterpriseService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        FinancingEnterprise serviceById = financingEnterpriseService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        FinancingEnterprise bean = new FinancingEnterprise();
        bean.setDelFlag(0l);
        bean.setEntCode("2");
        bean.setEntName("huazi");
        bean.setEntTaxAmount(123d);
        financingEnterpriseService.add(bean);

        Assert.assertTrue("查询信息为空",financingEnterpriseService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        FinancingEnterprise bean = new FinancingEnterprise();
        bean.setDelFlag(0l);
        bean.setEntCode("2");
        bean.setEntName("huazi");
        bean.setEntTaxAmount(123d);
        bean.setId(1l);
        financingEnterpriseService.update(bean);

        FinancingEnterprise byId = financingEnterpriseService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getId().equals(1l));

    }


    @Test
    public void deleteById() {
        financingEnterpriseService.deleteById(1L);
        List<FinancingEnterprise> channelDefinitionList = financingEnterpriseService.findAll();
        channelDefinitionList.forEach((FinancingEnterprise bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getId() == 1L);
        });
    }
}