package tba.dp.creational.abstractfactory;

/**
 * Created by zhangdong on 2018-12-02.
 */
public class Client {
    public static void main(String[] args) {
        Factory factory1=new ProductFactory1();
        factory1.createProductA();
        factory1.createProductB();
        System.out.println("---------");
        Factory factory2=new ProductFactory2();
        factory2.createProductA();
        factory2.createProductB();

    }
}
