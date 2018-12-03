package tba.dp.structural.composite.security;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class Composite implements Component {
    private List<Component> childComponents=new ArrayList<>();

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public void addChild(Component child){
        this.childComponents.add(child);
    }

    public void removeChild(int index){
        this.childComponents.remove(index);
    }

    public List<Component> getChildren(){
        return this.childComponents;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.printf(preStr+"+"+this.name);
        if (this.childComponents!=null){
            preStr+=" ";
            for (Component component: childComponents ) {
                component.printStruct(preStr);
            }
        }
    }
}
