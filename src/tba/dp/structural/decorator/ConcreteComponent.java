package tba.dp.structural.decorator;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class ConcreteComponent implements Component {
    @Override
    public void sampleOperation() {
        System.out.println("被装饰类实现的方法");
    }
}
