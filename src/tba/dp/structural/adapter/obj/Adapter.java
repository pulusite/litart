package tba.dp.structural.adapter.obj;

/**
 * Created by zhangdong on 11/29/18.
 */
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void sampleOperation1(){
        this.adaptee.sampleOperation1();
    }

    public void sampleOperation2(){
        System.out.println("fake sampleOperation2");
    }
}
