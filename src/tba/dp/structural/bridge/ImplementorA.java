package tba.dp.structural.bridge;

/**
 * Created by zhangdong on 2018-11-30.
 */
public class ImplementorA extends Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现 A 方法执行");
    }
}
