package com.gupaodu.vip.pattern.proxy.staticed;

/**
 * 创建人：zhj
 * 时间： 2018/5/21
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Son son=new Son();
        Father father=new Father(son);
        father.findLove();
    }
}
