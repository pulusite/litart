package tba.dp.behavioral.state;

/**
 * Created by zhangdong on 2018/11/29.
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateA handle :"+sampleParameter);
    }
}
