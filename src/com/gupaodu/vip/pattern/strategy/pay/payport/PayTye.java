package com.gupaodu.vip.pattern.strategy.pay.payport;

/**
 * 创建人：zhj
 * 时间： 2018/5/23
 */
public enum PayTye {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay()),
    UNION_PAY(new UnionPay());

    private Payment payment;
    PayTye(Payment payment){
        this.payment=payment;
    }

    public Payment get(){
        return this.payment;
    }
}
