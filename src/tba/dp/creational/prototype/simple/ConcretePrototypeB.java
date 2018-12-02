package tba.dp.creational.prototype.simple;

/**
 * Created by zhangdong on 2018-12-02.
 */
public class ConcretePrototypeB implements Prototype{
    @Override
    public Object clone() {
        Prototype prototype=new ConcretePrototypeB();
        return prototype;
    }
}
