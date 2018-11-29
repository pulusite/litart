package tba.dp.behavioral.visitor;

/**
 * Created by zhangdong on 2018/11/28.
 */
public interface Visitor {
    void visit(ElementA element);
    void visit(ElementB element);
}
