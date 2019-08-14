package tba.jdk.yichang;

/**
 * Created by zhangdong on 2018/4/8.
 */
public class Exception_ {
    public void testException() throws MyException {
        throw new MyException("14000001", "length < 4");
    }

    public static void main(String[] args) {
        try {
            Exception_ testClass = new Exception_();
            testClass.testException();
        } catch (MyException e) {
            System.out.println(e);
            e.printStackTrace();
            System.out.println("code\t"+e.getCode());
            System.out.println("msg\t"+e.getMsg());

        }
    }
}
