package com.gupaodu.vip.pattern.delegate;

import com.gupaodu.vip.pattern.delegate.controllers.MemberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 创建人：zhj
 * 时间： 2018/5/24
 * 相当于项目经理角色
 */
public class ServleltDispatcher {
    private List<Handler> handlerMapping=new ArrayList<Handler>();

    public ServleltDispatcher(){
        try {
            Class<?> memberActionClass = MemberAction.class;
            handlerMapping.add(new Handler().setController(memberActionClass.newInstance())
                    .setMethod(memberActionClass.getMethod("getMenberById",new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doService(HttpServletRequest request, HttpServletResponse response){

    }

    private void doDispatch(HttpServletRequest request,HttpServletResponse response){
        //1.获取用户请求的rul
        //如按J2EE标准，每个url对应一个Servlet，url由浏览器输入
        String uri =request.getRequestURI();

        //2Servlet拿到url以后，要做权衡（要做判断，要做选择）
        //根据用户请求的url，去找到这个url对应的某一个java类的方法。

        //3、拿到url去handMapping找（我们把它认为是策略常量）
        Handler handler=null;
        for (Handler h:handlerMapping){
            if(h.getUrl().equals(uri)){
                handler=h;
                break;
            }
        }
        Object object=null;

        //4将具体的任务分发给Method
        try {
            object = handler.getMethod().invoke(handler.getController(), request.getParameter("mid"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //5获取到Method执行的结果，通过Response返回出去
        try {
            response.getWriter().write(object.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
