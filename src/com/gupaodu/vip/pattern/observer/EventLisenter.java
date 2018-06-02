package com.gupaodu.vip.pattern.observer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 创建人：zhj
 * 时间： 2018/5/30
 * 注册事件
 */
public class EventLisenter {
    //事件收集器
    protected Map<Enum,Event> events=new HashMap<Enum,Event>();

    /**
     * 注册事件
     * @param eventType 类型
     * @param target  目标
     * @param callback  回调方法
     */
    public void addLisenter(Enum eventType, Object target, Method callback){
        events.put(eventType,new Event(target,callback));
    }


    protected void trigger(Enum call){
        if(!this.events.containsKey(call)){ return ;}
        Event e = this.events.get(call).setTrigger(call.toString());

        e.setSource(this);
        e.setTime(System.currentTimeMillis());

        try {
            e.getCallback().invoke(e.getTarget(),e);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
