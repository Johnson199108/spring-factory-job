package com.gupaodu.vip.pattern.singleton.test;

import com.gupaodu.vip.pattern.singleton.hungry.Hungry;
import com.gupaodu.vip.pattern.singleton.lazy.LazyOne;
import com.gupaodu.vip.pattern.singleton.lazy.LazyThree;
import com.gupaodu.vip.pattern.singleton.lazy.LazyTwo;
import com.gupaodu.vip.pattern.singleton.register.RegisterEnum;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * 创建人：zhj
 * 时间： 2018/5/17
 */
public class ThreadSafeTest {
    public static void main(String[] args) {
        int count=200;

        //发令枪
        CountDownLatch latch=new CountDownLatch(count);
        //final Set<Hungry> syncSet= Collections.synchronizedSet(new HashSet<Hungry>());
        long start=System.currentTimeMillis();
        for (int i=0;i<count;i++){
            new Thread(){
                @Override
                public void run() {
                    try{
                        //阻塞
                        latch.await();
                        //Hungry.getInstance();
                        //LazyOne obj = LazyOne.getInstance();
                        //LazyTwo obj = LazyTwo.getInstance();
                        LazyThree instance = LazyThree.getInstance();
                        System.out.println(System.currentTimeMillis()+":"+instance);
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();
            //
            latch.countDown();
        }
        long end=System.currentTimeMillis();
        System.out.println("总耗时"+(end-start));

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
