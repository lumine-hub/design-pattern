package com.xlm.template.impl;

import com.xlm.template.NetMall;

import java.util.Map;

/**
 * @author xlm
 * 2024/7/19 下午4:48
 */
public class JDNetMall extends NetMall {
    public JDNetMall(String username, String password) {
        super(username, password);
    }

    @Override
    protected boolean login(String username, String password) {
        return false;
    }

    @Override
    protected Map<String, String> reptile(String skuUrl) {
        return Map.of();
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfo) {
        return "";
    }
}
