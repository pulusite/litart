package tba.dp.creational.prototype.register;

/**
 * Created by zhangdong on 2018-12-03.
 */
public class ConcretePrototpyeA implements Prototype{
    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototpyeA prototpye=new ConcretePrototpyeA();
        prototpye.setName(this.name);
        return prototpye;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "ConcretePrototpyeA{" +
                "name='" + name + '\'' +
                '}';
    }
}
