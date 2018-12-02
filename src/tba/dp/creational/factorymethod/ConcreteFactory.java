package tba.dp.creational.factorymethod;

/**
 * Created by zhangdong on 2018-12-02.
 */
public class ConcreteFactory implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
