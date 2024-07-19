package com.xlm.example.impl;

import com.xlm.example.PayService;
import com.xlm.example.entity.PayParams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author xlm
 * 2024/7/19 下午6:42
 */
@Slf4j
@Service
public class WxPayServiceImpl extends PayServiceAbstract {
    @Override
    public void realPay(PayParams payParams) {
        log.info("wx pay amount:{}", payParams.getAmount());
    }
}
