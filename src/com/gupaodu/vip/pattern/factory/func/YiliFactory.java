package com.gupaodu.vip.pattern.factory.func;

import com.gupaodu.vip.pattern.factory.Milk;
import com.gupaodu.vip.pattern.factory.yili;

/**
 * 创建人：zhj
 * 时间： 2018/5/15
 */
public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new yili();
    }
}
