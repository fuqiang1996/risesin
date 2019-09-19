package com.risesin.service.commonuser;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.commonuser.serviceImpl.ComPermissionServiceImpl;
import com.risesin.service_api.modules.comuser.entity.ComPermission;
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
public class ComPermissionServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private ComPermissionServiceImpl comPermissionService;

    @Test
    public void findAll() {
        List<ComPermission> all = comPermissionService.findAll();
        Assert.assertTrue("查询信息为空",all.size() >=0 );
    }

    @Test
    public void findById() {
        ComPermission serviceById = comPermissionService.findById(1L);
        Assert.assertTrue("根据id查询实体为空",serviceById.getId() == 1l);
    }

    @Test
    public void add() {
        ComPermission comPermission = new ComPermission();
        comPermission.setPerName("bibi");
        comPermission.setOrderNum(2l);
        comPermission.setPerUrl("/api/risesin/");
        comPermissionService.add(comPermission);
        Assert.assertTrue("查询信息为空",comPermissionService.findAll().size() >=1 );
    }

    @Test
    public void update() {
        ComPermission comPermission = new ComPermission();
        comPermission.setPerName("哈哈");
        comPermission.setId(1l);

        comPermissionService.update(comPermission);

        ComPermission byId = comPermissionService.findById(1l);
        Assert.assertTrue("根据id查询实体为空",byId.getPerName().equals("哈哈"));

    }


    @Test
    public void deleteById() {
        comPermissionService.deleteById(1L);
        List<ComPermission> channelDefinitionList = comPermissionService.findAll();
        channelDefinitionList.forEach((ComPermission comPermission)->{
            Assert.assertTrue("根据ID删除失败",comPermission.getId() == 1L);
        });
    }
}