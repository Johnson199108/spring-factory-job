package com.gupaodu.vip.pattern.singleton.hungry;

/**
 * 创建人：zhj
 * 时间： 2018/5/17
 */
public class Hungry {
    private Hungry(){}
    private static final Hungry hungry=new Hungry();
    public static final Hungry getInstance(){
        return hungry;
    }
}
