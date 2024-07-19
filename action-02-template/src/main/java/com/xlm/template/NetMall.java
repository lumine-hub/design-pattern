package com.xlm.template;

import java.util.Map;

/**
 * @author xlm
 * 2024/7/19 下午4:43
 *
 * 基础电商推广服务 (模拟登录、爬取信息、生成海报)
 *  1. 生成最优价商品海报
 *  2. 海报含带推广邀请码
 */
public abstract class NetMall {

    private String username;
    private String password;
    public NetMall(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * 生成商品推广海报
     *
     * @param skuUrl 商品地址(京东、淘宝、当当)
     * @return 海报图片base64位信息
     */
    public String generateGoodsPoster(String skuUrl) {
        //1. 模拟登陆
        if(!login(username, password)) return null;
        //2.爬虫提取商品信息(登录后的优惠价格)
        Map<String, String> reptile = reptile(skuUrl);
        // 3. 组装海报
        return createBase64(reptile);

    }

    // 模拟登录
    protected abstract boolean login(String username, String password);

    // 爬虫提取商品信息(登录后的优惠价格)
    protected abstract Map<String, String> reptile(String skuUrl);

    // 生成商品海报信息
    protected abstract String createBase64(Map<String, String> goodsInfo);


}
