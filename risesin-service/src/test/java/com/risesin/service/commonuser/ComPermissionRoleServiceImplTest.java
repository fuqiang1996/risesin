package com.risesin.service.commonuser;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.commonuser.serviceImpl.ComPermissionRoleServiceImpl;
import com.risesin.service_api.modules.comuser.entity.ComPermissionRole;
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
public class ComPermissionRoleServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ComPermissionRoleServiceImpl comPermissionRoleService;

    @Test
    public void findAll() {
        List<ComPermissionRole> all = comPermissionRoleService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ComPermissionRole serviceById = comPermissionRoleService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        ComPermissionRole comPermissionRole = new ComPermissionRole();
        comPermissionRole.setPermissionId(1l);
        comPermissionRole.setRoleId(2l);
        comPermissionRoleService.add(comPermissionRole);
        Assert.assertTrue("查询信息为空",comPermissionRoleService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ComPermissionRole comPermissionRole = new ComPermissionRole();
        comPermissionRole.setPermissionId(2l);
        comPermissionRole.setRoleId(3l);
        comPermissionRole.setId(1l);

        comPermissionRoleService.update(comPermissionRole);

        ComPermissionRole byId = comPermissionRoleService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getPermissionId().equals(2l));

    }


    @Test
    public void deleteById() {
        comPermissionRoleService.deleteById(1L);
        List<ComPermissionRole> channelDefinitionList = comPermissionRoleService.findAll();
        channelDefinitionList.forEach((ComPermissionRole comPermissionRole)->{
            Assert.assertTrue("根据ID删除失败",comPermissionRole.getId() == 1L);
        });
    }
}