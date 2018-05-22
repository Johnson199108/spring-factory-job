package com.gupaodu.vip.pattern.proxy.custom;

import com.gupaodu.vip.pattern.proxy.staticed.Person;

import java.lang.reflect.Method;

/**
 * 创建人：zhj
 * 时间： 2018/5/22
 */
public class CustomMeipo implements GPInvocationHandle {
    //被代理对象
    private Person targe;

    public Object getInstance(Person target) throws Exception{
        this.targe=target;
        Class<? extends Person> targetclass = target.getClass();
        //用来生成一个新的对象（字节码重组来实现）
        return GPProxy.newProxyInstance(new GPClassLoader(),targetclass.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("自定义媒婆...............");
        System.out.println("开始物色");
        method.invoke(this.targe,args);
        System.out.println("如果合适就结婚");
        return null;
    }
}
