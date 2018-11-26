package test.singleton;

/**
 *
 * 静态内部类 static nested class
 *
 *
 * Created by zhangdong on 2018/11/22.
 */
public class Singleton6 {
    private static class SingletonHolder{
        private static final Singleton6 INSTANCE=new Singleton6();
    }

    private Singleton6() {
    }

    public static final Singleton6 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
