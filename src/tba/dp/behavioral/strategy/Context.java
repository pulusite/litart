package tba.dp.behavioral.strategy;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void  contextInterface(){
        strategy.strategyInterface();
    }
}
