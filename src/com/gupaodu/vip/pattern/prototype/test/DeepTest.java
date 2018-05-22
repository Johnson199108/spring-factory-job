package com.gupaodu.vip.pattern.prototype.test;

import com.gupaodu.vip.pattern.prototype.deep.QiTianDaSheng;

/**
 * 创建人：zhj
 * 时间： 2018/5/18
 */
public class DeepTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        QiTianDaSheng qiTianDaSheng=new QiTianDaSheng();

        QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();
        System.out.println(qiTianDaSheng.jinGuBang==clone.jinGuBang);
    }
}
