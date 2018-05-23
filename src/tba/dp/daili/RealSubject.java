package tba.dp.daili;

public class RealSubject implements Subject{
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }

    @Override
    public String sayGoodbye() {
        return "goodbye";
    }
}
