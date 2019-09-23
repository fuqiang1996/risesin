package com.risesin.service.actionplan;

import com.risesin.service.modules.actionplan.serviceimpl.FinImpPlanServiceImpl;
import com.risesin.service_api.modules.actionPlan.entity.FinImpPlan;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class FinImpPlanServiceImplTest extends ActPlanFinProServiceImplTest {

    @Autowired
    private FinImpPlanServiceImpl finImpPlanService;

    private FinImpPlan finImpPlan;

    @Before
    public void setUp() {
        finImpPlan = new FinImpPlan();
    }

    @Test
    public void testFindAll() {
        List<FinImpPlan> all = finImpPlanService.findAll();
        Assert.assertNotNull(all);
        System.out.println(all);

        Map<String, Object> map = new HashMap<>();
        map.put("proName", "方案名称");
        List<FinImpPlan> search = finImpPlanService.findSearch(map);
        System.out.println(search);
    }

    @Test
    public void testFindById() {
        FinImpPlan byId = finImpPlanService.findById(1L);
        System.out.println(byId);
    }

    @Test
    public void testAdd() {
        finImpPlan.setProName("方案名称");
        finImpPlan.setExtEntAtoInfoId(1L);
        finImpPlan.setFinCasId(1L);
        finImpPlan.setSincerityGold(new BigDecimal(0.00));
//        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());
//        finImpPlan.setAddTime(zonedDateTime.toInstant());
        finImpPlanService.add(finImpPlan);
    }

    @Test
    public void testUpdate() {
        finImpPlan.setProName("方案名称2");
        finImpPlan.setExtEntAtoInfoId(1L);
        finImpPlan.setFinCasId(1L);
        finImpPlan.setDelFlag(0L);
        finImpPlan.setSincerityGold(new BigDecimal(222.00));
//        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());
//        finImpPlan.setAddTime(zonedDateTime.toInstant());
        finImpPlan.setId(1L);
        finImpPlanService.add(finImpPlan);
    }

    @Test
    public void testDeleteById() {
        finImpPlanService.deleteById(3L);
    }
}