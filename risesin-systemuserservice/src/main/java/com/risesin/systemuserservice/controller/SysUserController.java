package com.risesin.systemuserservice.controller;

import com.risesin.common.utils.md5.DigestUtil;
import com.risesin.common.vo.resultVo.R;
import com.risesin.service.modules.system.serviceImpl.SysUserServiceImpl;
import com.risesin.service_api.modules.system.entity.SysUser;
import io.swagger.annotations.*;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>系统用户</p>
 *
 * @author : honey
 * @date : 2019-09-27 14:34
 **/
@Api(tags = "系统用户管理")
@RequestMapping("/sysUser")
@RestController
@AllArgsConstructor
public class SysUserController {

    private SysUserServiceImpl userService;


    /**
     * 查询单条
     */
    @ApiOperationSupport(order = 1)
    @ApiOperation(value = "查看详情", notes = "传入userId")
    @GetMapping("/detail")
    public R detail(@RequestParam @ApiParam("主键ID") String id) {
        SysUser detail = userService.findById(Long.valueOf(id));
        return new R(detail);
    }

    /**
     * 新增
     */
    @PostMapping("/submit")
    @ApiOperationSupport(order = 2)
    @ApiOperation(value = "新增", notes = "传入User")
    public R submit(@Valid @RequestBody @ApiParam("user对象") SysUser user) {
//        String encryptPwd = MD5Util.encrypt(user.getPassword());
        user.setPassword(DigestUtil.encrypt(user.getPassword()));
        userService.add(user);
        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperationSupport(order = 3)
    @ApiOperation(value = "修改", notes = "传入User")
    public R update(@Valid @RequestBody @ApiParam("user对象") SysUser user) {
        SysUser sysUser = userService.findById(user.getId());
        if (sysUser != null) {
            sysUser.setAccount(user.getAccount());
            sysUser.setPassword(user.getPassword());
////        sysUser.setPhone(user.getPhone());
////        sysUser.setLiveAddress(user.getLiveAddress());
            userService.update(sysUser);
            return R.ok();
        }
        return R.ER();
    }

    /**
     * 批量删除
     */
    @PostMapping("/remove")
    @ApiOperationSupport(order = 4)
    @ApiOperation(value = "批量删除", notes = "传入userId集合")
    public R delete(@RequestParam @ApiParam("userId集合") String ids) {
        String[] split = ids.split(",");
        List<Long> list = new ArrayList<>();
        for (String s : split) {
            list.add(new Long(s));
        }
        userService.deleteByIds(list);
        return R.ok();
    }


    /**
     * 用户列表
     */
    @GetMapping("/list")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "账号名", paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "userName", value = "姓名", paramType = "query", dataType = "string")
    })
    @ApiOperationSupport(order = 2)
    @ApiOperation(value = "列表", notes = "传入account和realName")
    public R list(@ApiIgnore @RequestParam Map<String, Object> user, @RequestParam @ApiParam("页码") Integer page, @RequestParam @ApiParam("页大小") Integer pageSize) {
        Page<SysUser> search = userService.findSearch(user, page, pageSize);
        return new R(search);
    }


    /**
     * 设置菜单权限
     *
     * @param userIds
     * @param roleIds
     * @return
     */
    @PostMapping("/grant")
    @ApiOperationSupport(order = 6)
    @ApiOperation(value = "权限设置", notes = "传入roleId集合以及menuId集合")
    public R grant(@ApiParam(value = "userId集合", required = true) @RequestParam String userIds,
                   @ApiParam(value = "roleId集合", required = true) @RequestParam String roleIds) {
//        boolean temp = userService.grant(userIds, roleIds);
        return null;
    }


}
