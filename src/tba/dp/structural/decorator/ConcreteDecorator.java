package tba.dp.structural.decorator;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class ConcreteDecorator implements Component {
    private Component component;

    public ConcreteDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        this.component.sampleOperation();
    }
}
