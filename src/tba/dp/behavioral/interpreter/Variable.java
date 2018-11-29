package tba.dp.behavioral.interpreter;

/**
 * Created by zhangdong on 2018/11/27.
 */
public class Variable extends Expression {

    private  String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Context ctx) {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
