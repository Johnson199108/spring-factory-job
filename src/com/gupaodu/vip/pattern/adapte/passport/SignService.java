package com.gupaodu.vip.pattern.adapte.passport;




/**
 * 创建人：zhj
 * 时间： 2018/5/25
 */
@Deprecated
public class SignService {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg("200","注册成功",new Member());
    }

    /**
     * 注册
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }


}
