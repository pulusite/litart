package test.singleton;

/**
 * 懒汉式，线程不安全
 *
 * Created by zhangdong on 2018/11/22.
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        if (instance==null){
            instance=new Singleton1();
        }
        return instance;
    }
}
