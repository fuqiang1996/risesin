package com.risesin.service.commonuser;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.commonuser.serviceImpl.ComRoleServiceImpl;
import com.risesin.service_api.modules.comuser.entity.ComRole;
import com.risesin.service_api.modules.comuser.entity.ComRoleMenu;
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
public class ComRoleServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ComRoleServiceImpl comRoleService;

    @Test
    public void findAll() {
        List<ComRole> all = comRoleService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ComRole serviceById = comRoleService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        ComRole comRole = new ComRole();
        comRole.setDelflag(0l);
        comRole.setRoleName("真武");
        comRoleService.add(comRole);
        Assert.assertTrue("查询信息为空",comRoleService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ComRole comRole = new ComRole();
        comRole.setDelflag(0l);
        comRole.setRoleName("hh");
        comRole.setId(1l);

        comRoleService.update(comRole);

        ComRole byId = comRoleService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getRoleName().equals("hh"));

    }


    @Test
    public void deleteById() {
        comRoleService.deleteById(1L);
        List<ComRole> channelDefinitionList = comRoleService.findAll();
        channelDefinitionList.forEach((ComRole comRole)->{
            Assert.assertTrue("根据ID删除失败",comRole.getId() == 1L);
        });
    }
}