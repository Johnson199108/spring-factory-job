package com.gupaodu.vip.pattern.factory.func;

/**
 * 创建人：zhj
 * 时间： 2018/5/15
 */
public class FactoryTest {
    public static void main(String[] args) {
        //货比三家
        //不知道谁好谁坏
        Factory factory=new MengniuFactory();
        System.out.println(factory.getMilk());
    }
}
