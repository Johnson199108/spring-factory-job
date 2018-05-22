package com.gupaodu.vip.pattern.proxy.staticed;

/**
 * 创建人：zhj
 * 时间： 2018/5/21
 */
public class Father {
    private Person Person;

    public Father(Person son){
        this.Person = son;
    }

    public void findLove(){
        System.out.println("根据你的要求物色");
        this.Person.findLove();
        System.out.println("双方父母同意");
    }
}
