package com.job.factory;

/**
 * 创建人：zhj
 * 时间： 2018/5/16
 */
public class weixingpersonService implements personService {
    @Override
    public boolean addperson() {
        System.out.println("微信成功添加人员");
        return true;
    }
}
