package tba.dp.creational.factorymethod;

/**
 * Created by zhangdong on 2018-12-02.
 */
public class Client {
    public static void main(String[] args) {
        Factory factory=new ConcreteFactory();
        Product product=factory.createProduct();
        product.productMethod();
    }
}
