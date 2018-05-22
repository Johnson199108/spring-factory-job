package com.gupaodu.vip.pattern.proxy.custom;
import com.gupaodu.vip.pattern.proxy.staticed.Person;
import java.lang.reflect.Method;
public class $Proxy0 implements Person{
GPInvocationHandle h;
public $Proxy0(GPInvocationHandle h){
this.h=h;}
public void findLove(){
try{
Method m=Person.class.getMethod("findLove",new Class[]{});
this.h.invoke(this,m,null);
}catch(Throwable e){
e.printStackTrace();
}}public void zuofangzi(){
try{
Method m=Person.class.getMethod("zuofangzi",new Class[]{});
this.h.invoke(this,m,null);
}catch(Throwable e){
e.printStackTrace();
}}public void buy(){
try{
Method m=Person.class.getMethod("buy",new Class[]{});
this.h.invoke(this,m,null);
}catch(Throwable e){
e.printStackTrace();
}}}
