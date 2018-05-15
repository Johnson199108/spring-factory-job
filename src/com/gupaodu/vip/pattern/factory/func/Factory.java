package com.gupaodu.vip.pattern.factory.func;

import com.gupaodu.vip.pattern.factory.Milk;

/**
 * 工厂模型
 * 创建人：zhj
 * 时间： 2018/5/15
 */
public interface Factory {
    //工厂必然具有生产产品技能，统一的产品出口
    Milk getMilk();
}
