package com.xlm.example;

import com.xlm.example.impl.AliPayServiceImpl;
import com.xlm.example.impl.WxPayServiceImpl;

import java.math.BigDecimal;

/**
 * @author xlm
 * 2024/7/19 下午6:41
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.pay1(1,new BigDecimal(10));
    }

    // 最原始的支付方法
    public void pay1(int payType, BigDecimal amount) {
        PayService payService = null;
        switch (payType) {
            case 1:
                payService = new AliPayServiceImpl();
            case 2:
                payService = new WxPayServiceImpl();

        }
        payService.pay(amount);
    }
}