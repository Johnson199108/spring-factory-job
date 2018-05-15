package com.gupaodu.vip.pattern.factory.simple;

import com.gupaodu.vip.pattern.factory.Milk;
import com.gupaodu.vip.pattern.factory.Telunsu;
import com.gupaodu.vip.pattern.factory.mengniu;
import com.gupaodu.vip.pattern.factory.yili;

/**
 * 创建人：zhj
 * 时间： 2018/5/12
 */
public class SimpleFactory {
    public Milk getMilk(String name) {
        if (name.equals("特仑苏")) {
            return new Telunsu();
        }
        else if(name.equals("伊利")){
            return new yili();
        }
        else if(name.equals("蒙牛")){
            return new mengniu();
        }
        return null;
    }
}

