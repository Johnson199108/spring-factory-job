package com.gupaodu.vip.pattern.strategy.pay;

import com.gupaodu.vip.pattern.strategy.pay.Order;
import com.gupaodu.vip.pattern.strategy.pay.payport.AliPay;
import com.gupaodu.vip.pattern.strategy.pay.payport.PayTye;

/**
 * 创建人：zhj
 * 时间： 2018/5/23
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        Order order=new Order("1","20180311001234568",9.99d);
        //开始支付，微信支付，支付宝，银联支付，
        //每个渠道它支付的具体算法是不一样的。
        //基本算法固定的。
        //System.out.println(order.pay(new AliPay()));
        System.out.println(order.pay(PayTye.ALI_PAY));
    }
}
