package com.xlm.example.impl;

import com.xlm.example.PayService;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author xlm
 * 2024/7/19 下午6:43
 */
@Slf4j
public class AliPayServiceImpl implements PayService {
    @Override
    public void pay(BigDecimal amount) {
        log.info("ali pay amount:{}", amount);
    }
}
