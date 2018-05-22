package com.gupaodu.vip.pattern.proxy.custom;

import com.gupaodu.vip.pattern.proxy.cglib.ZhangSan;
import com.gupaodu.vip.pattern.proxy.jdk.XieMu;
import com.gupaodu.vip.pattern.proxy.staticed.Person;

/**
 * 创建人：zhj
 * 时间： 2018/5/22
 */
public class CustomProxyTest {
    public static void main(String[] args) {
        try{
            Person obj=(Person)new CustomMeipo().getInstance(new XieMu());
            //System.out.println(obj.getClass());
            obj.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
