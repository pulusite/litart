package tba.dp.behavioral.strategy;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyInterface() {
        System.out.printf("具体策略A");
    }
}
