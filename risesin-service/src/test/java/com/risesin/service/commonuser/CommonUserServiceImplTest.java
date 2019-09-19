package com.risesin.service.commonuser;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.commonuser.serviceImpl.CommonUserServiceImpl;
import com.risesin.service_api.modules.comuser.entity.CommonUser;
import com.risesin.service_api.modules.comuser.entity.CommonUserRole;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @AUTHOR Baby
 * @CREATE 2019/9/18
 * @DESCRIPTION 测试
 * @since 1.0.0
 */
public class CommonUserServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private CommonUserServiceImpl commonUserService;

    @Test
    public void findAll() {
        List<CommonUser> all = commonUserService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        CommonUser serviceById = commonUserService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        CommonUser commonUser = new CommonUser();
        commonUser.setComAccount("公司");
        commonUser.setComCity("北京");
        commonUser.setComDelFlag(0l);
        commonUser.setComGmtCreate(new Date());
        commonUser.setComLiveAddress("hunanguangz");
        commonUser.setComPhone("123234");
        commonUserService.add(commonUser);
        Assert.assertTrue("查询信息为空",commonUserService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        CommonUserRole commonUserRole = new CommonUserRole();
        commonUserRole.setCommonUserId(1l);
        commonUserRole.setRoleId(2l);
        commonUserRole.setId(1l);

        commonUserService.update(commonUserRole);

        CommonUser byId = commonUserService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getComCity().equals("z"));

    }


    @Test
    public void deleteById() {
        commonUserService.deleteById(1L);
        List<CommonUser> channelDefinitionList = commonUserService.findAll();
        channelDefinitionList.forEach((CommonUser commonUser)->{
            Assert.assertTrue("根据ID删除失败",commonUser.getId() == 1L);
        });
    }
}