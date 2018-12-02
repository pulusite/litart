package tba.dp.creational.abstractfactory;

/**
 * Created by zhangdong on 2018-12-02.
 */
public class ProductFactory1 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
