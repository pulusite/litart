package tba.dp.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 2018/11/28.
 */
public class ObjectStructure {
    private List<Element> elements=new ArrayList<>();

    public void action(Visitor visitor){
        for (Element element:elements) {
            element.accept(visitor);
        }
    }

    public void add(Element element){
        elements.add(element);
    }
}
