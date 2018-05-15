package com.gupaodu.vip.pattern.factory.abstr;

import com.gupaodu.vip.pattern.factory.Milk;
import com.gupaodu.vip.pattern.factory.func.MengniuFactory;
import com.gupaodu.vip.pattern.factory.func.SanluFactory;
import com.gupaodu.vip.pattern.factory.func.TelunsuFactory;
import com.gupaodu.vip.pattern.factory.func.YiliFactory;

/**
 * 创建人：zhj
 * 时间： 2018/5/15
 */
public class MilkFactory extends AbstractFactory {
    @Override
    public Milk getSanlu() {
        return new SanluFactory().getMilk();
    }

    @Override
    public Milk getMengniu() {
        return new MengniuFactory().getMilk();
    }

    @Override
    public Milk getYili() {
        return new YiliFactory().getMilk();
    }

    @Override
    public Milk getTelunsu() {
        return new TelunsuFactory().getMilk();
    }
}
