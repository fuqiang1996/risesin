package com.risesin.service.actionplan;

import com.risesin.service.modules.actionplan.serviceimpl.ExtEnterpriseAtomicityInfoServiceImpl;
import com.risesin.service_api.modules.actionPlan.entity.ExtEnterpriseAtomicityInfo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import static org.junit.Assert.*;

public class ExtEnterpriseAtomicityInfoServiceImplTest extends ActPlanFinProServiceImplTest {


    @Autowired
    ExtEnterpriseAtomicityInfoServiceImpl extEnterpriseAtomicityInfoService;

    private ExtEnterpriseAtomicityInfo extEnterpriseAtomicityInfo;

    @Before
    public void setUp() throws Exception {
        extEnterpriseAtomicityInfo = new ExtEnterpriseAtomicityInfo();
    }

    @Test
    public void testFindAll() {
        List<ExtEnterpriseAtomicityInfo> all = extEnterpriseAtomicityInfoService.findAll();
        Assert.assertNotNull(all);
        System.out.println(all);
    }

    @Test
    public void testFindById() {
        ExtEnterpriseAtomicityInfo byId = extEnterpriseAtomicityInfoService.findById(1L);
        Assert.assertNotNull(byId);
        System.out.println(byId);
    }

    @Test
    public void testAdd() {
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());
        extEnterpriseAtomicityInfo.setAddtime(zonedDateTime.toInstant());
        extEnterpriseAtomicityInfo.setFileName("文件名");
        extEnterpriseAtomicityInfo.setFileType("jpg");
        extEnterpriseAtomicityInfo.setFileUrl("url");
        extEnterpriseAtomicityInfo.setFinEntinfoId(1L);
        extEnterpriseAtomicityInfo.setRemark("bak");
        extEnterpriseAtomicityInfoService.add(extEnterpriseAtomicityInfo);

    }

    @Test
    public void testUpdate() {
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());
        extEnterpriseAtomicityInfo.setAddtime(zonedDateTime.toInstant());
        extEnterpriseAtomicityInfo.setFileName("文件名3");
        extEnterpriseAtomicityInfo.setFileType("jpg3");
        extEnterpriseAtomicityInfo.setFileUrl("url3");
        extEnterpriseAtomicityInfo.setFinEntinfoId(1L);
        extEnterpriseAtomicityInfo.setRemark("bak");
        extEnterpriseAtomicityInfo.setDelFlag(null);
        extEnterpriseAtomicityInfo.setId(1L);
        extEnterpriseAtomicityInfoService.add(extEnterpriseAtomicityInfo);
    }


    @Test
    public void testDeleteById() {
        extEnterpriseAtomicityInfoService.deleteById(1L);
    }
}