package com.gupaodu.vip.pattern.decorator.passport.old;

/**
 * 创建人：zhj
 * 时间： 2018/5/29
 */
public class SigninService implements ISigninService {
    @Override
    public ResultMsg regist(String username, String password) {
        return new ResultMsg("200","注册成功",new Member());
    }

    @Override
    public ResultMsg login(String username, String password) {
        return new ResultMsg("200","登录成功",new Member());
    }
}
