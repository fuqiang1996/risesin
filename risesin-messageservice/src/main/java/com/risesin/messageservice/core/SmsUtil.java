package com.risesin.messageservice.core;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.risesin.common.utils.fastJson.JsonUtils;
import com.risesin.messageservice.service.properties.SmsProperties;
import org.apache.commons.lang3.RandomStringUtils;


/**
 * @AUTHOR Darling
 * @CREATE 2019-09-26
 * @DESCRIPTION 短信工具类
 * @since 1.0.0
 */

public class SmsUtil {
    //产品名称:云通信短信API产品,开发者无需替换
    //static final String product = "Dysmsapi";
    //产品域名,开发者无需替换
    static final String domain = "dysmsapi.aliyuncs.com";

    /**
     * 生成6位随机验证码
     * @return
     */
    public static String getSmsCode() {
        return RandomStringUtils.randomNumeric(6);
    }


    /**
     * 发送短信验证码(单条)
     * @param smsProperties 配置信息
     * @param mobile 手机号
     * @return
     */
    public static boolean sendSms(SmsProperties smsProperties, String mobile) {
        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", smsProperties.getAccessKeyId(), smsProperties.getAccessKeySecret());
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain(domain);
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", mobile);
        request.putQueryParameter("SignName", smsProperties.getSignName());
        request.putQueryParameter("TemplateCode", smsProperties.getTemplateCode());
        request.putQueryParameter("TemplateParam", "{\"code\":\""+ getSmsCode() +"\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            SendSmsResponse sendSmsResponse = JsonUtils.toBean(response.getData(), SendSmsResponse.class);
            if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
                return true;
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return false;
    }

}
