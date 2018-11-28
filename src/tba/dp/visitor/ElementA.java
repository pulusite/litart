package tba.dp.visitor;

/**
 * Created by zhangdong on 2018/11/28.
 */
public class ElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA(){
        return "ElementA";
    }

}
