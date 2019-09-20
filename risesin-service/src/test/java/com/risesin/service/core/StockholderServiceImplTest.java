package com.risesin.service.core;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.StockholderServiceImpl;
import com.risesin.service_api.modules.core.entity.Stockholder;
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
public class StockholderServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private StockholderServiceImpl stockholderService;

    @Test
    public void findAll() {
        List<Stockholder> all = stockholderService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        Stockholder serviceById = stockholderService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        Stockholder bean = new Stockholder();
        bean.setHasLegalcase(2l);
        bean.setStoAge(0l);
        bean.setStoAge(2l);
        bean.setStoCode("123l");
        stockholderService.add(bean);

        Assert.assertTrue("查询信息为空",stockholderService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        Stockholder bean = new Stockholder();
        bean.setHasLegalcase(2l);
        bean.setStoAge(0l);
        bean.setStoAge(2l);
        bean.setStoCode("3l");
        bean.setId(1l);
        stockholderService.update(bean);

        Stockholder byId = stockholderService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getStoCode().equals("3l"));

    }


    @Test
    public void deleteById() {
        stockholderService.deleteById(2L);
        List<Stockholder> channelDefinitionList = stockholderService.findAll();
        channelDefinitionList.forEach((Stockholder bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getId() == 2L);
        });
    }
}