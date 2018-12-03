package tba.dp.structural.decorator;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }
}
