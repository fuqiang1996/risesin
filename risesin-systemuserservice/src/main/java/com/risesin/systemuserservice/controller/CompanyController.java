package com.risesin.systemuserservice.controller;

import com.risesin.common.utils.md5.DigestUtil;
import com.risesin.common.vo.resultVo.R;
import com.risesin.service.modules.system.serviceImpl.SysCompanyServiceImpl;
import com.risesin.service_api.modules.system.entity.SysCompany;
import com.risesin.service_api.modules.system.entity.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>机构管理</p>
 *
 * @author : honey
 * @date : 2019-10-10 15:22
 **/
@Api(tags = "机构管理")
@RequestMapping("/company")
@RestController
@AllArgsConstructor
public class CompanyController {


    private SysCompanyServiceImpl sysCompanyService;

    /**
     * 详情
     */
    @GetMapping("/detail")
    @ApiOperationSupport(order = 1)
    @ApiOperation(value = "详情", notes = "传入companyId")
    public R<SysCompany> detail(@RequestParam @ApiParam("主键ID") String id) {
        SysCompany sysCompany = sysCompanyService.findById(Long.valueOf(id));
        return R.data(sysCompany);
    }

    /**
     * 新增
     */
    @PostMapping("/submit")
    @ApiOperationSupport(order = 2)
    @ApiOperation(value = "新增", notes = "传入company")
    public R submit(@Valid @RequestBody @ApiParam("company对象") SysCompany company) {
        sysCompanyService.add(company);
        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperationSupport(order = 3)
    @ApiOperation(value = "修改", notes = "传入company")
    public R update(@Valid @RequestBody @ApiParam("company对象") SysCompany company) {
        SysCompany sysCompany = sysCompanyService.findById(company.getId());
        if (sysCompany != null) {
            sysCompany.setDelFlag(-1L);
            sysCompany.setLeader(company.getLeader());
            sysCompanyService.update(company);
            return R.ok();
        }
        return R.ER();
    }

}
