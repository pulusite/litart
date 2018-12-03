package tba.dp.structural.facade;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.wrapOperation();
    }
}
