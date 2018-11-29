package tba.dp.behavioral.visitor;

/**
 * Created by zhangdong on 2018/11/28.
 */
public class VisitorA implements Visitor{
    @Override
    public void visit(ElementA element) {
        System.out.println(element.operationA());
    }

    @Override
    public void visit(ElementB element) {
        System.out.println(element.operationB());
    }
}
