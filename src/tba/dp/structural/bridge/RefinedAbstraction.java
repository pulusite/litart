package tba.dp.structural.bridge;

/**
 * Created by zhangdong on 2018-11-30.
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    @Override
    public void operator() {
        impl.operationImpl();
    }
}
