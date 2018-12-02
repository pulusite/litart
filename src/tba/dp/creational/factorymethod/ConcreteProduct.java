package tba.dp.creational.factorymethod;

/**
 * Created by zhangdong on 2018-12-02.
 */
public class ConcreteProduct implements Product {
    @Override
    public void productMethod() {
        System.out.println("产品");
    }
}
