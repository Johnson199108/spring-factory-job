package com.gupaodu.vip.pattern.singleton.register;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建人：zhj
 * 时间： 2018/5/18
 */
public class RegisterMap {
    private RegisterMap(){}

    private static Map<String,Object> register=new HashMap<String,Object>();

    public static RegisterMap getInstance(String name){
        if(name==null){
            name=RegisterMap.class.getName();
        }
        if(register.get(name)==null){
            try {
                register.put(name,Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return (RegisterMap) register.get(name);
    }
}
