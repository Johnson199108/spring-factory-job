package com.gupaodu.vip.pattern.proxy.custom;

import java.lang.reflect.Method;

/**
 * 创建人：zhj
 * 时间： 2018/5/22
 */
public interface GPInvocationHandle {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
