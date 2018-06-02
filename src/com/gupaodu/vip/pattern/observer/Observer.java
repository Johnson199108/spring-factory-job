package com.gupaodu.vip.pattern.observer;

/**
 * 创建人：zhj
 * 时间： 2018/5/30
 */
public class Observer {
    /*
    要触发的事件
     */
    public void advice(Event e){
        System.out.println("---------触发事件，打印日志----------------\n"+e);
    }
}
