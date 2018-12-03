package tba.dp.structural.composite.transparency;

import java.util.List;

/**
 * Created by zhangdong on 2018/12/3.
 */
public abstract class Component {
    public abstract void printStruct(String preStr);

    public void addChild(Component child){
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    public void removeChild(Component child){
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    public List<Component> getChildren(){
        throw new UnsupportedOperationException("对象不支持此功能");
    }
}
