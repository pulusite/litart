package tba.dp.behavioral.observer.pull;


/**
 * Created by zhangdong on 2018/12/3.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        Observer observer=new ConcreteObserver();
        subject.attach(observer);
        ((ConcreteSubject) subject).change("new state");
    }
}
