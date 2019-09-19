package com.risesin.service.commonuser;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.commonuser.serviceImpl.ComRoleMenuServiceImpl;
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
public class ComRoleMenuServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ComRoleMenuServiceImpl comRoleMenuService;

    @Test
    public void findAll() {
        List<ComRoleMenu> all = comRoleMenuService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ComRoleMenu serviceById = comRoleMenuService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        ComRoleMenu comRoleMenu = new ComRoleMenu();
        comRoleMenu.setMenuId(1l);
        comRoleMenu.setRoleId(1l);
        comRoleMenuService.add(comRoleMenu);
        Assert.assertTrue("查询信息为空",comRoleMenuService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ComRoleMenu comRoleMenu = new ComRoleMenu();
        comRoleMenu.setMenuId(2l);
        comRoleMenu.setRoleId(2l);
        comRoleMenu.setId(1l);

        comRoleMenuService.update(comRoleMenu);

        ComRoleMenu byId = comRoleMenuService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getRoleId().equals(2l));

    }


    @Test
    public void deleteById() {
        comRoleMenuService.deleteById(1L);
        List<ComRoleMenu> channelDefinitionList = comRoleMenuService.findAll();
        channelDefinitionList.forEach((ComRoleMenu comRoleMenu)->{
            Assert.assertTrue("根据ID删除失败",comRoleMenu.getId() == 1L);
        });
    }
}