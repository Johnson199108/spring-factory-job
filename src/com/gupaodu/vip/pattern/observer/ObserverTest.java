package com.gupaodu.vip.pattern.observer;

import java.lang.reflect.Method;

/**
 * 创建人：zhj
 * 时间： 2018/5/30
 */
public class ObserverTest {
    public static void main(String[] args) {
        try {
            //观察者
            Observer observer=new Observer();

            Method advice = Observer.class.getMethod("advice", new Class<?>[]{Event.class});

            //lilt
            Subject subject=new Subject();
            subject.addLisenter(SubjectEventType.ON_ADD,observer,advice);

            subject.add();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
