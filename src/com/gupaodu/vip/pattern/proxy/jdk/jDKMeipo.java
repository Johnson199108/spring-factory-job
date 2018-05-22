package com.gupaodu.vip.pattern.proxy.jdk;

import com.gupaodu.vip.pattern.proxy.staticed.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建人：zhj
 * 时间： 2018/5/21
 */

/**
 * 需要继承接口
 */
public class jDKMeipo implements InvocationHandler {
    //被代理对象
    private Person targe;

    public Object getInstance(Person target) throws Exception{
        this.targe=target;
        Class<? extends Person> targetclass = target.getClass();
        //用来生成一个新的对象（字节码重组来实现）
        return Proxy.newProxyInstance(targetclass.getClassLoader(),targetclass.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆，我要 给你找对象，现在已经拿到你的资料");
        System.out.println("开始物色");
        method.invoke(this.targe,args);
        System.out.println("如果合适就结婚");
        return null;
    }
}
