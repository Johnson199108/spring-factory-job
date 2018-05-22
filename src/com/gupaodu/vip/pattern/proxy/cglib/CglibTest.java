package com.gupaodu.vip.pattern.proxy.cglib;

/**
 * 创建人：zhj
 * 时间： 2018/5/21
 */
public class CglibTest {
    public static void main(String[] args) throws Exception {
        ZhangSan instance = (ZhangSan)new CglibMeipo().getInstance(ZhangSan.class);
        instance.findLove();
    }
}
