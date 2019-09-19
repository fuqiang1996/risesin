package com.risesin.service.commonuser;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.commonuser.serviceImpl.ComMenuServiceImpl;
import com.risesin.service_api.modules.comuser.entity.ComMenu;
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
public class ComMenuServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ComMenuServiceImpl comMenuService;

    @Test
    public void findAll() {
        List<ComMenu> all = comMenuService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ComMenu serviceById = comMenuService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        ComMenu comMenu = new ComMenu();
        comMenu.setAddtime(new Date());
        comMenu.setMenuName("bbbb");
        comMenu.setOrderNum(1l);
        comMenu.setMenuUrl("api/menu/");
        comMenuService.add(comMenu);
        Assert.assertTrue("查询信息为空",comMenuService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ComMenu comMenu = new ComMenu();
        comMenu.setAddtime(new Date());
        comMenu.setMenuName("aaaa");
        comMenu.setOrderNum(1l);
        comMenu.setMenuUrl("api/menu/");
        comMenu.setId(1l);

        comMenuService.update(comMenu);

        ComMenu byId = comMenuService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getMenuName().equals("aaaa"));

    }


    @Test
    public void deleteById() {
        comMenuService.deleteById(1L);
        List<ComMenu> channelDefinitionList = comMenuService.findAll();
        channelDefinitionList.forEach((ComMenu comMenu)->{
            Assert.assertTrue("根据ID删除失败",comMenu.getId() == 1L);
        });
    }
}