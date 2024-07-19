package com.xlm.strategy.old;

import com.xlm.strategy.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author xlm
 * 2024/7/19 下午4:04
 */
public class Context<T> {
    private ICouponDiscount<T> couponDiscount;
    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }
    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }

}
