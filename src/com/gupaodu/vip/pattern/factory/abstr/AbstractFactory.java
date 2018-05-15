package com.gupaodu.vip.pattern.factory.abstr;

import com.gupaodu.vip.pattern.factory.Milk;

/**
 * 创建人：zhj
 * 时间： 2018/5/15
 * 在Spring中应用最为广泛
 * 易于扩展
 */
public abstract class AbstractFactory {

    //公共的逻辑
    //方便于统一管理

    public abstract Milk getMengniu();
    public abstract Milk getYili();
    public abstract Milk getTelunsu();

    public abstract Milk getSanlu();

}
