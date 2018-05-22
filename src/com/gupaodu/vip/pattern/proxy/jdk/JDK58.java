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
public class JDK58 implements InvocationHandler {
    //被代理对象
    private Person targe;

    /**
     * 反射出代理类
     * @param target
     * @return
     * @throws Exception
     */
    public Object getInstance(Person target) throws Exception{
        this.targe=target;
        Class<? extends Person> targetclass = target.getClass();
        //用来生成一个新的对象（字节码重组来实现）
        return Proxy.newProxyInstance(targetclass.getClassLoader(),targetclass.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是58,帮忙找房子");
        System.out.println("开始物色");
        method.invoke(this.targe,args);
        System.out.println("如果合适的房子");
        return null;
    }
}
