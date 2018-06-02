package com.gupaodu.vip.pattern.strategy.pay.payport;

import com.gupaodu.vip.pattern.strategy.pay.PayState;

/**
 * 创建人：zhj
 * 时间： 2018/5/23
 */
public interface Payment {
    //不科学
//    public final static Payment ALI_Pay=new AliPay();
//    public final static Payment Wechat_Pay=new WechatPay();
//    public final static Payment Union_Pay=new UnionPay();

    public PayState pay(String uid, double amout);
}
