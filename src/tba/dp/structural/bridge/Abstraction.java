package tba.dp.structural.bridge;

/**
 * Created by zhangdong on 2018-11-30.
 */
public abstract class Abstraction {
    protected Implementor impl;

    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    public abstract void operator();
}
