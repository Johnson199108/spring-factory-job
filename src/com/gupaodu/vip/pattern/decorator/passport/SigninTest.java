package com.gupaodu.vip.pattern.decorator.passport;

import com.gupaodu.vip.pattern.decorator.passport.old.SigninService;
import com.gupaodu.vip.pattern.decorator.passport.upgrade.ISigninForThirdService;
import com.gupaodu.vip.pattern.decorator.passport.upgrade.SigninForThirdService;

/**
 * 创建人：zhj
 * 时间： 2018/5/29
 */
public class SigninTest {
    public static void main(String[] args) {
        ISigninForThirdService signinForThirdService=new SigninForThirdService(new SigninService());
        signinForThirdService.loginForQQ("1111111");


        /**
         ======================================================================================
         装饰器模式                                      适配器模式
         --------------------------------------------------------------------------------------
         是一种非常特别的适配器模式                         可以不保留层级关系
         ----------------------------------------------------------------------------------
         装饰者和被装饰者都要实现同样的一个接口               适配器和被适配者没有必然的层级关系
         主要目的是为了扩展，依旧保留OOP关系                 通常采用代理或者继承形式进行包装
         -----------------------------------------------------------------------------------
         满足is-a的关系                                   满足has-a
         注重的是覆盖，扩展                                 注重兼容，转换












         */
    }
}
