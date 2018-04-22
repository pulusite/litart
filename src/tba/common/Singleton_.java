package tba.common;

/**
 * Created by zhangdong on 4/21/18.
 */
public class Singleton_ {
    private static Singleton_ ourInstance = new Singleton_();

    public static Singleton_ getInstance() {
        return ourInstance;
    }

    private Singleton_() {
    }
}
