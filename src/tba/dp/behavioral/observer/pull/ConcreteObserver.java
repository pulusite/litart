package tba.dp.behavioral.observer.pull;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class ConcreteObserver implements Observer {
    private String observerState;

    @Override
    public void update(Subject subject) {
        observerState=((ConcreteSubject)subject).getState();
        System.out.printf("观察者状态为："+observerState);
    }
}
