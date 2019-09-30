package com.risesin.systemuserservice.controller;

import com.risesin.common.utils.md5.DigestUtil;
import com.risesin.common.utils.md5.RandomValidateCodeUtil;
import com.risesin.common.vo.resultVo.R;
import com.risesin.service.modules.system.serviceImpl.SysLogServiceImpl;
import com.risesin.service.modules.system.serviceImpl.SysUserServiceImpl;
import com.risesin.service_api.modules.system.entity.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>系统用户登陆</p>
 *
 * @author : honey
 * @date : 2019-09-29 16:22
 **/
@Api(tags = "系统用户登陆")
@RequestMapping("/sysUser")
@RestController
@AllArgsConstructor
public class LoginController {

    private SysUserServiceImpl userService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @ApiOperation(value = "登陆", notes = "传入account，password")
    @ApiOperationSupport(order = 1)
    @PostMapping("/login")
    R<SysUser> login(@RequestParam @ApiParam("账户名") String account, @RequestParam @ApiParam("密码") String password, HttpServletRequest request) throws Exception {
        password = DigestUtil.encrypt(password);
        SysUser user = userService.findByAccountAndPassword(account, password);
        if (user != null) {
            return new R();
        }
        return R.ER("账号或密码错误!");
    }


}
