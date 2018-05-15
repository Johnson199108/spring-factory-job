package com.job.factory;

/**
 * 创建人：zhj
 * 时间： 2018/5/16
 */
public class dingdingService implements personService {
    @Override
    public boolean addperson() {
        System.out.println("钉钉添加人员");
        return true;
    }
}
