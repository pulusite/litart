package tba.dp.behavioral.state;

/**
 * Created by zhangdong on 2018/11/29.
 */
public class Client {
    public static void main(String[] args) {
        State stateA=new ConcreteStateA();

        Context context=new Context();

        context.setState(stateA);

        context.request("test");

        State stateB=new ConcreteStateB();
        context.setState(stateB);
        context.request("test");
    }
}
