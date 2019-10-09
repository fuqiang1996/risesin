package com.risesin.paymentservice.service.alipayment;

import com.risesin.common.vo.resultVo.R;
import com.risesin.paymentservice.service.alipayment.model.PayRequest;
import com.risesin.paymentservice.service.alipayment.model.PayResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
    public R<PayResponse> pay(PayRequest payRequest){
        PayResponse pay = paymentService.pay(payRequest);
        return new R<>(pay);
    }

    @RequestMapping("notify")
    public void notify(HttpServletRequest request){
    }

    @RequestMapping("return")
    public void returnPage(HttpServletRequest request){

    }
}
