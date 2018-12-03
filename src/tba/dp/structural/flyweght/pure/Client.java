package tba.dp.structural.flyweght.pure;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Flyweight flyweight=flyweightFactory.factory(new Character('a'));
        flyweight.operation("First call");

        flyweight=flyweightFactory.factory(new Character('b'));
        flyweight.operation("Second call");

        flyweight=flyweightFactory.factory(new Character('a'));
        flyweight.operation("Third call");
    }
}
