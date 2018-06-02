package com.gupaodu.vip.pattern.decorator.passport.upgrade;

import com.gupaodu.vip.pattern.decorator.passport.old.ISigninService;
import com.gupaodu.vip.pattern.decorator.passport.old.ResultMsg;

/**
 * 创建人：zhj
 * 时间： 2018/5/29
 */
public class SigninForThirdService implements ISigninForThirdService {
    private ISigninService service;
    public SigninForThirdService(ISigninService service){
        this.service=service;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return service.regist(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return service.login(username,password);
    }

    public ResultMsg loginForQQ(String openId){
        //1openId是全局唯一的，我们可以把它当做一个用户名
        //2密码默认为Empty
        //3注册（在原有的系统里面创建一个用户
        //4调用原来的登录方法
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWeChar(String openId){
        return  null;
    }

    public  ResultMsg loginForToken(String token){
        return null;
    }

    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }

    public ResultMsg loginForRegist(String username,String password){
        ResultMsg regist = this.regist(username, password);
        return regist;
    }
}
