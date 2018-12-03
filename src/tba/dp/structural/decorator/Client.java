package tba.dp.structural.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class Client {
    public static void main(String[] args) throws Exception{
        ConcreteDecorator decorator=new ConcreteDecorator(new ConcreteComponent());

        BufferedInputStream bfin = new BufferedInputStream(new FileInputStream("asd"));

        decorator.sampleOperation();
    }
}
