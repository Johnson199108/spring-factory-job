package com.gupaodu.vip.pattern.factory.abstr;

/**
 * 创建人：zhj
 * 时间： 2018/5/15
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        MilkFactory factory=new MilkFactory();
        //对用户而言，更加简单了
        //用户只有选择的权利了，保证了程序的健壮性
        System.out.println(factory.getSanlu().getName());
    }
}
