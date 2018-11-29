package tba.dp.behavioral.visitor;

/**
 * Created by zhangdong on 2018/11/28.
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
