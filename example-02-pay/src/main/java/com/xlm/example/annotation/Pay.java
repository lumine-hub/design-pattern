package com.xlm.example.annotation;

import com.xlm.example.PayFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xlm
 * 2024/7/19 下午10:55
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Pay {
    PayFactory.PayType payType();
}
