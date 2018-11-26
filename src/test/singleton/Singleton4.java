package test.singleton;

/**
 *
 * 双重检验锁
 *
 *  我们只需要将 instance 变量声明成 volatile 就可以了
 *
 * Created by zhangdong on 2018/11/22.
 */
public class Singleton4 {
    private volatile static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance(){
        if (instance==null){
            synchronized(Singleton4.class){
                instance=new Singleton4();
            }
        }
        return instance;
    }
}
