package com.gupaodu.vip.pattern.proxy.custom;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 创建人：zhj
 * 时间： 2018/5/22
 */
public class GPClassLoader extends ClassLoader{
    private File classPathFile;

    public GPClassLoader(){
        String classPath = GPClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);

    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = GPClassLoader.class.getPackage().getName()+"."+name;

        if(classPathFile!=null){
            //加载class
            File classFile = new File(classPathFile,name.replaceAll("\\.","/")+".class");
            if(classFile.exists()){
                FileInputStream in=null;
                ByteArrayOutputStream out=null;
                try{
                    //建立输出流
                    in=new FileInputStream(classFile);
                    out=new ByteArrayOutputStream();
                    byte[] buff=new byte[1024];
                    int len;
                    //循环读取
                    while ((len=in.read(buff))!=-1){
                        out.write(buff,0,len);
                    }
                    return defineClass(className,out.toByteArray(),0,out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    if(in!=null){
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(out!=null){
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        }
        return null;
    }
}
