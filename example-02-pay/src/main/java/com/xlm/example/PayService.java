package com.xlm.example;

import com.xlm.example.entity.PayParams;

import java.math.BigDecimal;

/**
 * @author xlm
 * 2024/7/19 下午6:42
 */
public interface PayService {
    void pay(PayParams payParams);
}
