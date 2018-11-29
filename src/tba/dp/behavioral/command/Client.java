package tba.dp.behavioral.command;

/**
 * Created by zhangdong on 2018/11/26.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Command command=new ConcreteCommand(receiver);
        Invoker invoker=new Invoker(command);
        invoker.action();
    }
}
