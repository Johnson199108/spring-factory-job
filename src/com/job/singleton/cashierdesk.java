package com.job.singleton;

/**
 * 创建人：zhj
 * 时间： 2018/5/20
 * 收银台单例模式
 */
public class cashierdesk implements Cloneable {
    private static boolean initialized=false;
    private cashierdesk(){
        synchronized(cashierdesk.class){
            if(initialized==false){
                initialized=!initialized;
            }else{
                throw new RuntimeException("单例模式被侵犯！");
            }
        }
    };

    /**
     * 浅clone
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    public cashierdesk getInstance(){
        return holder.getcashierdesk;
    }

    private static class holder{
        private static final cashierdesk getcashierdesk=new cashierdesk();
    }
}
