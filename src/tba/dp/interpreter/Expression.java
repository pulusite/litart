package tba.dp.interpreter;

/**
 * Created by zhangdong on 2018/11/27.
 */
public abstract class Expression {
    public abstract boolean interpret(Context ctx);
    public abstract boolean equals(Object obj);
    public abstract int hashCode();
    public abstract String toString();
}
