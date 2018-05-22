package com.gupaodu.vip.pattern.singleton.test;

import com.gupaodu.vip.pattern.singleton.lazy.LazyThree;

import java.lang.reflect.Constructor;

/**
 * 创建人：zhj
 * 时间： 2018/5/17
 */
public class fangsheTest {
    public static void main(String[] args) {
        try{
            Class<?> clazz = LazyThree.class;
            Constructor<?>[] cs = clazz.getDeclaredConstructors();
            for (Constructor c:cs){
                c.setAccessible(true);
                Object o = c.newInstance();
            }
            /*Constructor<?> c = clazz.getConstructor();
            c.setAccessible(true);
            clazz.newInstance();*/

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
