package tba.dp.creational.prototype.register;

/**
 * Created by zhangdong on 2018-12-03.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Prototype prototype1=new ConcretePrototpyeA();
            PrototypeManager.setPrototype("p1",prototype1);
            Prototype prototype3=PrototypeManager.getPrototype("p1");
            prototype3.setName("zhang3");
            System.out.printf("第一个实例："+prototype3);
            Prototype prototype2=new ConcretePrototpyeB();
            PrototypeManager.setPrototype("p1",prototype2);
            Prototype prototype4=PrototypeManager.getPrototype("p1").clone();
            prototype4.setName("li4");
            System.out.printf("第二个实例："+prototype4);
            PrototypeManager.removePrototype("p1");
            Prototype prototype5=PrototypeManager.getPrototype("p1").clone();
            prototype5.setName("wang5");
            System.out.printf("第三个实例："+prototype5);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
