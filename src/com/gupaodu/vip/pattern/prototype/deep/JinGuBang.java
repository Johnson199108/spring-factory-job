package com.gupaodu.vip.pattern.prototype.deep;

import java.io.Serializable;

/**
 * 创建人：zhj
 * 时间： 2018/5/18
 */
public class JinGuBang implements Serializable {
    private float h=100;
    private float d=10;

    public void big(){
        this.d*=2;
        this.h*=2;
    }

    public void small(){
        this.d/=2;
        this.h/=2;
    }
}
