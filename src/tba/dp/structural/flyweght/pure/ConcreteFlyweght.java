package tba.dp.structural.flyweght.pure;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class ConcreteFlyweght implements Flyweight {
    private Character intrinsicState=null;//本质的，固有的

    public ConcreteFlyweght(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String state) {
        System.out.println("Intrinsic State="+this.intrinsicState);
        System.out.println("Extrinsic Stare="+state);
    }
}
