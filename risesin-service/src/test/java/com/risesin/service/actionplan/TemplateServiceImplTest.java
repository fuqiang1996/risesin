package com.risesin.service.actionplan;

import com.risesin.service.actionplan.ActPlanFinProServiceImplTest;
import com.risesin.service.modules.actionplan.serviceimpl.TemplateServiceImpl;
import com.risesin.service_api.modules.actionPlan.entity.Template;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

import static org.junit.Assert.*;

public class TemplateServiceImplTest extends ActPlanFinProServiceImplTest {

    @Autowired
    private TemplateServiceImpl templateService;

    private Template template;

    @Before
    public void setUp() {
        template = new Template();
    }

    @Test
    public void testFindAll() {
        List<Template> all = templateService.findAll();
        System.out.println(all);
    }

    @Test
    public void findSearch() {
    }

    @Test
    public void testFindSearch() {
    }

    @Test
    public void testFindById() {
        Template byId = templateService.findById(5L);
        Assert.assertNotNull(byId);
        Date from = Date.from(byId.getAddTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = format.format(from);
        System.out.println(format1);
        System.out.println(byId);
    }

    @Test
    public void testAdd() {
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());
        template.setAddTime(new Date().toInstant());
        Date from = Date.from(Instant.now());
        template.setBackCoverUrl("http:url");
        template.setEnd("end");
        template.setLoanAgenId(1L);
        template.setMainAnalysis("main");
        template.setProduct("产品22");
        template.setStart("start");
        templateService.add(template);
    }

    @Test
    public void testUpdate() {
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());
        template.setAddTime(zonedDateTime.toInstant());
        template.setBackCoverUrl("http:url");
        template.setEnd("end");
        template.setLoanAgenId(1L);
        template.setMainAnalysis("main");
        template.setProduct("产品");
        template.setStart("start");
        template.setId(1L);
        templateService.add(template);
    }

    @Test
    public void testDeleteById() {
        templateService.deleteById(4L);
    }
}