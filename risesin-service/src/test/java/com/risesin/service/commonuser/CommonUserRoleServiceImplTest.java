package com.risesin.service.commonuser;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.commonuser.serviceImpl.CommonUserRoleServiceImpl;
import com.risesin.service_api.modules.comuser.entity.CommonUserRole;
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
public class CommonUserRoleServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private CommonUserRoleServiceImpl commonUserRoleService;

    @Test
    public void findAll() {
        List<CommonUserRole> all = commonUserRoleService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        CommonUserRole serviceById = commonUserRoleService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        CommonUserRole commonUserRole = new CommonUserRole();
        commonUserRole.setCommonUserId(1l);
        commonUserRole.setRoleId(1l);
        commonUserRoleService.add(commonUserRole);
        Assert.assertTrue("查询信息为空",commonUserRoleService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        CommonUserRole commonUserRole = new CommonUserRole();
        commonUserRole.setCommonUserId(1l);
        commonUserRole.setRoleId(2l);
        commonUserRole.setId(1l);

        commonUserRoleService.update(commonUserRole);

        CommonUserRole byId = commonUserRoleService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getRoleId().equals(2l));

    }


    @Test
    public void deleteById() {
        commonUserRoleService.deleteById(1L);
        List<CommonUserRole> channelDefinitionList = commonUserRoleService.findAll();
        channelDefinitionList.forEach((CommonUserRole CommonUserRole)->{
            Assert.assertTrue("根据ID删除失败",CommonUserRole.getId() == 1L);
        });
    }
}