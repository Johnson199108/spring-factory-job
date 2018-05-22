package com.gupaodu.vip.pattern.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;


import static java.lang.ClassLoader.*;

/**
 * 创建人：zhj
 * 时间： 2018/5/22
 */
public class GPProxy {
    public static final String ln="\r\n";
    public static Object newProxyInstance(GPClassLoader classLoader,Class<?>[] interfaces,GPInvocationHandle h){
        //1动态生成源代码文件
        try{
            //1、组装java代理类。
            String src=generateSrc(interfaces);
            //2java文件输出磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            //文件路径
            File f=new File(filePath+"$Proxy0.java");
            FileWriter fw=new FileWriter(f);
            //写入的内容
            fw.write(src);
            fw.flush();
            fw.close();

            //3把生成的java文件编译成class文件
            JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager=compiler.getStandardFileManager(null,null,null);
            //把文件编译为class文件
            Iterable iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, null, null, null, null, iterable);
            task.call();
            manager.close();

            //4、编译生成的.class文件加载到JVM中来
            Class proxyClass =  classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(GPInvocationHandle.class);
            //f.delete();


            //5返回字节码重组以后的新的代理对象
            return c.newInstance(h);
        }
        catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb=new StringBuffer();
        sb.append("package com.gupaodu.vip.pattern.proxy.custom;"+ln);
        sb.append("import com.gupaodu.vip.pattern.proxy.staticed.Person;"+ln);
        sb.append("import java.lang.reflect.Method;"+ln);
        sb.append("public class $Proxy0 implements "+interfaces[0].getName()+"{"+ln);
            sb.append("GPInvocationHandle h;"+ln);
            sb.append("public $Proxy0(GPInvocationHandle h){"+ln);
                sb.append("this.h=h;");
            sb.append("}"+ln);

        for (Method m:interfaces[0].getMethods()){
            sb.append("public "+m.getReturnType().getName()+" "+m.getName()+"(){"+ln);
                sb.append("try{"+ln);
                    sb.append("Method m="+interfaces[0].getName()+".class.getMethod(\""+m.getName()+"\",new Class[]{});"+ln);
                    sb.append("this.h.invoke(this,m,null);"+ln);

                sb.append("}catch(Throwable e){"+ln);
                sb.append("e.printStackTrace();"+ln);
                sb.append("}");
            sb.append("}");
        }
        sb.append("}"+ln);
        return sb.toString();
    }
}