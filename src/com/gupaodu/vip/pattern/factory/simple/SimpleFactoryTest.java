package com.gupaodu.vip.pattern.factory.simple;

import com.gupaodu.vip.pattern.factory.Telunsu;

/**
 * 创建人：zhj
 *
 * 
 * 时间： 2018/5/12
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //工厂会把new 的细节封装，由工厂帮我们new
        SimpleFactory factory =new SimpleFactory();

        System.out.println(factory.getMilk("蒙牛").getName());
    }
}
