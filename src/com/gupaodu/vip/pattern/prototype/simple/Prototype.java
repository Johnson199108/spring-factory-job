package com.gupaodu.vip.pattern.prototype.simple;

import java.util.ArrayList;

/**
 * 创建人：zhj
 * 时间： 2018/5/18
 */
public class Prototype implements Cloneable {
    private String name;
    private ArrayList list=new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
