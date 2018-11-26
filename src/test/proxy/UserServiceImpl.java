package test.proxy;

/**
 * Created by zhangdong on 2018/11/22.
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("real add");
    }
}
