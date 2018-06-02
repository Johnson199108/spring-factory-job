package com.gupaodu.vip.pattern.decorator.passport.old;



/**
 * 创建人：zhj
 * 时间： 2018/5/29
 */
public interface ISigninService {
    public ResultMsg regist(String username, String password);

    public ResultMsg login(String username,String password);
}
