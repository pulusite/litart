package tba.dp.behavioral.visitor;

/**
 * Created by zhangdong on 2018/11/28.
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure os=new ObjectStructure();
        os.add(new ElementA());
        os.add(new ElementB());

        Visitor visitor=new VisitorA();
        os.action(visitor);
    }
}
