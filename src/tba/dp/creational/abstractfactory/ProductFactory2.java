package tba.dp.creational.abstractfactory;

/**
 * Created by zhangdong on 2018-12-02.
 */
public class ProductFactory2 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
