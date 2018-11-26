package test.singleton;

/**
 *  双重检验锁
 *
 *
 *  给 instance 分配内存
 *  调用 Singleton 的构造函数来初始化成员变量
 *  将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
 *
 * Created by zhangdong on 2018/11/22.
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance(){
        if (instance==null){
            synchronized(Singleton3.class){
                instance=new Singleton3();
            }
        }
        return instance;
    }
}
