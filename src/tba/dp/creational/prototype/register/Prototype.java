package tba.dp.creational.prototype.register;

/**
 * Created by zhangdong on 2018-12-03.
 */
public interface Prototype {
    Prototype clone();
    String getName();
    void setName(String name);
}
