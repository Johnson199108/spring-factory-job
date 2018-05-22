package com.gupaodu.vip.pattern.proxy.jdk;

import com.gupaodu.vip.pattern.proxy.staticed.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * 创建人：zhj
 * 时间： 2018/5/21
 */
public class JDKProxyTest {
    public static void main(String[] args) throws Exception {
//        Person obj = (Person)new jDKMeipo().getInstance(new Person());
//        obj.findLove();

        Person obj2 = (Person)new JDK58().getInstance(new XieMu());
        obj2.findLove();

        //原理：
        //1.拿到被代理对象的引用，并且获取到它的所有的接口，反射获取。
        //2、JDKProxy 类重新生成一个类，同时新的类要实现被代理类所有实现方法。
        //3、动态生成java代码，把自己新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
        //4、编译重新生成的java代码.class
        //5、再重新加载到jvm上运行。

        //JDK规范，只要是$符号开头的一般是自动生成的。
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream os=new FileOutputStream("E://$Proxy0.class");
        os.write(bytes);
        os.close();
    }
}
