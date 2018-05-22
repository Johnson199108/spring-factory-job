package com.gupaodu.vip.pattern.singleton.lazy;

/**
 * 创建人：zhj
 * 时间： 2018/5/17
 */
public class LazyThree {
    //默认使用lazyThree的时候，会先初始化内部类。
    //防止反射侵犯。
    private static boolean initialized=false;


    private LazyThree(){
        System.out.println("LazyThree加载");
        synchronized(LazyThree.class){
            if(initialized==false){
                initialized=!initialized;
            }else{
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }

    public static final LazyThree getInstance(){

        return LazyHolder.lazy;
    }

    /**
     * 内部类
     */
    private static class LazyHolder{
        public LazyHolder(){
            System.out.println("LazyHolder加载");
        }
        private static final LazyThree lazy=new LazyThree();


    }
}
