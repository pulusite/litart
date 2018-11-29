package tba.dp.structural.adapter.clazz;

/**
 * Created by zhangdong on 11/29/18.
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void sampleOperation2() {
        System.out.println("fake sampleOperator2");
    }
}
