package tba.dp.behavioral.state;

/**
 * Created by zhangdong on 2018/11/29.
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle :"+sampleParameter);
    }
}
