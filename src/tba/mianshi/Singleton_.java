package tba.mianshi;

/**
 * Created by zhangdong on 2018/6/4.
 */
public class Singleton_ {

}
// 1. 懒汉式，线程不安全
/**
    public class Singleton {
        private static Singleton instance;
        private Singleton (){}
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
 */
// 2. 懒汉式，线程安全
/**
  public static synchronized Singleton getInstance() {
    if (instance == null) {
        instance = new Singleton();
    }
    return instance;
  }
 */
// 3.双重检验锁
/**
    public static Singleton getSingleton() {
        if (instance == null) {                         //Single Checked
            synchronized (Singleton.class) {
                if (instance == null) {                 //Double Checked
                    instance = new Singleton();
                }
            }
        }
        return instance ;
    }
 这段代码看起来很完美，很可惜，它是有问题。主要在于instance = new Singleton()这句，这并非是一个原子操作，事实上在 JVM 中这句话大概做了下面 3 件事情。

     给 instance 分配内存
     调用 Singleton 的构造函数来初始化成员变量
     将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
 但是在 JVM 的即时编译器中存在指令重排序的优化。也就是说上面的第二步和第三步的顺序是不能保证的，最终的执行顺序可能是 1-2-3 也可能是 1-3-2。如果是后者，则在 3 执行完毕、2 未执行之前，被线程二抢占了，这时 instance 已经是非 null 了（但却没有初始化），所以线程二会直接返回 instance，然后使用，然后顺理成章地报错。
    volatile

    public class Singleton {
        private volatile static Singleton instance; //声明成 volatile
        private Singleton (){}
        public static Singleton getSingleton() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }
 */
// 4.饿汉式 static final field
/**
    public class Singleton{
        //类加载时就初始化
        private static final Singleton instance = new Singleton();

        private Singleton(){}
        public static Singleton getInstance(){
            return instance;
        }
    }
*/
// 5.静态内部类 static nested class
/**
    public class Singleton {
        private static class SingletonHolder {
            private static final Singleton INSTANCE = new Singleton();
        }
        private Singleton (){}
        public static final Singleton getInstance() {
            return SingletonHolder.INSTANCE;
        }
    }
*/
// 6.枚举 Enum
/**
    public enum EasySingleton{
        INSTANCE;
    }
*/
// 总结
/**
总结
        一般来说，单例模式有五种写法：懒汉、饿汉、双重检验锁、静态内部类、枚举。上述所说都是线程安全的实现，文章开头给出的第一种方法不算正确的写法。

        就我个人而言，一般情况下直接使用饿汉式就好了，如果明确要求要懒加载（lazy initialization）会倾向于使用静态内部类，如果涉及到反序列化创建对象时会试着使用枚举的方式来实现单例。
 */
