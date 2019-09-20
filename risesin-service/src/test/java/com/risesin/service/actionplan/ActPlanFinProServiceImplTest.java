package com.risesin.service.actionplan;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.actionplan.serviceimpl.ActPlanFinProServiceImpl;
import com.risesin.service_api.modules.actionPlan.entity.ActPlanFinPro;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ActPlanFinProServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ActPlanFinProServiceImpl actPlanFinProService;

    private ActPlanFinPro actPlanFinPro;

    @Before
    public void setUp() throws Exception {
        actPlanFinPro = new ActPlanFinPro();
    }

    @Test
    public void findAll() {
        List<ActPlanFinPro> all = actPlanFinProService.findAll();
        Assert.assertNotNull(all);
        System.out.println(all);
    }

    @Test
    public void findById() {
        ActPlanFinPro byId = actPlanFinProService.findById(26L);
        Assert.assertNotNull(byId);
        System.out.println(byId);
    }

    @Test
    public void add() {
//        actPlanFinPro.setFinProId(111209L);
//        actPlanFinPro.setProId(39L);
        actPlanFinProService.add(actPlanFinPro);
    }

    @Test
    public void update() {
        actPlanFinPro.setId(26L);
        actPlanFinPro.setFinProId(1111111L);
        actPlanFinPro.setActProId(11111L);
        actPlanFinProService.add(actPlanFinPro);
    }


    @Test
    public void deleteById() {
//        actPlanFinProService.deleteById(26L);
        actPlanFinProService.deleteById(27L);

    }
}