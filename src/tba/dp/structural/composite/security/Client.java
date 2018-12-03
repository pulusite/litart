package tba.dp.structural.composite.security;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class Client {
    public static void main(String[] args) {
        Composite root=new Composite("服装");
        Composite composite1=new Composite("男装");
        Composite composite2=new Composite("女装");

        Leaf leaf1=new Leaf("衬衫");
        Leaf leaf2=new Leaf("夹克");
        Leaf leaf3=new Leaf("裙子");
        Leaf leaf4=new Leaf("套装");

        root.addChild(composite1);
        root.addChild(composite2);

        composite1.addChild(leaf1);
        composite1.addChild(leaf2);

        composite2.addChild(leaf3);
        composite2.addChild(leaf4);

        root.printStruct("");

    }
}
