package com.risesin.service.core;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.core.serviceImpl.EntDebtHistoryServiceImpl;
import com.risesin.service_api.modules.core.entity.EntDebtHistory;
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
public class EntDebtHistoryServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private EntDebtHistoryServiceImpl entDebtHistoryService;

    @Test
    public void findAll() {
        List<EntDebtHistory> all = entDebtHistoryService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        EntDebtHistory serviceById = entDebtHistoryService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        EntDebtHistory bean = new EntDebtHistory();
        bean.setDebHistoryCode("2");
        bean.setDebPaid(new BigDecimal(123));
        bean.setDelFlag(0l);
        bean.setIsOverdue(3l);
        entDebtHistoryService.add(bean);

        Assert.assertTrue("查询信息为空",entDebtHistoryService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        EntDebtHistory bean = new EntDebtHistory();
        bean.setDebHistoryCode("2");
        bean.setDebPaid(new BigDecimal(123));
        bean.setDelFlag(0l);
        bean.setIsOverdue(2l);
        bean.setId(1l);
        entDebtHistoryService.update(bean);

        EntDebtHistory byId = entDebtHistoryService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getIsOverdue().equals(2l));

    }


    @Test
    public void deleteById() {
        entDebtHistoryService.deleteById(1L);
        List<EntDebtHistory> channelDefinitionList = entDebtHistoryService.findAll();
        channelDefinitionList.forEach((EntDebtHistory bean)->{
            Assert.assertTrue("根据ID删除失败",bean.getId() == 1L);
        });
    }
}