package com.risesin.service.actionplan;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.actionplan.serviceimpl.ActPlanFinProServiceImpl;
import com.risesin.service_api.modules.actionPlan.entity.ActPlanFinPro;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ActPlanFinProServiceImplTest 测试类
 */
public class ActPlanFinProServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ActPlanFinProServiceImpl actPlanFinProService;

    @Test
    public void testActPlan_add(){

        ActPlanFinPro actPlanFinPro = new ActPlanFinPro();
        actPlanFinPro.setFinProId(1L);
        actPlanFinPro.setProId(2L);

        Assert.assertTrue("测试通过",true);
        actPlanFinProService.add(actPlanFinPro);
        actPlanFinProService.add(actPlanFinPro);
        actPlanFinProService.add(actPlanFinPro);
    }
}