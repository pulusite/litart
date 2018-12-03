package tba.dp.behavioral.strategy;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class Client {
    public static void main(String[] args) {
        //策略A
        Context context=new Context(new ConcreteStrategyA());
        context.contextInterface();
        System.out.printf("----执行策略A----");
        context=new Context(new ConcreteStrategyB());
        context.contextInterface();
        System.out.printf("----执行策略B----");
    }
}
