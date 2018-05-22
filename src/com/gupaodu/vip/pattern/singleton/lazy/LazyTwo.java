package com.gupaodu.vip.pattern.singleton.lazy;

/**
 * 创建人：zhj
 * 时间： 2018/5/17
 */
public class LazyTwo {
    private LazyTwo(){}

    private static LazyTwo lazy=null;

    //加同步锁
    public static synchronized LazyTwo getInstance(){
        if(lazy==null){
            lazy=new LazyTwo();
        }
        return lazy;
    }
}
