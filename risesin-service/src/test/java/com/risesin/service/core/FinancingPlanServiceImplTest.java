package com.risesin.service.core;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.FinancingPlanServiceImpl;
import com.risesin.service_api.modules.core.entity.FinancingPlan;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

/**
 * @AUTHOR Baby
 * @CREATE 2019/9/18
 * @DESCRIPTION 测试
 * @since 1.0.0
 */
public class FinancingPlanServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private FinancingPlanServiceImpl financingPlanService;

    @Test
    public void findAll() {
        List<FinancingPlan> all = financingPlanService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        FinancingPlan serviceById = financingPlanService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        FinancingPlan bean = new FinancingPlan();
        bean.setDelFlag(0l);
        bean.setPlanApplicant("2");
        bean.setPlanGuaranteemode("huazi");
        bean.setFinPlaDemandquota(new BigDecimal("123"));
        bean.setPlanPayment("streng");
        financingPlanService.add(bean);

        Assert.assertTrue("查询信息为空",financingPlanService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        FinancingPlan bean = new FinancingPlan();
        bean.setDelFlag(0l);
        bean.setDelFlag(0l);
        bean.setPlanApplicant("2");
        bean.setPlanGuaranteemode("huazi");
        bean.setFinPlaDemandquota(new BigDecimal("123"));
        bean.setPlanPayment("streng");
        bean.setId(1l);
        financingPlanService.update(bean);

        FinancingPlan byId = financingPlanService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getId().equals(1l));

    }


    @Test
    public void deleteById() {
        financingPlanService.deleteById(1L);
        List<FinancingPlan> channelDefinitionList = financingPlanService.findAll();
        channelDefinitionList.forEach((FinancingPlan bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getId() == 1L);
        });
    }
}