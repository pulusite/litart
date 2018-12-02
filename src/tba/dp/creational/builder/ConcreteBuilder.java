package tba.dp.creational.builder;

/**
 * Created by zhangdong on 2018-12-02.
 */
public class ConcreteBuilder implements Builder {

    private Product product=new Product();

    @Override
    public void buildPart1() {
        product.setPart1("id:223");
    }

    @Override
    public void buildPart2() {
        product.setPart2("name:zhd");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
