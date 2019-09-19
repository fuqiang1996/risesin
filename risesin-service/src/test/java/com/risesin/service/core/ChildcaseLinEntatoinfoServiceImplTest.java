package com.risesin.service.core;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.ChildcaseLinEntatoinfoServiceImpl;
import com.risesin.service_api.modules.core.entity.ChildcaseLinEntatoinfo;
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
public class ChildcaseLinEntatoinfoServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ChildcaseLinEntatoinfoServiceImpl childcaseLinEntatoinfoService;

    @Test
    public void findAll() {
        List<ChildcaseLinEntatoinfo> all = childcaseLinEntatoinfoService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ChildcaseLinEntatoinfo serviceById = childcaseLinEntatoinfoService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getCasLinAtoInfoId() == 1l);
    }

    @Test
    public void add() {
        ChildcaseLinEntatoinfo bean = new ChildcaseLinEntatoinfo();
        bean.setCaseId(1l);
        bean.setAtoInfoId(1l);
        childcaseLinEntatoinfoService.add(bean);

        Assert.assertTrue("查询信息为空",childcaseLinEntatoinfoService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ChildcaseLinEntatoinfo bean = new ChildcaseLinEntatoinfo();
        bean.setAtoInfoId(2l);
        bean.setCaseId(2l);
        childcaseLinEntatoinfoService.update(bean);

        ChildcaseLinEntatoinfo byId = childcaseLinEntatoinfoService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getCaseId().equals(2l));

    }


    @Test
    public void deleteById() {
        childcaseLinEntatoinfoService.deleteById(1L);
        List<ChildcaseLinEntatoinfo> channelDefinitionList = childcaseLinEntatoinfoService.findAll();
        channelDefinitionList.forEach((ChildcaseLinEntatoinfo bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getCasLinAtoInfoId() == 1L);
        });
    }
}