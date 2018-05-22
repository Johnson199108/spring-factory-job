package com.gupaodu.vip.pattern.singleton.lazy;

/**
 * 创建人：zhj
 * 时间： 2018/5/17
 */
public class LazyOne {
    private LazyOne(){}

    private static LazyOne lazy=null;

    public static LazyOne getInstance(){
        if(lazy==null){
            lazy=new LazyOne();
        }
        return lazy;
    }
}
