package com.risesin.enterpriseuserservice.service.financingConsult.impl;

import com.risesin.common.utils.httpclient.HttpRequestUtil;
import com.risesin.enterpriseuserservice.service.financingConsult.FinConsultService;
import com.risesin.enterpriseuserservice.service.properties.YunxinProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @AUTHOR Baby
 * @CREATE 2019/9/24
 * @DESCRIPTION 网易云信服务
 * @since 1.0.0
 */
@Service
public class FinConsultServiceImpl implements FinConsultService {
    @Autowired
    private YunxinProperties yxPro;

    public void     testYunxin(){
        try {
            String response = HttpRequestUtil.postForYunxin(yxPro.getUrl(), yxPro.getAppKey(), yxPro.getAppSecret(), yxPro.getCheckSum());
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
