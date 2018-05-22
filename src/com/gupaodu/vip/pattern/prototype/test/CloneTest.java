package com.gupaodu.vip.pattern.prototype.test;

import com.gupaodu.vip.pattern.prototype.simple.Prototype;

import java.util.ArrayList;

/**
 * 创建人：zhj
 * 时间： 2018/5/18
 */
public class CloneTest {
    public static void main(String[] args) {
        Prototype p=new Prototype();
        p.setName("Tom");
        p.setList(new ArrayList());
        p.getList().add("1");

        try{
            Prototype obj=(Prototype)p.clone();
            System.out.println(obj.getName());
            System.out.println(obj.getList().size());
            System.out.println(p.getList());
            System.out.println(obj.getList());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
