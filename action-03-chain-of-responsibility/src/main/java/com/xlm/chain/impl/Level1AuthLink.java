package com.xlm.chain.impl;

import com.xlm.chain.AuthLink;
import com.xlm.chain.base.AuthInfo;
import com.xlm.chain.base.AuthService;

import java.util.Date;

/**
 * @author xlm
 * 2024/7/21 下午2:53
 */
public class Level1AuthLink extends AuthLink {
    public Level1AuthLink(String levelUserName, String levelUserId) {
        super(levelUserName, levelUserId);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待一级审批负责人 ", levelUserName);
        }
        AuthLink next = super.getNext();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：一级审批完成负责人", " 时间：", f.format(date), " 审批人：", levelUserName);
        }

        return next.doAuth(uId, orderId, authDate);
    }
}
