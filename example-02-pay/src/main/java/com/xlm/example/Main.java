package com.xlm.example;

import com.xlm.example.config.AppConfig;
import com.xlm.example.entity.PayParams;
import com.xlm.example.impl.AliPayServiceImpl;
import com.xlm.example.impl.WxPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author xlm
 * 2024/7/19 下午6:41
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PayFactory payFactory = applicationContext.getBean(PayFactory.class);
        Map<PayFactory.PayType, PayService> payTypePayServiceMap = payFactory.openPay();
        PayService payService = payTypePayServiceMap.get(PayFactory.PayType.ALI_PAY);
        PayParams payParams = new PayParams();
        payParams.setAmount(new BigDecimal(100));
        payService.pay(payParams);

    }


}