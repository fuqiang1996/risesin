package com.risesin.enterpriseuserservice.service.financingConsult;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @AUTHOR Baby
 * @CREATE 2019/9/24
 * @DESCRIPTION 跳转到前端页面
 * @since 1.0.0
 */
@Controller
public class FinConsultAction {

    @RequestMapping("/index")
    public String yunxinWeb(){
        return "yunxinDemo";
    }
}
