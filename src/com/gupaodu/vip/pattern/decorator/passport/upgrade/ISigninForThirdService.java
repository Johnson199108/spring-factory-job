package com.gupaodu.vip.pattern.decorator.passport.upgrade;

import com.gupaodu.vip.pattern.decorator.passport.old.ISigninService;
import com.gupaodu.vip.pattern.decorator.passport.old.ResultMsg;

/**
 * 创建人：zhj
 * 时间： 2018/5/29
 */
public interface ISigninForThirdService extends ISigninService {
    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWeChar(String openId);

    public  ResultMsg loginForToken(String token);

    public ResultMsg loginForTelphone(String telphone,String code);

    public ResultMsg loginForRegist(String username,String password);
}
