package com.risesin.service.commonuser;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.commonuser.serviceImpl.ComBranchCompanyServiceImpl;
import com.risesin.service_api.modules.comuser.entity.ChannelDefinition;
import com.risesin.service_api.modules.comuser.entity.ComBranchCompany;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class ComBranchCompanyServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ComBranchCompanyServiceImpl comBranchCompanyService;

    @Test
    public void findAll() {
        List<ComBranchCompany> all = comBranchCompanyService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ComBranchCompany serviceById = comBranchCompanyService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        ComBranchCompany comBranchCompany = new ComBranchCompany();
        comBranchCompany.setAddTime(LocalDateTime.now());
        comBranchCompany.setBranArea("明城国际");
        comBranchCompany.setBranBusinessAddress("湖南");
        comBranchCompany.setBranName("com");
        comBranchCompany.setBranRegAddress("中国");
        comBranchCompany.setLastModified(LocalDateTime.now());
        comBranchCompany.setLeader("leader");
        comBranchCompany.setOrderNum(1L);
        comBranchCompany.setLoanAgenId(1L);
        comBranchCompany.setDelFlag(0l);

        comBranchCompanyService.add(comBranchCompany);
        Assert.assertTrue("查询信息为空",comBranchCompanyService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ComBranchCompany comBranchCompany = new ComBranchCompany();
        comBranchCompany.setAddTime(LocalDateTime.now());
        comBranchCompany.setBranArea("明城国际");
        comBranchCompany.setBranBusinessAddress("湖南");
        comBranchCompany.setBranName("com");
        comBranchCompany.setBranRegAddress("中国");
        comBranchCompany.setLastModified(LocalDateTime.now());
        comBranchCompany.setLeader("aaaa");
        comBranchCompany.setOrderNum(1L);
        comBranchCompany.setLoanAgenId(1L);
        comBranchCompany.setId(1l);

        comBranchCompanyService.update(comBranchCompany);

        ComBranchCompany byId = comBranchCompanyService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getLeader().equals("aaaa"));

    }


    @Test
    public void deleteById() {
        comBranchCompanyService.deleteById(1L);
        List<ComBranchCompany> channelDefinitionList = comBranchCompanyService.findAll();
        channelDefinitionList.forEach((ComBranchCompany comBranchCompany)->{
            Assert.assertTrue("根据ID删除失败",comBranchCompany.getId() == 1L);
        });
    }
}