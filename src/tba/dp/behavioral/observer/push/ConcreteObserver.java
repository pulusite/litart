package tba.dp.behavioral.observer.push;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class ConcreteObserver implements Observer {
    private String observerState;

    @Override
    public void update(String state) {
        observerState=state;
        System.out.printf("状态为："+observerState);
    }
}
