package tba.dp.creational.builder;

/**
 * Created by zhangdong on 2018-12-02.
 */
public interface Builder {
    void buildPart1();
    void buildPart2();
    Product retrieveResult();
}
