package com.gupaodu.vip.pattern.strategy.pay;

import com.gupaodu.vip.pattern.strategy.pay.payport.PayTye;
import com.gupaodu.vip.pattern.strategy.pay.payport.Payment;

/**
 * 创建人：zhj
 * 时间： 2018/5/23
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    //原始方法1
    public PayState pay(Payment payment){
        return payment.pay(this.uid,this.amount);
    }

    /**
     * 完美解决了switch的过程，不需要在代码逻辑上写switch了。
     * @param payType
     * @return
     */
    public PayState pay(PayTye payType){
        return payType.get().pay(this.uid,this.amount);
    }
}
