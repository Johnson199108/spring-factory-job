package com.gupaodu.vip.pattern.strategy.pay.payport;

import com.gupaodu.vip.pattern.strategy.pay.PayState;

/**
 * 创建人：zhj
 * 时间： 2018/5/23
 */
public class AliPay implements Payment {
    @Override
    public PayState pay(String uid, double amout) {
        System.out.println("欢迎使用支付宝");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,"支付成功",amout);
    }
}
