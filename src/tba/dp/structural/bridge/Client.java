package tba.dp.structural.bridge;

/**
 * Created by zhangdong on 2018-11-30.
 */
public class Client {
    public static void main(String[] args) {
        Abstraction abs1=new RefinedAbstraction(new ImplementorA());
        abs1.operator();
        Abstraction abs2=new RefinedAbstraction(new ImplementorB());
        abs2.operator();
    }
}
