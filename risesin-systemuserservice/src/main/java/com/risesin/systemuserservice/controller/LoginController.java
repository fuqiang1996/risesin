package com.risesin.systemuserservice.controller;

import com.risesin.common.utils.md5.RandomValidateCodeUtil;
import com.risesin.common.vo.resultVo.R;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
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

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    R login(String username, String password, String verify, HttpServletRequest request) throws Exception {
        try {
            //从session中获取随机数
            String random = (String) request.getSession().getAttribute(RandomValidateCodeUtil.RANDOMCODEKEY);
            if (StringUtils.isBlank(verify)) {
                return R.error("请输入验证码");
            }
            if (random.equals(verify)) {
            } else {
                return R.error("请输入正确的验证码");
            }
        } catch (Exception e) {
            logger.error("验证码校验失败", e);
            return R.error("验证码校验失败");
        }
//        password = AesUtil.decrypt(password);
        return R.ok();
    }


}
