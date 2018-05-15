package com.job.factory.abstr;

import com.job.factory.dingdingService;
import com.job.factory.personService;
import com.job.factory.weixingpersonService;

/**
 * 创建人：zhj
 * 时间： 2018/5/16
 */
public class PersonFactory extends AbstractPersonFactory {

    @Override
    public personService getweixing() {
        return new weixingpersonService();
    }

    @Override
    public personService getDingDing() {
        return new dingdingService();
    }
}
