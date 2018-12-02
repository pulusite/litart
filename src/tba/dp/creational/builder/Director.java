package tba.dp.creational.builder;

/**
 * Created by zhangdong on 2018-12-02.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
