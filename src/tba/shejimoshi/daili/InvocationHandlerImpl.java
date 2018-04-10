package tba.shejimoshi.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {
    private Subject subject;

    public InvocationHandlerImpl(Subject subject){
        this.subject=subject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        System.out.println("before");
        System.out.println("Method:"+method);
        Object returnValue=method.invoke(subject,args);
        System.out.println("after");
        return returnValue;
    }
}
