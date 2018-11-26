package test.proxy;

/**
 * Created by zhangdong on 2018/11/22.
 */
public class ProxyTest {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();

        MyInvocationHandler invocationHandler=new MyInvocationHandler(userService);

        UserService proxy=(UserService) invocationHandler.getProxy();
        proxy.add();
    }
}
