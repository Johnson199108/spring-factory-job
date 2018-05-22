package com.gupaodu.vip.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * 创建人：zhj
 * 时间： 2018/5/18
 */
public class Seriable implements Serializable {
    public final static Seriable INSTANCE=new Seriable();

    private Seriable(){}

    public static Seriable getInstance(){
        return INSTANCE;
    }

    /**
     * 一个协议，为了实现序列化和反序列化返回同一个对象实现的一个方法。实现单例
     * @return
     */
    private Object readResolve(){
        return INSTANCE;
    }
 }
