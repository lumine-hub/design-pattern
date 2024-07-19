package com.xlm.example.impl;

import com.xlm.example.PayService;
import com.xlm.example.entity.PayParams;

/**
 * @author xlm
 * 2024/7/19 下午6:58
 */
public abstract class PayServiceAbstract implements PayService {

    public void pay(PayParams payParams) {
        before(payParams);
        realPay(payParams);
        after(payParams);
    }

    public void before(PayParams payParams){
        System.out.println("支付前操作");
    }
    public abstract void realPay(PayParams payParams);

    public void after(PayParams payParams){
        System.out.println("支付后操作");
    }

}
