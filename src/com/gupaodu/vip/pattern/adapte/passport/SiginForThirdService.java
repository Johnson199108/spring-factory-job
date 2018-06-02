package com.gupaodu.vip.pattern.adapte.passport;

/**
 * 创建人：zhj
 * 时间： 2018/5/28
 */
public class SiginForThirdService extends SignService {
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
        ResultMsg regist = super.regist(username, password);
        return regist;
    }
}
