package tba.dp.visitor;

/**
 * Created by zhangdong on 2018/11/28.
 */
public class VisitorB implements Visitor{
    @Override
    public void visit(ElementA element) {
        System.out.println(element.operationA());
    }

    @Override
    public void visit(ElementB element) {
        System.out.println(element.operationB());
    }
}
