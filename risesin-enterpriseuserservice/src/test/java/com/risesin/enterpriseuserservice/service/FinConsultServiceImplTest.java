package com.risesin.enterpriseuserservice.service;

import com.risesin.enterpriseuserservice.RisesinEnterpriseuserserviceApplicationTests;
import com.risesin.enterpriseuserservice.service.financingConsult.impl.FinConsultServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @AUTHOR Baby
 * @CREATE 2019/9/25
 * @DESCRIPTION 云信咨询测试
 * @since 1.0.0
 */
public class FinConsultServiceImplTest extends RisesinEnterpriseuserserviceApplicationTests {
    @Autowired
    private FinConsultServiceImpl finConsultService;

    @Test
    public void yunxinTest(){
        finConsultService.testYunxin();
    }
}
