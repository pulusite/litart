package tba.dp.structural.adapter.clazz;

/**
 * Created by zhangdong on 11/30/18.
 */
public class Client {
    public static void main(String[] args) {
        Target adapter=new Adapter();
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }
}
