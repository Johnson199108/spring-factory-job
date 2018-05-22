package com.gupaodu.vip.pattern.proxy.jdk;

import com.gupaodu.vip.pattern.proxy.staticed.Person;

/**
 * 创建人：zhj
 * 时间： 2018/5/21
 */
public class XieMu implements Person {
    @Override
    public void findLove() {
        System.out.println("找白富美");
    }

    @Override
    public void zuofangzi() {
        System.out.println("租别墅");
    }

    @Override
    public void buy() {

    }
}
