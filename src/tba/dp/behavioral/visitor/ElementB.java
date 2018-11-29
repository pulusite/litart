package tba.dp.behavioral.visitor;

/**
 * Created by zhangdong on 2018/11/28.
 */
public class ElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB(){
        return "ElementB";
    }
}
