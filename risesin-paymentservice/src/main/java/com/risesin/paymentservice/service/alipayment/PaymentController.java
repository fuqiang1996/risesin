package com.risesin.paymentservice.service.alipayment;

import com.risesin.common.vo.resultVo.R;
import com.risesin.paymentservice.service.alipayment.model.PayResponse;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("pay")
    public R<PayResponse> pay(){
        return new R<>(new PayResponse());
    }
}
