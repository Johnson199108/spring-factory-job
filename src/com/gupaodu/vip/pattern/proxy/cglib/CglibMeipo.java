package com.gupaodu.vip.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * 创建人：zhj
 * 时间： 2018/5/21
 */
public class CglibMeipo implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) throws Exception{
        Enhancer enhancer=new Enhancer();
        //要把哪个设置为即将生成的新类的父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务的增强
        methodProxy.invokeSuper(o,objects);
        System.out.println("cglib增强代码");

        return o;
    }
}
