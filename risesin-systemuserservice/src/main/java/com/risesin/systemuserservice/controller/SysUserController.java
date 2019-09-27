package com.risesin.systemuserservice.controller;

import com.risesin.service.modules.system.serviceImpl.SysUserServiceImpl;
import com.risesin.service_api.modules.system.entity.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperationSupport;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.risesin.common.tools.R;

import javax.validation.Valid;

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
     * 新增或修改
     */
    @PostMapping("/submit")
    @ApiOperationSupport(order = 3)
    @ApiOperation(value = "新增或修改", notes = "传入User")
    public R submit(@Valid @RequestBody SysUser user) {
        userService.add(user);
        return R.ok();
    }





}
