package com.xlm.strategy;

import java.math.BigDecimal;

/**
 * @author xlm
 * 2024/7/19 下午4:00
 */
public interface ICouponDiscount<T> {

    /**
     * 优惠券金额计算
     * @param couponInfo 券折扣信息；直减、满减、折扣、N元购
     * @param skuPrice   sku金额
     * @BigDecimal           优惠后金额
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
