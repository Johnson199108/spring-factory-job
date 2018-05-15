package com.job.factory.abstr;

import com.job.factory.personService;

/**
 * 创建人：zhj
 * 时间： 2018/5/16
 */
public class AbstractFactory {
    public static void main(String[] args) {

        //使用配置来控制
        //生产统一管理
        personService personService = new PersonFactory().getDingDing();

        //接口统一管理
        System.out.println(personService.addperson());

    }
}
