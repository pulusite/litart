package tba.dp.chainofresponsibility;

/**
 * Created by zhangdong on 2018/11/26.
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1=new ConcreteHandler();
        Handler handler2=new ConcreteHandler();
        handler1.setSuccessor(handler2);

        handler1.handleRequest();
    }
}
