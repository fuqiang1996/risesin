package com.risesin.service.base;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.base.serviceImpl.IndustryServiceImpl;
import com.risesin.service_api.modules.base.entity.Industry;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class IndustryServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private IndustryServiceImpl industryService;

    @Test
    public void findAll() {

        List<Industry> all = industryService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        Industry serviceById = industryService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getIndustryId() == 1l);
    }

    @Test
    public void add() {
        Industry industry = new Industry();
        industry.setIndustryName("1");
        industry.setIndustryPid("123");

        industryService.add(industry);
        Assert.assertTrue("查询信息为空",industryService.findAll().size() >=1 );
    }


    @Test
    public void update() {
        Industry industry = new Industry();
        industry.setIndustryName("1");
        industry.setIndustryPid("123");
        industry.setIndustryId(1l);
        industryService.update(industry);
    }


    @Test
    public void deleteById() {
        industryService.deleteById(1L);
        List<Industry> channelDefinitionList = industryService.findAll();
        channelDefinitionList.forEach((Industry bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getIndustryId() == 1L);
        });
    }
}
