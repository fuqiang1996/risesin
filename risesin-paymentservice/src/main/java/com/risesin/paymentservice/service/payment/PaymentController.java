package com.risesin.paymentservice.service.payment;

import com.risesin.common.vo.resultVo.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR Baby
 * @CREATE 2019/10/8
 * @DESCRIPTION 支付接口
 * @since 1.0.0
 */
@RestController
@RequestMapping("api/service/payment/")
public class PaymentController {


    @RequestMapping("pay")
    public R<String> pay(){

        return new R<>("aaa");
    }
}
