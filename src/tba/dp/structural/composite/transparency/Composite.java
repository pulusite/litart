package tba.dp.structural.composite.transparency;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class Composite extends Component {
    private List<Component> childComponents=new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public void addChild(Component child){
        childComponents.add(child);
    }

    public void removeChild(Component child){
        childComponents.remove(child);
    }

    public List<Component> getChildren(){
        return childComponents;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr+"+"+this.name);

        if (this.childComponents!=null){
            preStr+=" ";
            for (Component component:childComponents) {
                component.printStruct(preStr);
            }
        }
    }
}
