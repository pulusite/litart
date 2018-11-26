package test.singleton;

/**
 * 懒汉式，线程安全
 *
 * Created by zhangdong on 2018/11/22.
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance(){
        if (instance==null){
            instance=new Singleton2();
        }
        return instance;
    }
}
