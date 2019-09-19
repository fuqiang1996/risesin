package com.risesin.service.core;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.LegalRepresentativeServiceImpl;
import com.risesin.service_api.modules.core.entity.LegalRepresentative;
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
public class LegalRepresentativeServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private LegalRepresentativeServiceImpl legalRepresentativeService;

    @Test
    public void findAll() {
        List<LegalRepresentative> all = legalRepresentativeService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        LegalRepresentative serviceById = legalRepresentativeService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getRepId() == 1l);
    }

    @Test
    public void add() {
        LegalRepresentative bean = new LegalRepresentative();
        bean.setHasLegalcase(1l);
        bean.setIsStockholder(2l);
        bean.setDelflag(0l);
        bean.setRepAge(2l);
        bean.setRepCreditstatus("123");
        legalRepresentativeService.add(bean);

        Assert.assertTrue("查询信息为空",legalRepresentativeService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        LegalRepresentative bean = new LegalRepresentative();
        bean.setHasLegalcase(1l);
        bean.setIsStockholder(2l);
        bean.setDelflag(0l);
        bean.setRepAge(2l);
        bean.setRepCreditstatus("1");
        bean.setRepId(1l);
        legalRepresentativeService.update(bean);

        LegalRepresentative byId = legalRepresentativeService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getRepCreditstatus().equals("1"));

    }


    @Test
    public void deleteById() {
        legalRepresentativeService.deleteById(1L);
        List<LegalRepresentative> channelDefinitionList = legalRepresentativeService.findAll();
        channelDefinitionList.forEach((LegalRepresentative bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getRepId() == 1L);
        });
    }
}