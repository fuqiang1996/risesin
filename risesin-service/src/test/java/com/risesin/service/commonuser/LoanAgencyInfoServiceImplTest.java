package com.risesin.service.commonuser;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.commonuser.serviceImpl.LoanAgencyInfoServiceImpl;
import com.risesin.service_api.modules.comuser.entity.LoanAgencyInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @AUTHOR Baby
 * @CREATE 2019/9/18
 * @DESCRIPTION 测试
 * @since 1.0.0
 */
public class LoanAgencyInfoServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private LoanAgencyInfoServiceImpl loanAgencyInfoService;

    @Test
    public void findAll() {
        List<LoanAgencyInfo> all = loanAgencyInfoService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        LoanAgencyInfo serviceById = loanAgencyInfoService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        LoanAgencyInfo loanAgencyInfo = new LoanAgencyInfo();
        loanAgencyInfo.setLoanAgenName("aa");
        loanAgencyInfo.setLoanAgenArea("zhongguo");
        loanAgencyInfo.setLoanAgenWebsite("网址aa");
        loanAgencyInfo.setLoanAgenAddtime(LocalDateTime.now());
        loanAgencyInfoService.add(loanAgencyInfo);
        loanAgencyInfoService.findAll().forEach((loanAgencyInfo1 -> System.out.println(loanAgencyInfo1)));

        Assert.assertTrue("查询信息为空",loanAgencyInfoService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        LoanAgencyInfo loanAgencyInfo = new LoanAgencyInfo();
        loanAgencyInfo.setLoanAgenName("hh");
        loanAgencyInfo.setId(1l);

        loanAgencyInfoService.update(loanAgencyInfo);

        LoanAgencyInfo byId = loanAgencyInfoService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getLoanAgenName().equals("hh"));

    }


    @Test
    public void deleteById() {
        loanAgencyInfoService.deleteById(1L);
        List<LoanAgencyInfo> channelDefinitionList = loanAgencyInfoService.findAll();
        channelDefinitionList.forEach((LoanAgencyInfo comRole)->{
            Assert.assertTrue("根据ID删除失败",comRole.getId() == 1L);
        });
    }
}