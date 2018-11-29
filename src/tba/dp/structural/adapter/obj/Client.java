package tba.dp.structural.adapter.obj;

/**
 * Created by zhangdong on 11/30/18.
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter=new Adapter(new Adaptee());
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }
}
