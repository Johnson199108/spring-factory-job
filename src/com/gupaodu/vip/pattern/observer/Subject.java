package com.gupaodu.vip.pattern.observer;

/**
 * 创建人：zhj
 * 时间： 2018/5/30
 */
public class Subject extends EventLisenter{
    public void  add(){
        System.out.println("添加");
        trigger(SubjectEventType.ON_ADD);
    }

    public void remove(){
        System.out.println("移出");
        trigger(SubjectEventType.ON_REMOVE);
    }
}
