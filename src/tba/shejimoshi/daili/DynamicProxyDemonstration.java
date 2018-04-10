package tba.shejimoshi.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyDemonstration {
    public static void main(String[] args) {
        Subject realSubject=new RealSubject();

        InvocationHandler handler=new InvocationHandlerImpl(realSubject);

        Subject subjectProxy=(Subject)Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),handler);

        subjectProxy.sayHello("jdk daili");
        subjectProxy.sayGoodbye();
    }
}
