package tba.shejimoshi.danli;

/**
 * Created by zhangdong on 2018/4/10.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){}

/**    懒汉式，线程不安全
    public static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
 */

/**    1. 懒汉式，线程安全  效率低
    public static synchronized Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
 */

/**     2. 双重检验锁  要把instance声明为  volatile
    public static Singleton getInstance(){
        if (instance==null){  //Single Checked
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton(); //Double Checked
                }
            }
        }
        return instance;
    }
 */

/**    3. 饿汉式
    类加载时就初始化
    private static final Singleton instance=new Singleton();
    public static Singleton getInstance{
        return instance;
    }
 */

/**    4. 静态内部类
    public static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
 */

/**    5. 枚举 Enum
    public enum EasySinleton{
        INSTANCE;
    }
 */

}
