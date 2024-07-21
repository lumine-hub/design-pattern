package com.xlm.chain;

import com.xlm.chain.base.AuthInfo;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xlm
 * 2024/7/21 下午2:47
 */
public abstract class AuthLink {

    protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 时间格式化

    protected String levelUserName;

    protected String levelUserId;

    protected AuthLink next;


    public AuthLink(String levelUserName, String levelUserId) {
        this.levelUserName = levelUserName;
        this.levelUserId = levelUserId;
    }

    public void setNext(AuthLink next) {
        this.next = next;
    }

    public AuthLink getNext() {
        return next;
    }
    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    public abstract AuthInfo doAuth(String uId, String orderId, Date date);

}
