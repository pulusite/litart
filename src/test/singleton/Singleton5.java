package test.singleton;

/**
 * 饿汉式 static final field
 *
 * Created by zhangdong on 2018/11/22.
 */
public class Singleton5 {
    private static final Singleton5 instance=new Singleton5();

    private Singleton5() {
    }

    public static Singleton5 getInstance(){
        return instance;
    }
}
