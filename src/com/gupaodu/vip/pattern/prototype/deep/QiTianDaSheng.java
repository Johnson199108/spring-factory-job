package com.gupaodu.vip.pattern.prototype.deep;

import com.gupaodu.vip.pattern.singleton.seriable.Seriable;

import java.io.*;
import java.util.Date;

/**
 * 创建人：zhj
 * 时间： 2018/5/18
 */
public class QiTianDaSheng extends Monkey implements Cloneable ,Serializable {
    public JinGuBang jinGuBang;

    public QiTianDaSheng(){
        this.birthday=new Date();
        this.jinGuBang=new JinGuBang();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return deepClone();
    }

    public Object deepClone(){
        try{
            //写入本身对象
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(bos);
            oos.writeObject(this);
            //读取出来返回
            ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois=new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            copy.birthday=new Date();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
